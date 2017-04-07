package com.don.onews.ui.home.model;

import com.don.onews.api.Apiwrapper;
import com.don.onews.bean.NewsDetail;
import com.don.onews.ui.home.contract.NewsDetailContract;

import rx.Observable;

/**
 * Created by drcom on 2017/4/7.
 */

public class NewsDetailModel implements NewsDetailContract.Model {
    @Override
    public Observable<NewsDetail> loadNewsDetailData(String postId) {
        return Apiwrapper.getInstance().getNewDetail(postId);
    }
}
