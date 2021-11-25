#!/usr/bin/env bash

NUM=09
DIR="$NUM-indexes"
ZIP="all_$NUM.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
