package com.yctc.kiven.retrofit_rxandroid_mvp.presenter;

import com.yctc.kiven.retrofit_rxandroid_mvp.bean.Cook;
import com.yctc.kiven.retrofit_rxandroid_mvp.model.MainAcModel;
import com.yctc.kiven.retrofit_rxandroid_mvp.model.MyModel;
import com.yctc.kiven.retrofit_rxandroid_mvp.view.iview.MyView;

import java.util.List;

import rx.functions.Action1;


/**
 * Created by Kiven on 2016/11/19.
 */

public class MainAcPresenter extends BasePresenter<MyView>{
    private MyModel<Cook> myModel;

    public MainAcPresenter() {
       myModel = new MainAcModel();
    }

    public void load(){
     myModel.loadData(new Action1<Cook>() {
         @Override
         public void call(Cook cook) {

             getView().showView(cook);
         }
     });
    }
}
