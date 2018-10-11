#!/usr/bin/env bash

NUM=04h
DIR="$NUM-homework-1"
ZIP="all_$NUM.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
