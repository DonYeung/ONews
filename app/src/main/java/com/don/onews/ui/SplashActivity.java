package com.don.onews.ui;

import android.content.Intent;
import android.os.Handler;

import com.don.onews.R;
import com.don.onews.base.BaseActivity;

/**
 * Created by drcom on 2017/3/16.
 */

public class SplashActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_welcome;
    }


    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 2000);


    }


}
