package com.yctc.kiven.retrofit_rxandroid_mvp.model;

import com.yctc.kiven.retrofit_rxandroid_mvp.api.MyService;
import com.yctc.kiven.retrofit_rxandroid_mvp.api.Server;
import com.yctc.kiven.retrofit_rxandroid_mvp.bean.Cook;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;


/**
 * Created by Kiven on 2016/11/19.
 */

public class MainAcModel implements MyModel<Cook>{

    @Override
    public void loadData(Action1<Cook> action1) {
        //请求数据

        MyService.getApi(Server.class).getDataObs(1).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Action1<Cook>() {
            @Override
            public void call(Cook cook) {
                System.out.println("cook----------------------"+cook.getName());
            }
        });
        MyService.getApi(Server.class).getDataObs(1).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(action1);
    }


}
