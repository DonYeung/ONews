package com.don.onews.ui.home.presenter;
import com.don.onews.bean.HomeData;
import com.don.onews.ui.home.contract.HomeContract;
import com.don.onews.ui.home.model.OnLoadDataListListener;

import java.util.List;

/**
* Created by drcom on 2017/03/17
*/

public class HomePresenter extends HomeContract.Presenter implements OnLoadDataListListener<HomeData> {

    @Override
    public void loadHomeListDataRequest(String type, String key, int startPage) {
        mModel.loadHomeListData(type,key,startPage);
    }

    @Override
    public void onSuccess(HomeData data) {
        mView.returnHomeListData(data);
        mView.hideProgress();
    }

    @Override
    public void onFailure(Throwable e) {
        mView.showLoadFailMsg();

    }
}