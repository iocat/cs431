#!/bin/bash

if [[ $# -ne 2 ]]; then 
    echo "Needed 2 arguments"
    echo "Usage: 
                " $0 "host-address port-number"
    exit
fi

export ADDR=$1
export PORT=$2

for testnum in {1..3}
do
    printf "\n"
    echo ">>>TESTING FOR" $((10**$testnum)) "BYTES<<<"
    for i in {1..10}
    do
        java Client $ADDR  $PORT $((10**$testnum))
    done
done

