#!/usr/bin/env bash

DIR="numpy"
ZIP="all_$DIR.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
