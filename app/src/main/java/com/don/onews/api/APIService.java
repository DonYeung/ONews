package com.don.onews.api;

import com.don.onews.bean.HttpResult;
import com.don.onews.bean.HomeData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by drcom on 2017/3/17.
 */

public interface APIService {

    //获取首页详情
    @GET("")
    Observable<HttpResult<HomeData>> getHomeTop(@Query("type") String type,
                                                @Query("key") String key,
                                                @Query("page") int page);

}
