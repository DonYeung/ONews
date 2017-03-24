package com.don.onews.ui.home.fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.don.onews.R;
import com.don.onews.app.AppConstant;
import com.don.onews.base.BaseFragment;
import com.don.onews.base.BaseFragmentAdapter;
import com.don.onews.utils.MyUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by drcom on 2017/3/21.
 */

public class HomeMainFragment extends BaseFragment {
//    @BindView(R.id.toolbar)
//    Toolbar toolbar;
    @BindView(R.id.tabs)
    TabLayout tabs;
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    private BaseFragmentAdapter fragmentAdapter;

    @Override
    protected int getLayoutResource() {
        return R.layout.app_bar_home;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        ArrayList<String> channelType = new ArrayList<>();
        channelType.add(0,"top");
        channelType.add(1,"shehui");
        channelType.add(2,"guonei");
        channelType.add(3,"guoji");
        channelType.add(4,"yule");
        channelType.add(5,"tiyu");
        channelType.add(6,"junshi");
        channelType.add(7,"keji");
        channelType.add(8,"caijing");
        channelType.add(9,"shishang");
        ArrayList<String> channelName = new ArrayList<>();
        channelName.add(0,"头条");
        channelName.add(1,"社会");
        channelName.add(2,"国内");
        channelName.add(3,"国际");
        channelName.add(4,"娱乐");
        channelName.add(5,"体育");
        channelName.add(6,"军事");
        channelName.add(7,"科技");
        channelName.add(8,"财经");
        channelName.add(9,"时尚");

        List<Fragment> mNewsFragmentList = new ArrayList<>();
        for (int i = 0; i < channelType.size(); i++) {
            mNewsFragmentList.add(createListFragments(channelType.get(i)));
        }

        fragmentAdapter = new BaseFragmentAdapter(getChildFragmentManager(), mNewsFragmentList, channelName);
        viewPager.setAdapter(fragmentAdapter);
        tabs.setupWithViewPager(viewPager);
        MyUtils.dynamicSetTabLayoutMode(tabs);
        setPageChangeListener();

    }
    private void setPageChangeListener() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    private HomeFragment createListFragments( String channelType) {
        HomeFragment fragment = new HomeFragment();

        Bundle bundle = new Bundle();
        bundle.putString(AppConstant.HOME_TYPE, channelType);
        fragment.setArguments(bundle);
        return fragment;
    }
}
