package com.yctc.kiven.retrofit_rxandroid_mvp.view.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.yctc.kiven.retrofit_rxandroid_mvp.R;
import com.yctc.kiven.retrofit_rxandroid_mvp.adapter.MyAdapter;
import com.yctc.kiven.retrofit_rxandroid_mvp.bean.Cook;
import com.yctc.kiven.retrofit_rxandroid_mvp.presenter.MainAcPresenter;
import com.yctc.kiven.retrofit_rxandroid_mvp.view.iview.MyView;

import java.util.ArrayList;
import java.util.List;


//用retrofit请求数据，然后通过rxandroid返回数据，结合MVP模式
public class MainActivity extends BaseActivity<MyView, MainAcPresenter> implements MyView {
    List<Cook> list = new ArrayList<>();
    private ListView listview;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview);
        presenter.load();
    }

    @Override
    public MainAcPresenter createPresenter() {
        return new MainAcPresenter();
    }

    @Override
    public void showView(Cook cook) {
        list.add(cook);
        Log.e("error----", "" + cook.getName());
        myAdapter = new MyAdapter(list, R.layout.item);
        listview.setAdapter(myAdapter);
    }
}
