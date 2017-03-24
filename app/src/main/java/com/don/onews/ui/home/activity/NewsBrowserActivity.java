package com.don.onews.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.don.onews.R;
import com.don.onews.app.AppConstant;
import com.don.onews.base.BaseActivity;
import com.xiaochao.lcrapiddeveloplibrary.viewtype.ProgressActivity;
import com.xiaochao.lcrapiddeveloplibrary.widget.SpringView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by drcom on 2017/3/22.
 */

public class NewsBrowserActivity extends BaseActivity {
    @BindView(R.id.web_view)
    WebView webView;
    @BindView(R.id.springview)
    SpringView springview;
    @BindView(R.id.progress)
    ProgressActivity progress;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    public int getLayoutId() {
        return R.layout.act_news_browser;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        setWebViewSettings();
        setWebView();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    finishAfterTransition();
                } else {
                    finish();
                }
            }
        });
    }

    public static void startAction(Context context, String link, String title) {
        Intent intent = new Intent(context, NewsBrowserActivity.class);
        intent.putExtra(AppConstant.NEWS_LINK, link);
        intent.putExtra(AppConstant.NEWS_TITLE, title);
        context.startActivity(intent);
    }

    private void setWebViewSettings() {
        WebSettings webSettings = webView.getSettings();
        // 打开页面时， 自适应屏幕
        webSettings.setUseWideViewPort(true); //将图片调整到适合webview的大小
        webSettings.setLoadWithOverviewMode(true); // 缩放至屏幕的大小
        // 便页面支持缩放
        webSettings.setJavaScriptEnabled(true); //支持js
        webSettings.setSupportZoom(true); //支持缩放
//        webSettings.setBuiltInZoomControls(true); // 放大和缩小的按钮，容易引发异常 http://blog.csdn.net/dreamer0924/article/details/34082687

        webSettings.setAppCacheEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
    }

    private void setWebView() {
        webView.loadUrl(getIntent().getStringExtra(AppConstant.NEWS_LINK));
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url != null) view.loadUrl(url);
                return true;
            }
        });
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    //设置页面加载完 progress隐藏
                    try {
                        progress.showContent();
                    }catch (Exception e){

                    }

                } else {
                    try {
                        //设置页面为加载中..
                        progress.showLoading();
                    }catch (Exception e){

                    }

                }
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
//        webView.removeAllViews();

    }

}
