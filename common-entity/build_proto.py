import concurrent.futures
import fnmatch
import os
import shutil
import subprocess
import sys
from distutils.spawn import find_executable

PYTHON = find_executable("python")
PROTOC = find_executable("protoc")


def search_file(path, format):
    matches = []
    dirs = []
    for root, dirnames, filenames in os.walk(path):
        for dirname in dirnames:
            dirs.append(os.path.join(root, dirname))
        for filename in fnmatch.filter(filenames, f"*.{format}"):
            matches.append(os.path.join(root, filename))
    return matches, dirs


def set_eslint_disable(path):
    f = open(path, "r")
    temp = f.read()
    f.close()

    f = open(path, "w")
    f.write("/* eslint-disable */ \n")

    f.write(temp)
    f.close()


def build_proto_command(source, build):
    if build == "ts":
        protoc_command = [
            PROTOC,
            "-I.",
            "--js_out=import_style=commonjs,binary:.",
            "--grpc-web_out=import_style=typescript,mode=grpcwebtext:.",
        ]
    elif build == "go":
        protoc_command = [
            PROTOC,
            "-I.",
            f"--go_out=../../../../",
            f"--go-grpc_out=../../../../",
        ]
    else:
        protoc_command = [
            PYTHON,
            "-mgrpc_tools.protoc",
            "-I.",
            "--python_out=.",
            "--grpc_python_out=.",
        ]
    protoc_command.append(source)
    return protoc_command


def move(output, module):
    try:
        shutil.move(output, module)
    except shutil.Error as e:
        print(e)
        os.remove(output)


def generate_modules(modules):
    for module in modules:
        module_path = f"../../../{module}"
        if not os.path.exists(module_path):
            try:
                os.makedirs(module_path)
            except FileExistsError:
                pass
            f = open(f"{module_path}/__init__.py", "a")
            f.close()


def generate_proto(source, module, build):
    if not os.path.exists(source):
        return
    if not os.path.exists(module):
        try:
            os.makedirs(module)
        except FileExistsError:
            pass

    protoc_command = build_proto_command(source, build)
    if subprocess.call(protoc_command) != 0:
        sys.exit(-1)

    if build == "ts":
        js_output = source.replace(".proto", "_pb.js")
        dts_output = source.replace(".proto", "_pb.d.ts")
        service_client_output = source.replace(".proto", "ServiceClientPb.ts")
        set_eslint_disable(js_output)
        move(js_output, module)
        move(dts_output, module)
        if os.path.exists(service_client_output):
            set_eslint_disable(service_client_output)
            move(service_client_output, module)
    elif build == "go":
        pass
    else:
        py_output = source.replace(".proto", "_pb2.py")
        py_grpc_output = source.replace(".proto", "_pb2_grpc.py")

        move(py_output, module)
        if os.path.exists(py_grpc_output):
            move(py_grpc_output, module)


if __name__ == "__main__":
    build = None
    if len(sys.argv) > 1 and sys.argv[1] == "ts":
        build = "ts"
    elif len(sys.argv) > 1 and sys.argv[1] == "go":
        build = "go"

    dirname = os.path.dirname(sys.argv[0])
    if dirname != "":
        os.chdir(dirname)

    try:
        shutil.rmtree("com")
    except:
        pass
    os.chdir("src/main/proto/")

    proto_list, proto_dirs = search_file("com", "proto")
    print(f"Number of proto files: {len(proto_list)}")
    if build != "ts":
        print(f"Number of proto modules: {len(proto_dirs)}")
        generate_modules(proto_dirs)

    _total = len(proto_list)
    _count = 0
    _percentage = 0

    with concurrent.futures.ThreadPoolExecutor(max_workers=128) as executor:
        future_task = [
            executor.submit(
                generate_proto,
                proto_path,
                os.path.join("../../../", os.path.dirname(proto_path)),
                build,
            )
            for proto_path in proto_list
        ]

        for future in concurrent.futures.as_completed(future_task):
            future.result()
            _count += 1
            _percentage = _count / len(proto_list) * 100
            progress_bar = "*" * int(_percentage / 2) + "_" * (50 - int(_percentage / 2))
            print(f"{_percentage:.2f}% |{progress_bar}| {_count}/{_total}", end="\r")

    print()
    print("Done.")
