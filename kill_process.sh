#!/bin/bash

proc=com.android.phone

echo $proc

if [ "$1" != "" ]; then
        proc=$1
fi

echo $proc

procId=`adb shell ps | grep $proc | awk '{print $2}'`

adb shell kill $procId
