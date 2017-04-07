package com.don.onews.ui.home.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.utils.LogUtils;
import com.don.onews.R;
import com.don.onews.app.AppConstant;
import com.don.onews.base.BaseFragment;
import com.don.onews.bean.NewsSummary;
import com.don.onews.ui.webview.WebViewBrowserActivity;
import com.don.onews.ui.home.adapter.ListViewAdapter;
import com.don.onews.ui.home.contract.HomeContract;
import com.don.onews.ui.home.model.HomeModel;
import com.don.onews.ui.home.presenter.HomePresenter;
import com.xiaochao.lcrapiddeveloplibrary.BaseQuickAdapter;
import com.xiaochao.lcrapiddeveloplibrary.container.RotationHeader;
import com.xiaochao.lcrapiddeveloplibrary.viewtype.ProgressActivity;
import com.xiaochao.lcrapiddeveloplibrary.widget.SpringView;

import java.util.List;

import butterknife.BindView;

/**
 * Created by drcom on 2017/3/17.
 */

public class HomeFragment extends BaseFragment<HomePresenter, HomeModel> implements HomeContract.View,BaseQuickAdapter.RequestLoadMoreListener,SpringView.OnFreshListener, BaseQuickAdapter.OnRecyclerViewItemClickListener {

    @BindView(R.id.rv_list)
    RecyclerView mRecyclerView;
    @BindView(R.id.springview)
    SpringView springview;
    @BindView(R.id.progress)
    ProgressActivity progress;

    private ListViewAdapter mQuickAdapter;
    private int PageIndex = 0;
    private String mNewsId;
    private String mNewsType;


    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_home;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @Override
    protected void initView() {
        if (getArguments() != null) {

            mNewsType = getArguments().getString(AppConstant.NEWS_TYPE);
            mNewsId = getArguments().getString(AppConstant.NEWS_ID);
        }

        //设置下拉刷新监听
        springview.setListener(this);
        //设置下拉刷新样式
        springview.setHeader(new RotationHeader(getActivity()));
        //springView.setFooter(new RotationFooter(this));mRecyclerView内部集成的自动加载  上啦加载用不上   在其他View使用
        //设置RecyclerView的显示模式  当前List模式
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //如果Item高度固定  增加该属性能够提高效率
        mRecyclerView.setHasFixedSize(true);
        //设置页面为加载中..
        progress.showLoading();
        mRecyclerView.setNestedScrollingEnabled(false);

        //设置适配器
        mQuickAdapter = new ListViewAdapter(R.layout.list_view_item_layout, null);
        //设置加载动画
        mQuickAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        //设置是否自动加载以及加载个数
        mQuickAdapter.openLoadMore(10, true);
        //将适配器添加到RecyclerView
        mRecyclerView.setAdapter(mQuickAdapter);
        //设置自动加载监听
        mQuickAdapter.setOnLoadMoreListener(this); //api只有一页数据
        //请求网络数据
        mPresenter.loadHomeListDataRequest(mNewsType, mNewsId, PageIndex,false);

        mQuickAdapter.setOnRecyclerViewItemClickListener(this);

    }

    @Override
    public void showProgress() {
        progress.showLoading();
    }

    @Override
    public void hideProgress() {
        progress.showContent();
    }

    @Override
    public void showLoadFailMsg(String msg) {
        //设置加载错误页显示
        progress.showError(getResources().getDrawable(R.mipmap.ic_launcher), AppConstant.ERROR_TITLE, AppConstant.ERROR_CONTEXT, AppConstant.ERROR_BUTTON, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PageIndex = 0;
                //请求网络数据
                mPresenter.loadHomeListDataRequest(mNewsType, mNewsId, PageIndex,false);
            }
        });
    }




    @Override
    public void returnHomeListData(List<NewsSummary> homeData) {
        LogUtils.d("homeData:" + homeData.get(0).getPtime());

        //进入显示的初始数据或者下拉刷新显示的数据
        mQuickAdapter.setNewData(homeData);//新增数据
        mQuickAdapter.openLoadMore(20, true);//设置是否可以下拉加载  以及加载条数
        springview.onFinishFreshAndLoad();//刷新完成

    }

    @Override
    public void addHomeListData(List<NewsSummary> homeDatas) {
        //新增自动加载的的数据
        mQuickAdapter.notifyDataChangedAfterLoadMore(homeDatas, true);
    }

    @Override
    public void onLoadMoreRequested() {
        PageIndex+=20;
        //请求网络数据
        mPresenter.loadHomeListDataRequest(mNewsType, mNewsId, PageIndex,true);
    }

    @Override
    public void onRefresh() {
        PageIndex = 0;
        mPresenter.loadHomeListDataRequest(mNewsType, mNewsId, PageIndex,false);
    }

    @Override
    public void onLoadmore() {

    }

    @Override
    public void onItemClick(View view, int position) {
//        Intent intent = new Intent(getActivity(), BookInfoActivity.class);
//        intent.putExtra("bookid", mQuickAdapter.getItem(position).getId());
//        startActivity(intent);
        String mNewsTitle = mQuickAdapter.getItem(position).getTitle();
        String mNewsLink = mQuickAdapter.getItem(position).getDigest();
        WebViewBrowserActivity.startAction(getActivity(), mNewsLink, mNewsTitle);
        LogUtils.d("点击："+mQuickAdapter.getItem(position).getTitle());

    }

    @Override
    public void showLoadCompleteAllData() {
        //所有数据加载完成后显示
        try {
            mQuickAdapter.notifyDataChangedAfterLoadMore(false);
            View view = getActivity().getLayoutInflater().inflate(R.layout.progress_loaded, (ViewGroup) mRecyclerView.getParent(), false);
            mQuickAdapter.addFooterView(view);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

}
