#!/usr/bin/env bash

NUM=08
DIR="$NUM-schema-design"
ZIP="all_$NUM.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
