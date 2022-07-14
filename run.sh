#!/bin/bash
JAR_NAME='demo-0.0.1-SNAPSHOT.jar'

java -Dfile.encoding=utf-8 -jar ${JAR_NAME} |tee ./catalina.out