package com.don.onews.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.blankj.utilcode.utils.LogUtils;
import com.bumptech.glide.Glide;
import com.don.onews.R;
import com.don.onews.app.AppConstant;
import com.don.onews.base.BaseActivity;
import com.don.onews.bean.NewsDetail;
import com.don.onews.ui.home.contract.NewsDetailContract;
import com.don.onews.ui.home.model.NewsDetailModel;
import com.don.onews.ui.home.presenter.NewsDetailPresenter;
import com.don.onews.ui.webview.WebViewBrowserActivity;
import com.don.onews.utils.TimeUtil;
import com.don.onews.utils.baserx.RxSchedulers;
import com.don.onews.widget.URLImageGetter;
import com.xiaochao.lcrapiddeveloplibrary.BaseQuickAdapter;
import com.xiaochao.lcrapiddeveloplibrary.viewtype.ProgressActivity;
import com.xiaochao.lcrapiddeveloplibrary.widget.SpringView;

import java.util.List;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by drcom on 2017/4/7.
 */

public class NewsDetailActivity extends BaseActivity<NewsDetailPresenter, NewsDetailModel> implements NewsDetailContract.View, BaseQuickAdapter.RequestLoadMoreListener, SpringView.OnFreshListener, BaseQuickAdapter.OnRecyclerViewItemClickListener {
    @BindView(R.id.news_detail_photo_iv)
    ImageView newsDetailPhotoIv;
    @BindView(R.id.mask_view)
    View maskView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.toolbar_layout)
    CollapsingToolbarLayout toolbarLayout;
    @BindView(R.id.app_bar)
    AppBarLayout appBar;
    @BindView(R.id.news_detail_from_tv)
    TextView newsDetailFromTv;
    @BindView(R.id.news_detail_body_tv)
    TextView newsDetailBodyTv;
//    @BindView(R.id.springview)
//    SpringView springview;
//    @BindView(R.id.progress)
//    ProgressActivity progress;

    private String postId;
    private String imgUrl;
    private String mNewsTitle;
    private URLImageGetter mUrlImageGetter;

    @Override
    public int getLayoutId() {
        return R.layout.act_news_detail;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }


    @Override
    public void initView() {
        /**1.appBarLayout的背景颜色调为半透明或者透明 app:popupTheme="@style/ThemeOverlay.AppCompat.Light"
          2.将toolbar的背景颜色调为半透明或者透明(沉浸状态栏（4.4以上系统有效）)
         **/
        SetTranslanteBar();
        postId = getIntent().getStringExtra(AppConstant.NEWS_POST_ID);
        imgUrl = getIntent().getStringExtra(AppConstant.NEWS_IMG_RES);
        LogUtils.d("NEWS_POST_ID:"+postId);
        mPresenter.loadNewsDetailDataRequest(postId);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    finishAfterTransition();
                } else {
                    finish();
                }
            }
        });
    }

    public static void startAction(Context context, String postId, String imgUrl) {
            Intent intent = new Intent(context, NewsDetailActivity.class);
        intent.putExtra(AppConstant.NEWS_POST_ID, postId);
        intent.putExtra(AppConstant.NEWS_IMG_RES, imgUrl);
        LogUtils.d("imgUrl:"+imgUrl);
        context.startActivity(intent);
    }

    @Override
    public void onItemClick(View view, int position) {

    }

    @Override
    public void returnNewsDetailData(NewsDetail newsDetail) {
        mNewsTitle = newsDetail.getTitle();

        String newsSource = newsDetail.getSource();
        String newsTime = TimeUtil.formatDate(newsDetail.getPtime());
        String newsBody = newsDetail.getBody();
        String NewsImgSrc = imgUrl;

        setToolBarLayout(mNewsTitle);
        //mNewsDetailTitleTv.setText(newsTitle);
        newsDetailFromTv.setText(getString(R.string.news_from, newsSource, newsTime));
        setNewsDetailPhotoIv(NewsImgSrc);
        setNewsDetailBodyTv(newsDetail, newsBody);
    }

    @Override
    public void onLoadMoreRequested() {

    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadmore() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showLoadFailMsg(String msg) {
        //设置加载错误页显示
//        progress.showError(getResources().getDrawable(R.mipmap.ic_launcher), AppConstant.ERROR_TITLE, AppConstant.ERROR_CONTEXT, AppConstant.ERROR_BUTTON, new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //请求网络数据
//                mPresenter.loadNewsDetailDataRequest(postId);
//            }
//        });
    }

    @Override
    public void showLoadCompleteAllData() {

    }

    private void setToolBarLayout(String newsTitle) {
        toolbarLayout.setTitle(newsTitle);
        toolbarLayout.setExpandedTitleColor(ContextCompat.getColor(this, R.color.white));
        toolbarLayout.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.primary_text));
    }

    private void setNewsDetailPhotoIv(String imgSrc) {
        Glide.with(this).load(imgSrc)
                .fitCenter()
                .error(R.mipmap.ic_empty_picture)
                .crossFade().into(newsDetailPhotoIv);
    }

    private void setNewsDetailBodyTv(final NewsDetail newsDetail, final String newsBody) {
        mRxManager.add(Observable.timer(500, TimeUnit.MILLISECONDS)
                .compose(RxSchedulers.<Long>io_main())
                .subscribe(new Subscriber<Long>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Long aLong) {
                        setBody(newsDetail, newsBody);
                    }
                }));
    }
    private void setBody(NewsDetail newsDetail, String newsBody) {
        int imgTotal = newsDetail.getImg().size();
        if (isShowBody(newsBody, imgTotal)) {
//              mNewsDetailBodyTv.setMovementMethod(LinkMovementMethod.getInstance());//加这句才能让里面的超链接生效,实测经常卡机崩溃
            mUrlImageGetter = new URLImageGetter(newsDetailBodyTv, newsBody, imgTotal);
            newsDetailBodyTv.setText(Html.fromHtml(newsBody, mUrlImageGetter, null));
        } else {
            newsDetailBodyTv.setText(Html.fromHtml(newsBody));
        }
    }
    private boolean isShowBody(String newsBody, int imgTotal) {
        return imgTotal >= 2 && newsBody != null;
    }
    private String getImgSrcs(NewsDetail newsDetail) {
        List<NewsDetail.ImgBean> imgSrcs = newsDetail.getImg();
        String imgSrc;
        if (imgSrcs != null && imgSrcs.size() > 0) {
            imgSrc = imgSrcs.get(0).getSrc();
        } else {
            imgSrc = getIntent().getStringExtra(AppConstant.NEWS_IMG_RES);
        }
        return imgSrc;
    }


}
