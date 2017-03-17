package com.don.onews.ui.home.contract;

import com.don.onews.base.BaseModel;
import com.don.onews.base.BasePresenter;
import com.don.onews.base.BaseView;
import com.don.onews.bean.HomeData;

import java.util.List;

import rx.Observable;

/**
 * Created by drcom on 2017/3/17.
 */

public interface HomeContract {
    interface Model extends BaseModel {
        //请求获取视频
        Observable<HomeData> loadHomeListData(String type, String key,int startPage);
    }

    interface View extends BaseView {
        void returnHomeListData(HomeData homeData);
    }


    abstract static class Presenter extends BasePresenter<View, Model> {
        public abstract void loadHomeListDataRequest(String type, String key,int startPage);
    }


}