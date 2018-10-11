#!/usr/bin/env bash

NUM=10
DIR="$NUM-redis"
ZIP="all_$NUM.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
