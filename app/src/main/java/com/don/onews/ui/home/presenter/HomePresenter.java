package com.don.onews.ui.home.presenter;
import com.blankj.utilcode.utils.LogUtils;
import com.don.onews.bean.HomeData;
import com.don.onews.bean.NewsSummary;
import com.don.onews.ui.home.contract.HomeContract;
import com.don.onews.utils.baserx.RxSubscriber;
import com.orhanobut.logger.Logger;

import java.util.List;

/**
* Created by drcom on 2017/03/17
*/

public class HomePresenter extends HomeContract.Presenter  {
    private boolean isload;
    @Override
    public void loadHomeListDataRequest(String type, String key, int startPage,boolean isLoad) {
        isload =isLoad;
        mRxManage.add(mModel.loadHomeListData(type,key,startPage)
                .subscribe(new RxSubscriber<List<NewsSummary>>(mContext,false) {
            @Override
            protected void _onNext(List<NewsSummary> homeData) {

                if (isload){
                    //api 列表数据等于20即到底
                    if (homeData.size()==0){
                        mView.showLoadCompleteAllData();
                        mView.hideProgress();
                    }
                    else{
                        mView.addHomeListData(homeData);
                        mView.hideProgress();
                    }
                }
                else{

                    mView.returnHomeListData(homeData);
                    mView.hideProgress();

                }


            }

            @Override
            protected void _onError(String message) {
                LogUtils.d("message:"+message);
                mView.showLoadFailMsg(message);

            }
        }));

    }


}