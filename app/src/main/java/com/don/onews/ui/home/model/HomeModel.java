package com.don.onews.ui.home.model;

import com.don.onews.api.Apiwrapper;
import com.don.onews.bean.HomeData;
import com.don.onews.ui.home.contract.HomeContract;

import rx.Observable;
import rx.Observer;

/**
 * Created by drcom on 2017/03/17
 */

public class HomeModel implements HomeContract.Model {
    final OnLoadDataListListener listener;

    public HomeModel(OnLoadDataListListener listener) {
        this.listener = listener;
    }

    @Override
    public Observable<HomeData> loadHomeListData(String type, String key, int startPage) {
        return Apiwrapper.getInstance().getHomeTop(type, key, startPage, new Observer<HomeData>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                listener.onFailure(e);
            }

            @Override
            public void onNext(HomeData homeData) {
                listener.onSuccess(homeData);

            }
        });
    }
}