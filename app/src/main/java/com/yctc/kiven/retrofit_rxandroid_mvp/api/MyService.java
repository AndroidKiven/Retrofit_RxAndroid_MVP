package com.yctc.kiven.retrofit_rxandroid_mvp.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kiven on 2016/11/19.
 */

public class MyService {
    private static final String Server = "http://apis.baidu.com/";
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Server).addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();

    public static <T> T getApi(Class<T> tClass) {
        return retrofit.create(tClass);
    }
}
