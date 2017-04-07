package com.don.onews.ui.home.contract;

import com.don.onews.base.BaseModel;
import com.don.onews.base.BasePresenter;
import com.don.onews.base.BaseView;
import com.don.onews.bean.NewsDetail;
import com.don.onews.bean.NewsSummary;

import java.util.List;

import rx.Observable;

/**
 * Created by drcom on 2017/4/7.
 */

public interface NewsDetailContract {
    interface Model extends BaseModel {
        //请求获取新闻详情
        Observable<NewsDetail> loadNewsDetailData(String postId);
    }

    interface View extends BaseView {
        void returnNewsDetailData(NewsDetail homeData);
    }


    abstract static class Presenter extends BasePresenter<NewsDetailContract.View, NewsDetailContract.Model> {
        public abstract void loadNewsDetailDataRequest(String postId);
    }

}
