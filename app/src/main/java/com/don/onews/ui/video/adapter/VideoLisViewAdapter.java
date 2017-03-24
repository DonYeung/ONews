package com.don.onews.ui.video.adapter;

import android.text.TextUtils;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.don.onews.R;
import com.don.onews.app.Application;
import com.don.onews.base.BaseFragment;
import com.don.onews.bean.GankVideoData;
import com.don.onews.bean.Video;
import com.xiaochao.lcrapiddeveloplibrary.BaseQuickAdapter;
import com.xiaochao.lcrapiddeveloplibrary.BaseViewHolder;
import com.xiaochao.lcrapiddeveloplibrary.Video.JCVideoPlayer;
import com.xiaochao.lcrapiddeveloplibrary.Video.JCVideoPlayerStandard;

import java.util.List;

/**
 * Created by drcom on 2017/3/23.
 */

public class VideoLisViewAdapter extends BaseQuickAdapter<Video.DataBean> {

    public VideoLisViewAdapter(int layoutResId, List<Video.DataBean> data) {
        super(layoutResId, data);
    }

    public VideoLisViewAdapter(List<Video.DataBean> data) {
        super(data);
    }

    public VideoLisViewAdapter(View contentView, List<Video.DataBean> data) {
        super(contentView, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Video.DataBean item) {
//        ((JCVideoPlayerStandard)helper.getView(R.id.video_list_item_playr)).setUp(item.getVideo_url(),item.getName());
//        helper.setImageRoundUrl(R.id.iv_logo,item.getImg_url());
        helper.setText(R.id.video_list_item_text_title,item.getTime());
        helper.setText(R.id.tv_play_time,String.format(mContext.getResources().getString(R.string.video_play_times), String.valueOf(item.getView_count())));
        //对视频的赋值 添加视频播放地址(使用原地址  .mp4之类的  这个要注意)和标题
        ((JCVideoPlayerStandard)helper.getView(R.id.video_list_item_playr)).setUp(item.getVideo_url(),item.getName());
        Glide.with(mContext)
                .load(item.getImg_url())
                .crossFade()
                .placeholder(R.mipmap.ic_empty_picture)
                .into((((JCVideoPlayerStandard) helper.getView(R.id.video_list_item_playr)).thumbImageView));
    }


}