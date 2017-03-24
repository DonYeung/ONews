package com.don.onews.ui.home.model;

import com.don.onews.api.Apiwrapper;
import com.don.onews.bean.HomeData;
import com.don.onews.ui.home.contract.HomeContract;

import rx.Observable;

/**
 * Created by drcom on 2017/03/17
 */

public class HomeModel implements HomeContract.Model {

    @Override
    public Observable<HomeData.ResultBean> loadHomeListData(String type, String key, int startPage) {
        return Apiwrapper.getInstance().getHomeTop(type, key, startPage);
    }
}

