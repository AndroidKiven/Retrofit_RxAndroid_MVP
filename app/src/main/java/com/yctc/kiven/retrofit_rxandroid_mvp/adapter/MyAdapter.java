package com.yctc.kiven.retrofit_rxandroid_mvp.adapter;

import android.widget.TextView;

import com.yctc.kiven.retrofit_rxandroid_mvp.R;
import com.yctc.kiven.retrofit_rxandroid_mvp.bean.Cook;

import java.util.List;

/**
 * Created by Kiven on 2016/11/19.
 */

public class MyAdapter extends MyBaseAdapter<Cook> {

    private List<Cook> list;

    public MyAdapter(List<Cook> list, int id) {
        super(list, id);
        this.list = list;
    }

    @Override
    public void fillData(int position, MyHolder myHolder) {
        Cook cook = list.get(position);
        ((TextView)myHolder.findView(R.id.tv)).setText(cook.getName());
    }
}
