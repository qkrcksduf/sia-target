# docker.siadev.kr/dev/common-entity:base-21.06
FROM docker.siadev.kr/sia/python:3.7.7-poetry


COPY ./.pyproject.toml /pyproject.toml
RUN source $HOME/.poetry/env \
 && poetry config virtualenvs.in-project true \
 && poetry install

RUN mkdir /app
