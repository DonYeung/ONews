package com.don.onews.api;

import com.don.onews.bean.HomeData;
import com.don.onews.bean.HttpResult;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

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

    //demo
    public Observable getHomeTop(String type, String key, int page, Observer<HomeData> observer){

        Observable observable =RetrofitUtils.getAPIService().getHomeTop(type,key,page).map(new HttpResultFunc<HomeData>());;

        setSubscribe(observable, observer);

        return observable;
    }

    /**
     * 插入观察者
     *
     * @param observable
     * @param observer
     * @param <T>
     */
    public static <T> void setSubscribe(Observable<T> observable, Observer<T> observer) {
        observable.subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())//子线程访问网络
                .observeOn(AndroidSchedulers.mainThread())//回调到主线程
                .subscribe(observer);
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
