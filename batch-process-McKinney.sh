#! /bin/sh 
for f in "$1"/*; do
  if [ -f "$f" ]; then
    SIZE="$(du -sh "${f}" | cut -f1)"
    echo "Processing $f file..."
    echo "FILE SIZE: $SIZE"
    WORD_COUNT="$(wc -w "${f}" | cut -d' ' -f1)"
    echo "WORD COUNT: $WORD_COUNT"
 fi
done

