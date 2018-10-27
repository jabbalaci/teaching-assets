#!/usr/bin/env bash

NUM=02
DIR="$NUM-numpy"
ZIP="all_$NUM.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
