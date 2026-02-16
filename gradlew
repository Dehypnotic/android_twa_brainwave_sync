#!/usr/bin/env sh
set -e

BASEDIR=$(cd "$(dirname "$0")"; pwd)

JAVA_EXEC="${JAVA_HOME:-}/bin/java"
if [ ! -x "$JAVA_EXEC" ]; then
  JAVA_EXEC="java"
fi

exec "$JAVA_EXEC" -jar "$BASEDIR/gradle/wrapper/gradle-wrapper.jar" "$@"

