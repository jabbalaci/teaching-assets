#!/usr/bin/env bash

NUM=07
DIR="$NUM-crud_with_pymongo"
ZIP="all_$NUM.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
