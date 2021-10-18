#!/usr/bin/env bash

DIR="flask"
ZIP="all.zip"

rm $DIR/$ZIP 2>/dev/null
zip -r $ZIP $DIR
mv $ZIP $DIR
