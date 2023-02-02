#!/bin/bash
docker run -v ${PWD}:/app -w /app/ dsl_py python3 ./foo.py
