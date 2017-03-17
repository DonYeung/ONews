package com.don.onews.api;

import android.support.annotation.NonNull;

import com.blankj.utilcode.utils.NetworkUtils;
import com.don.onews.app.AppConstant;
import com.don.onews.app.Application;
import com.don.onews.base.BaseApplication;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by drcom on 2017/3/17.
 */
public class OkHttp3Utils {
    private static OkHttpClient mOkHttpClient;


    /**
     * 获取OkHttpClient对象
     */
    public static OkHttpClient getOkHttpClient() {
        //是否开启Log
        HttpLoggingInterceptor interceptorLog = new HttpLoggingInterceptor();
        if(AppConstant.IsRelease)
            interceptorLog.setLevel(HttpLoggingInterceptor.Level.NONE);
        else
            interceptorLog.setLevel(HttpLoggingInterceptor.Level.BODY);

        //缓存
        File cacheFile = new File(BaseApplication.getAppContext().getCacheDir(), "cache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100); //100Mb

        if (null == mOkHttpClient) {

            //同样okhttp3后也使用build设计模式
            mOkHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .addInterceptor(interceptorLog)
                    .cache(cache)
                    .build();

        }

        return mOkHttpClient;
    }

    /**
     * 根据网络状况获取缓存的策略
     */
    @NonNull
    public static boolean getCacheControl() {
        return NetworkUtils.isConnected();
    }
}

