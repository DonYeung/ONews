package com.don.onews.api;

import com.don.onews.bean.GankVideoData;
import com.don.onews.bean.HomeData;
import com.don.onews.bean.HttpResult;
import com.don.onews.bean.Video;
import com.don.onews.utils.baserx.RxSchedulers;

import java.util.List;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by drcom on 2017/3/17.
 */

public class Apiwrapper extends RetrofitUtils {
    private static Apiwrapper mAPIWrapper;

    public Apiwrapper() {
    }

    public static Apiwrapper getInstance() {
        if (mAPIWrapper == null) {
            mAPIWrapper = new Apiwrapper();
        }
        return mAPIWrapper;
    }

    public Observable getHomeTop(String type, String key, int page){

        Observable observable =RetrofitUtils.getAPIService().getHomeTop(type,key,page)
                .map(new HttpResultFunc<HomeData.ResultBean>())//过滤HttpResult头
                .compose(RxSchedulers.<HomeData.ResultBean>io_main());//声明线程调度

        return observable;
    }

    public Observable getGankVideo(String type, int startPage){
        Observable observable =RetrofitUtils.getAPIService().getGankVideoList(type,startPage)
                //声明线程调度
                .compose(RxSchedulers.<GankVideoData>io_main());

        return observable;
    }

    public Observable getvideo(String type, String category_id, int startPage){
        Observable observable =RetrofitUtils.getAPIService().getvideo(type,category_id,startPage)
                //声明线程调度
                .compose(RxSchedulers.<Video>io_main());

        return observable;
    }


    /**
     * 用来统一处理Http的resultCode,并将HttpResult的Data部分剥离出来返回给subscriber
     *
     * @param <T>   Subscriber真正需要的数据类型，也就是Data部分的数据类型
     */
    private  class HttpResultFunc<T> implements Func1<HttpResult<T>, T> {

        @Override
        public T call(HttpResult<T> httpResult) {
            if (httpResult.getError_code() !=0 ) {
                throw new ApiException(httpResult);
            }
            return httpResult.getResult();
        }
    }
}
