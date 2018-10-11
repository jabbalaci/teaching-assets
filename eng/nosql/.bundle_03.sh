#!/usr/bin/env bash

NUM=03
DIR="$NUM-flask"
ZIP="all_$NUM.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
