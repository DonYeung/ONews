package com.don.onews.ui.video.model;
import com.don.onews.api.Apiwrapper;
import com.don.onews.bean.GankVideoData;
import com.don.onews.bean.Video;
import com.don.onews.ui.video.contract.VideoContract;

import java.util.List;

import rx.Observable;

/**
* Created by drcom on 2017/03/22
*/

public class VideoModel implements VideoContract.Model{

    @Override
    public Observable<Video> loadVideoListData(String type, String category_id,int startPage) {
        return Apiwrapper.getInstance().getvideo(type, category_id,startPage);
    }
}