#!/bin/bash

echo "Creating symlinks"
echo ""
echo "Installing pre-commit hook - We check if ktlint is ok"
echo ""
# relative folder path of the .git hook / current script
GIT_HOOK_DIR=../.git/hooks/pre-commit
# relative folder path of the custom hooks to deploy / .git hook folder
LNS_RELATIVE_PATH=../../hooks/pre-commit

if [ ! -h $GIT_HOOK_DIR -a -x $GIT_HOOK_DIR ]; then
  mv $GIT_HOOK_DIR $GIT_HOOK_DIR.local
fi

  ln -s -f $LNS_RELATIVE_PATH $GIT_HOOK_DIR

echo "Finish"
