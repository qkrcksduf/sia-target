import os

from setuptools import setup


def find_packages(root="."):
    matches = []
    for path, dirnames, filenames in os.walk(root):
        if "__init__.py" in filenames:
            _path = path.split(os.path.sep, maxsplit=1)[-1].replace(os.path.sep, ".")
            matches.append(_path)
    return matches


install_requires = ["grpcio", "protobuf"]

packages = find_packages()

url = "https://dev.azure.com/si-analytics/dev/_git/common-entity"

setup(
    name="common-entity",
    version="0.2",
    description="",
    author="",
    url=url,
    install_requires=install_requires,
    packages=packages,
)
