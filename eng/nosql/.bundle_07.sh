#!/usr/bin/env bash

DIR="07-crud_with_pymongo"

rm $DIR/all.zip 2>/dev/null
zip -r all.zip $DIR
mv all.zip $DIR
