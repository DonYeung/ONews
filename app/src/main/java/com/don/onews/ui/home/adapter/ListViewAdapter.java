package com.don.onews.ui.home.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.don.onews.R;
import com.don.onews.bean.HomeData;
import com.xiaochao.lcrapiddeveloplibrary.BaseQuickAdapter;
import com.xiaochao.lcrapiddeveloplibrary.BaseViewHolder;

import java.util.List;

/**
 * Created by drcom on 2017/3/21.
 */

public class ListViewAdapter extends BaseQuickAdapter<HomeData.ResultBean.DataBean> {

    public ListViewAdapter(int layoutResId, List<HomeData.ResultBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeData.ResultBean.DataBean item) {
        Glide.with(mContext)
                .load(item.getThumbnail_pic_s())
                .crossFade()
                .placeholder(R.mipmap.ic_launcher)
                .into((ImageView) helper.getView(R.id.book_info_image_url));
        helper.setText(R.id.book_info_textview_name,item.getCategory());
        helper.setText(R.id.book_info_textview_author,item.getAuthor_name());
        helper.setText(R.id.book_info_textview_introduction,"标题:"+item.getTitle());
    }
}