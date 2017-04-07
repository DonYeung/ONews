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
        channelType.add(0,"headline");
        channelType.add(1,"list");
        channelType.add(2,"list");
        channelType.add(3,"list");
        channelType.add(4,"list");
        channelType.add(5,"list");
        channelType.add(6,"list");
        channelType.add(7,"list");
        ArrayList<String> channelId = new ArrayList<>();
        channelId.add(0,"T1348647909107");
        channelId.add(1,"T1348649580692");
        channelId.add(2,"T1348648756099");
        channelId.add(3,"T1348648141035");
        channelId.add(4,"T1348649079062");
        channelId.add(5,"T1348648517839");
        channelId.add(6,"T1348648650048");
        channelId.add(7,"T1370583240249");
        ArrayList<String> channelName = new ArrayList<>();
        channelName.add(0,"头条");
        channelName.add(1,"科技");
        channelName.add(2,"财经");
        channelName.add(3,"军事");
        channelName.add(4,"体育");
        channelName.add(5,"娱乐");
        channelName.add(6,"电影");
        channelName.add(7,"精选");

        List<Fragment> mNewsFragmentList = new ArrayList<>();
        for (int i = 0; i < channelType.size(); i++) {
            mNewsFragmentList.add(createListFragments(channelId.get(i),channelType.get(i)));
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
    private HomeFragment createListFragments( String chanelId,String channelType) {
        HomeFragment fragment = new HomeFragment();

        Bundle bundle = new Bundle();
        bundle.putString(AppConstant.NEWS_TYPE, channelType);
        bundle.putString(AppConstant.NEWS_ID, chanelId);
        fragment.setArguments(bundle);
        return fragment;
    }
}
