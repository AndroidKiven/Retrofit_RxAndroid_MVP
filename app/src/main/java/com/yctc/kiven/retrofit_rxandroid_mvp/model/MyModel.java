package com.yctc.kiven.retrofit_rxandroid_mvp.model;


import rx.functions.Action1;

/**
 * Created by Kiven on 2016/11/19.
 */

//用来获取数据的model
public interface MyModel<T> extends MVPModel{
    void loadData(Action1<T> action);

}
