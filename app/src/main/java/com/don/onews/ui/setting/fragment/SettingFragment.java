package com.don.onews.ui.setting.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.don.onews.R;
import com.don.onews.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by drcom on 2017/3/17.
 */

public class SettingFragment extends BaseFragment {
    @BindView(R.id.message)
    TextView message;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_setting;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {

    }

}
