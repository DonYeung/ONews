package com.don.onews.ui.home.presenter;
import com.don.onews.bean.HomeData;
import com.don.onews.ui.home.contract.HomeContract;
import com.don.onews.utils.baserx.RxSubscriber;

/**
* Created by drcom on 2017/03/17
*/

public class HomePresenter extends HomeContract.Presenter  {

    @Override
    public void loadHomeListDataRequest(String type, String key, int startPage) {
        mRxManage.add(mModel.loadHomeListData(type,key,startPage)
                .subscribe(new RxSubscriber<HomeData.ResultBean>(mContext,false) {
            @Override
            protected void _onNext(HomeData.ResultBean homeData) {
                mView.returnHomeListData(homeData);
                mView.hideProgress();
            }

            @Override
            protected void _onError(String message) {
                mView.showLoadFailMsg(message);

            }
        }));

    }


}