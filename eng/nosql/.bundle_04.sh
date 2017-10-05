#!/usr/bin/env bash

DIR="04-crud"

rm $DIR/all.zip 2>/dev/null
zip -r all.zip $DIR
mv all.zip $DIR
