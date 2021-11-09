FROM docker.siadev.kr/dev/common-entity:base-21.06

COPY . /app
WORKDIR /app

RUN poetry run python build_proto.py \
 && poetry run pip install --no-cache-dir .
