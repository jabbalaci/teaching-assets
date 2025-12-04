#!/usr/bin/env bash

NUM=14
DIR="week_$NUM"
ZIP="all_$NUM.zip"

find $DIR | grep "index\.html" | while read i; do rm $i; done

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
