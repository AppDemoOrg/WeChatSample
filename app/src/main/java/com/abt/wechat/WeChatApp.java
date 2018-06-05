package com.abt.wechat;

import android.app.Application;
import android.content.Context;

import com.abt.wechat.util.WeChatUtil;

/**
 * @描述： @WeChatApp
 * @作者： @黄卫旗
 * @创建时间： @05/06/2018
 */
public class WeChatApp extends Application {

    private static Context mContext;

    public static Context getAppContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        WeChatUtil.reqToWx();
    }
}
