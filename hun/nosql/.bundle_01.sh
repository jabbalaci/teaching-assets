#!/usr/bin/env bash

DIR="01-introduction"

rm $DIR/all.zip 2>/dev/null
zip -r all.zip $DIR
mv all.zip $DIR
