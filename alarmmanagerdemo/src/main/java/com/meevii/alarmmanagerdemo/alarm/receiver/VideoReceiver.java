package com.meevii.alarmmanagerdemo.alarm.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class VideoReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("VideoReceiver", "VideoReceiver:" + System.currentTimeMillis());
    }
}
