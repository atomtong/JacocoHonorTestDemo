package com.example.jacocohonortestdemo;

import android.app.Application;
import android.util.Log;

import com.hihonor.push.sdk.HonorPushClient;

public class SdkApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        boolean isSupport = HonorPushClient.getInstance().checkSupportHonorPush(getApplicationContext());
        if (isSupport) {
            HonorPushClient.getInstance().init(getApplicationContext(), true);
            Log.e("SdkApplication", "init ok ");
            // TODO: 使用荣耀推送服务能力
        }
        Log.e("SdkApplication", "isSupport-> " + isSupport);
    }
}