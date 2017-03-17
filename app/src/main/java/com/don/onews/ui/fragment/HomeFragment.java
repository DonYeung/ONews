package com.don.onews.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.don.onews.R;
import com.don.onews.base.BaseFragment;
import com.xiaochao.lcrapiddeveloplibrary.viewtype.ProgressActivity;
import com.xiaochao.lcrapiddeveloplibrary.widget.SpringView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by drcom on 2017/3/17.
 */

public class HomeFragment extends BaseFragment {

    @BindView(R.id.rv_list)
    RecyclerView rvList;
    @BindView(R.id.springview)
    SpringView springview;
    @BindView(R.id.progress)
    ProgressActivity progress;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_home;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        progress.showContent();

    }

}
