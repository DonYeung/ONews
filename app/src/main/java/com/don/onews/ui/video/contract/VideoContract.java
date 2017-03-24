package com.don.onews.ui.video.contract;

import com.don.onews.base.BaseModel;
import com.don.onews.base.BasePresenter;
import com.don.onews.base.BaseView;
import com.don.onews.bean.GankVideoData;
import com.don.onews.bean.Video;

import java.util.List;

import rx.Observable;

/**
 * Created by drcom on 2017/3/22.
 */

public interface VideoContract {
    interface Model extends BaseModel {
    //请求获取视频
//    Observable<GankVideoData> loadVideoListData(String type, int startPage);
    Observable<Video> loadVideoListData(String type,String category_id, int startPage);
}

    interface View extends BaseView {
//        void returnVideoListData(GankVideoData videoDatas);
//        void addVideoListData(GankVideoData videoDatas);
        void returnVideoListData(Video videoDatas);
        void addVideoListData(Video videoDatas);

    }


    abstract static class Presenter extends BasePresenter<VideoContract.View, VideoContract.Model> {
        public abstract void loadVideoListDataRequest(String type, String category_id,int startPage,boolean isLoad);
    }


}