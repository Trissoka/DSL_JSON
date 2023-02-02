#!/bin/bash
docker run -v ${PWD}:/app -w /app/ dsl_jq ./foo.sh
