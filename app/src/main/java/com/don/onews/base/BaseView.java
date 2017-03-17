package com.don.onews.base;

/**
 * Created by drcom on 2017/3/16.
 */

public interface BaseView {
    /*******内嵌加载*******/
    void showLoading(String title);
    void stopLoading();
    void showErrorTip(String msg);
}