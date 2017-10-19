#!/usr/bin/env bash

DIR="04h-homework-1"

rm $DIR/all.zip 2>/dev/null
zip -r all.zip $DIR
mv all.zip $DIR
