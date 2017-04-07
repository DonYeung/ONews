package com.don.onews.ui.home.presenter;

import com.blankj.utilcode.utils.LogUtils;
import com.don.onews.bean.NewsDetail;
import com.don.onews.bean.NewsSummary;
import com.don.onews.ui.home.contract.NewsDetailContract;
import com.don.onews.utils.baserx.RxSubscriber;

import java.util.List;

/**
 * Created by drcom on 2017/4/7.
 */

public class NewsDetailPresenter extends NewsDetailContract.Presenter {
    @Override
    public void loadNewsDetailDataRequest(String postId) {
        mRxManage.add(mModel.loadNewsDetailData(postId)
                .subscribe(new RxSubscriber<NewsDetail>(mContext, false) {
                    @Override
                    protected void _onNext(NewsDetail newsDetail) {
                        if (newsDetail==null&&newsDetail.equals("")){
                            mView.showLoadCompleteAllData();
                            mView.hideProgress();
                        }else{
                            mView.returnNewsDetailData(newsDetail);
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
