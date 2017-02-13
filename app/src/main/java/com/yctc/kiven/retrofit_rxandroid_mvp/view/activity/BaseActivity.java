package com.yctc.kiven.retrofit_rxandroid_mvp.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yctc.kiven.retrofit_rxandroid_mvp.presenter.BasePresenter;
import com.yctc.kiven.retrofit_rxandroid_mvp.view.iview.MvpView;

/**
 * Created by Kiven on 2016/11/19.
 */

public abstract class BaseActivity<V extends MvpView, T extends BasePresenter<V>> extends AppCompatActivity {
    public T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attach((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.deAttch();
    }

    public abstract T createPresenter();

}
