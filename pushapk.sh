#!/bin/bash

package=VzwSipService
#source=build/outputs/apk/Telephony-release.apk
#target=system/priv-app/Telephony/Telephony.apk
source=build/outputs/apk/$package-release.apk
target=system/priv-app/$package/$package.apk
echo "push "$package".apk"

adb remount
adb push $source $target
