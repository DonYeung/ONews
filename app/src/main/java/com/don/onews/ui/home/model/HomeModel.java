package com.don.onews.ui.home.model;

import com.don.onews.api.Apiwrapper;
import com.don.onews.bean.HomeData;
import com.don.onews.bean.NewsSummary;
import com.don.onews.ui.home.contract.HomeContract;

import java.util.List;

import rx.Observable;

/**
 * Created by drcom on 2017/03/17
 */

public class HomeModel implements HomeContract.Model {

    @Override
    public Observable<List<NewsSummary>> loadHomeListData(String type, String key, int startPage) {
        return Apiwrapper.getInstance().getNewsList(type, key, startPage);
    }
}

