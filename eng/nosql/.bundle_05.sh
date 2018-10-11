#!/usr/bin/env bash

NUM=05
DIR="$NUM-crud"
ZIP="all_$NUM.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
