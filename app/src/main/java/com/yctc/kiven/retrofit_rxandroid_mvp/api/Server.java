package com.yctc.kiven.retrofit_rxandroid_mvp.api;

import com.yctc.kiven.retrofit_rxandroid_mvp.bean.Cook;


import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Kiven on 2016/11/19.
 */

public interface Server {
    @Headers("apikey:7785a606621385283fe4d65537cf0f5b")
    @GET("tngou/cook/classify")
    Observable<Cook> getDataObs(@Query("id") int id);
}
