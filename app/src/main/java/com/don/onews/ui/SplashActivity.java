package com.don.onews.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import com.baidu.mobads.AppActivity;
import com.baidu.mobads.SplashAd;
import com.baidu.mobads.SplashAdListener;
import com.blankj.utilcode.utils.LogUtils;
import com.don.onews.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by drcom on 2017/3/16.
 */

public class SplashActivity extends Activity {
    @BindView(R.id.adsRl)
    RelativeLayout adsRl;


//    @Override
//    public int getLayoutId() {
//        return R.layout.activity_welcome;
//    }


    //    @Override
//    public void initPresenter() {
//
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
//    }
//
//    @Override
//    public void initView() {
        // 设置'广告着陆页'动作栏的颜色主题
        AppActivity.setActionBarColorTheme(AppActivity.ActionBarColorTheme.ACTION_BAR_WHITE_THEME);

        // the observer of AD
        SplashAdListener listener = new SplashAdListener() {
            @Override
            public void onAdDismissed() {
                Log.i("RSplashActivity", "onAdDismissed");
                jumpWhenCanClick(); // 跳转至您的应用主界面
            }

            @Override
            public void onAdFailed(String arg0) {
                Log.i("RSplashActivity", "onAdFailed");
                LogUtils.i("arg0:"+arg0);
                jump();
            }

            @Override
            public void onAdPresent() {
                Log.i("RSplashActivity", "onAdPresent");
            }

            @Override
            public void onAdClick() {
                Log.i("RSplashActivity", "onAdClick");
                // 设置开屏可接受点击时，该回调可用
            }
        };
        String adPlaceId = "2058622"; // 重要：请填上您的广告位ID，代码位错误会导致无法请求到广告
        new SplashAd(this, adsRl, listener, adPlaceId, true);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(SplashActivity.this, MainActivity.class));
//                finish();
//            }
//        }, 2000);


    }

    /**
     * 当设置开屏可点击时，需要等待跳转页面关闭后，再切换至您的主窗口。故此时需要增加canJumpImmediately判断。 另外，点击开屏还需要在onResume中调用jumpWhenCanClick接口。
     */
    public boolean canJumpImmediately = false;

    private void jumpWhenCanClick() {
        Log.d("test", "this.hasWindowFocus():" + this.hasWindowFocus());
        if (canJumpImmediately) {
            this.startActivity(new Intent(SplashActivity.this, MainActivity.class));
            this.finish();
        } else {
            canJumpImmediately = true;
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        canJumpImmediately = false;
    }

    /**
     * 不可点击的开屏，使用该jump方法，而不是用jumpWhenCanClick
     */
    private void jump() {
        this.startActivity(new Intent(SplashActivity.this, MainActivity.class));
        this.finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (canJumpImmediately) {
            jumpWhenCanClick();
        }
        canJumpImmediately = true;
    }


}
