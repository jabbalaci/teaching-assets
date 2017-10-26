#!/usr/bin/env bash

DIR="06-crud"

rm $DIR/all.zip 2>/dev/null
zip -r all.zip $DIR
mv all.zip $DIR
