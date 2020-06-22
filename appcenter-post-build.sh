if [ "$AGENT_JOBSTATUS" == "Succeeded" ]; then
  if [ "$APPCENTER_BRANCH" == "master" ]; then
    export ANDROID_PUBLISHER_CREDENTIALS=$PLAY_STORE_JSON
    ./gradlew app:publishBundle
  else
    echo "Current branch is $APPCENTER_BRANCH"
  fi
fi
