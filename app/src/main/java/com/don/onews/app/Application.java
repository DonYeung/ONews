package com.don.onews.app;

import android.app.Activity;
import android.content.Context;

import com.blankj.utilcode.utils.LogUtils;
import com.don.onews.BuildConfig;
import com.don.onews.base.BaseApplication;
import com.tencent.bugly.crashreport.CrashReport;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by drcom on 2017/3/16.
 */

public class Application extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        //Bugly 异常上报
        //第三个参数为：测试阶段设置成true，发布时设置为false。
        CrashReport.initCrashReport(getApplicationContext(), "1a4f584cf6", true);
    }
}

