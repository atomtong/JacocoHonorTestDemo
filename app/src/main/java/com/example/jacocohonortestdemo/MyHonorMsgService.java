package com.example.jacocohonortestdemo;

import com.hihonor.push.sdk.HonorMessageService;
import com.hihonor.push.sdk.HonorPushDataMsg;

public class MyHonorMsgService extends HonorMessageService {
    //Token发生变化时，会以onNewToken方法返回
    @Override
    public void onNewToken(String pushToken) {
        // TODO: 处理新token。
    }

    @Override
    public void onMessageReceived(HonorPushDataMsg msg) {
        // TODO: 处理收到的透传消息。
    }
}