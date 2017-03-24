package com.don.onews.ui.video.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.utils.LogUtils;
import com.blankj.utilcode.utils.ToastUtils;
import com.don.onews.R;
import com.don.onews.app.AppConstant;
import com.don.onews.base.BaseFragment;
import com.don.onews.bean.GankVideoData;
import com.don.onews.bean.Video;
import com.don.onews.ui.video.adapter.VideoLisViewAdapter;
import com.don.onews.ui.video.contract.VideoContract;
import com.don.onews.ui.video.model.VideoModel;
import com.don.onews.ui.video.presenter.VideoPresenter;
import com.xiaochao.lcrapiddeveloplibrary.BaseQuickAdapter;
import com.xiaochao.lcrapiddeveloplibrary.Video.JCVideoPlayer;
import com.xiaochao.lcrapiddeveloplibrary.container.RotationHeader;
import com.xiaochao.lcrapiddeveloplibrary.viewtype.ProgressActivity;
import com.xiaochao.lcrapiddeveloplibrary.widget.SpringView;

import butterknife.BindView;

/**
 * Created by drcom on 2017/3/22.
 */

public class VideoFragment extends BaseFragment<VideoPresenter, VideoModel> implements VideoContract.View, BaseQuickAdapter.RequestLoadMoreListener, SpringView.OnFreshListener, BaseQuickAdapter.OnRecyclerViewItemClickListener {

    @BindView(R.id.rv_list)
    RecyclerView mRecyclerView;
    @BindView(R.id.springview)
    SpringView springview;
    @BindView(R.id.progress)
    ProgressActivity progress;
    private int PageIndex = 1;
    private String mVideoType;

    private VideoLisViewAdapter mQuickAdapter;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_video;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @Override
    protected void initView() {
        //设置下拉刷新监听
        springview.setListener(this);
        //设置下拉刷新样式
        springview.setHeader(new RotationHeader(getActivity()));
        //springView.setFooter(new RotationFooter(this));mRecyclerView内部集成的自动加载  上啦加载用不上   在其他View使用
        //设置RecyclerView的显示模式  当前List模式
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //如果Item高度固定  增加该属性能够提高效率
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setNestedScrollingEnabled(false);
        //设置页面为加载中..
        progress.showLoading();


        //设置适配器
        mQuickAdapter = new VideoLisViewAdapter(R.layout.video_list_view_item_layout, null);
        //设置加载动画
        mQuickAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        //设置是否自动加载以及加载个数
        mQuickAdapter.openLoadMore(10, true);
        //将适配器添加到RecyclerView
        mRecyclerView.setAdapter(mQuickAdapter);
        //设置自动加载监听
        mQuickAdapter.setOnLoadMoreListener(this);

        //请求网络数据
//        mPresenter.loadVideoListDataRequest(AppConstant.DATA_TYPE_REST_VIDEO, PageIndex,false);
        mPresenter.loadVideoListDataRequest("0", "0", PageIndex,false);

        mQuickAdapter.setOnRecyclerViewItemClickListener(new BaseQuickAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                ToastUtils.showShortToast("点击："+position);
            }
        });

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
                PageIndex = 1;
                //请求网络数据
//                mPresenter.loadVideoListDataRequest(AppConstant.DATA_TYPE_REST_VIDEO, PageIndex,false);
                mPresenter.loadVideoListDataRequest("0", "0", PageIndex,false);
            }
        });
    }


    @Override
    public void onItemClick(View view, int position) {

    }

    @Override
    public void returnVideoListData(Video videoDatas) {
        LogUtils.d("videoDatas:" + videoDatas.getData().get(0).getVideo_url());

        //进入显示的初始数据或者下拉刷新显示的数据
        mQuickAdapter.setNewData(videoDatas.getData());//新增数据
        mQuickAdapter.openLoadMore(10, true);//设置是否可以下拉加载  以及加载条数
        springview.onFinishFreshAndLoad();//刷新完成
    }

    @Override
    public void addVideoListData(Video videoDatas) {
        //新增自动加载的的数据
        mQuickAdapter.notifyDataChangedAfterLoadMore(videoDatas.getData(), true);
    }

    //自动加载
    @Override
    public void onLoadMoreRequested() {
            PageIndex++;
        //请求网络数据
//        mPresenter.loadVideoListDataRequest(AppConstant.DATA_TYPE_REST_VIDEO, PageIndex,true);
        mPresenter.loadVideoListDataRequest("0", "0", PageIndex,true);
        LogUtils.d("PageIndex:" + PageIndex);

    }
    //下拉刷新
    @Override
    public void onRefresh() {
        PageIndex = 1;
        //请求网络数据
//        mPresenter.loadVideoListDataRequest(AppConstant.DATA_TYPE_REST_VIDEO, PageIndex,false);
        mPresenter.loadVideoListDataRequest("0", "0", PageIndex,false);

    }

    @Override
    public void onLoadmore() {

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

    @Override
    public void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }
}
