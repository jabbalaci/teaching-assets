#!/usr/bin/env bash

DIR="numpy-megoldasok"
ZIP="all_$DIR.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
