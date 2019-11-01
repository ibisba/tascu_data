#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

gradle build -b "$DIR/build.gradle" 

cp $DIR/build/libs/*.jar $DIR/

#Comment: Null pointer issue

