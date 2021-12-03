#!/usr/bin/env bash

NUM=13
DIR="week_$NUM"
ZIP="all_$NUM.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
