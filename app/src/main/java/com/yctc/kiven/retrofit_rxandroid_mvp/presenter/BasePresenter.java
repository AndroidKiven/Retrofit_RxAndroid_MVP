package com.yctc.kiven.retrofit_rxandroid_mvp.presenter;

import com.yctc.kiven.retrofit_rxandroid_mvp.view.iview.MvpView;

import java.lang.ref.WeakReference;

/**
 * Created by Kiven on 2016/11/19.
 */

public class BasePresenter<V extends MvpView> {
    private WeakReference<V> weakReference;

    public void attach(V v) {
        weakReference = new WeakReference<V>(v);
    }

    public void deAttch() {
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;
        }
    }

    //获取保持关系的view
    public V getView() {
        return weakReference.get();
    }

}
