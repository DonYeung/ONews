package com.don.onews.ui.webview;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import com.don.onews.R;
import com.don.onews.app.AppConstant;
import com.don.onews.base.BaseActivity;
import com.xiaochao.lcrapiddeveloplibrary.viewtype.ProgressActivity;
import com.xiaochao.lcrapiddeveloplibrary.widget.SpringView;

import butterknife.BindView;

/**
 * Created by drcom on 2017/3/22.
 */

public class WebViewBrowserActivity extends BaseActivity {
    @BindView(R.id.web_view)
    WebView webView;
    @BindView(R.id.springview)
    SpringView springview;
    @BindView(R.id.progress)
    ProgressActivity progress;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.webViewLayout)
    LinearLayout webViewLayout;

    @Override
    public int getLayoutId() {
        return R.layout.act_web_browser;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        webView = new WebView(mContext);
        webViewLayout.addView(webView);
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
        Intent intent = new Intent(context, WebViewBrowserActivity.class);
        intent.putExtra(AppConstant.NEWS_LINK, link);
        intent.putExtra(AppConstant.NEWS_TITLE, title);
        context.startActivity(intent);
    }

    private void setWebViewSettings() {
        WebSettings webSettings = webView.getSettings();

        webSettings.setUseWideViewPort(true); //设置此属性，可任意比例缩放
        webSettings.setLoadWithOverviewMode(true); // 适配缩放至屏幕的大小
        webSettings.setJavaScriptEnabled(true); //支持js
        webSettings.setSupportZoom(true); //支持缩放
        webSettings.setAppCacheEnabled(true);//开启 Application Caches 功能
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);//设置 缓存模式
        webSettings.setBlockNetworkImage(true);//关闭加载网络图片，在一开始加载的时候可以设置为true，当加载完网页的时候再设置为false
//        webSettings.setBuiltInZoomControls(true); // 放大和缩小的按钮，容易引发异常 http://blog.csdn.net/dreamer0924/article/details/34082687
    }

    private void setWebView() {
        webView.loadUrl(getIntent().getStringExtra(AppConstant.NEWS_LINK));
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url != null) view.loadUrl(url);
                //需要设置在当前WebView中显示网页，才不会跳到默认的浏览器进行显示
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
                    } catch (Exception e) {

                    }

                } else {
                    try {
                        //设置页面为加载中..
                        progress.showLoading();
                    } catch (Exception e) {

                    }

                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (webView != null) {
            webView.onPause();
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (webView != null) {
            webView.onResume();
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (webView != null) {
            webView.clearCache(true); //清空缓存
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                if (webViewLayout != null) {
                    webViewLayout.removeView(webView);
                }
                webView.removeAllViews();
                webView.destroy();
            } else {
                webView.removeAllViews();
                webView.destroy();
                if (webViewLayout != null) {
                    webViewLayout.removeView(webView);
                }
            }
            webView = null;
        }

    }


}
