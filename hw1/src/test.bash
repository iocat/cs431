#!/bin/bash

export PORT=12423

java Server $PORT &
for testnum in {1..3}
do
    printf "\n"
    echo "TESTING FOR" $((10**$testnum)) "BYTES"
    for i in {1..10}
    do
        java Client localhost $PORT $((10**$testnum))
    done
done

killall java
