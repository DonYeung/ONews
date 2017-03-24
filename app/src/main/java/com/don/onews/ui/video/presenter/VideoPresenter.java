package com.don.onews.ui.video.presenter;
import android.util.Log;

import com.blankj.utilcode.utils.LogUtils;
import com.don.onews.bean.GankVideoData;
import com.don.onews.bean.Video;
import com.don.onews.ui.video.contract.VideoContract;
import com.don.onews.utils.baserx.RxSubscriber;

import java.util.List;

/**
* Created by drcom on 2017/03/22
*/

public class VideoPresenter extends VideoContract.Presenter {
    private boolean isload;
    @Override
    public void loadVideoListDataRequest(String type, String category_id,int startPage,  boolean isLoad) {
        isload =isLoad;

        mRxManage.add(mModel.loadVideoListData(type,category_id,startPage)
                .subscribe(new RxSubscriber<Video>(mContext,false) {
                    @Override
                    protected void _onNext(Video videoDatas) {
                        LogUtils.d("isload:"+isload);
                        if (isload){

                            if (videoDatas.getData().size()==0){
                                mView.showLoadCompleteAllData();
                                mView.hideProgress();
                            }
                            else{
                                mView.addVideoListData(videoDatas);
                                mView.hideProgress();
                            }
                        }
                        else{

                                mView.returnVideoListData(videoDatas);
                                mView.hideProgress();

                        }

                    }

                    @Override
                    protected void _onError(String message) {
                        LogUtils.d("message"+message);
                        mView.showLoadFailMsg(message);
                    }
                }));
    }
}