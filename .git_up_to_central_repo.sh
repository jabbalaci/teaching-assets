#!/usr/bin/env bash

git status
echo

echo "# Step 1) git add -A ."
echo "Press ENTER to continue..."; read
git add -A .

git status
echo

echo "# Step 2) git commit"
echo "Press ENTER to continue..."; read
git commit

git status
echo

echo "# Step 3) git push"
echo "Press ENTER to continue..."; read
git push

git status
