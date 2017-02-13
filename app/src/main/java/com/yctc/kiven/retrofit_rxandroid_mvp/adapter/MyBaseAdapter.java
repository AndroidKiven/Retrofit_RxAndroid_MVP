package com.yctc.kiven.retrofit_rxandroid_mvp.adapter;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Kiven on 2016/11/19.
 */

public abstract class MyBaseAdapter<T> extends BaseAdapter {
    private List<T> list;
    private
    @LayoutRes
    int id;

    public MyBaseAdapter(List<T> list, int id) {
        this.list = list;
        this.id = id;
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyHolder myHolder = MyHolder.getHolder(convertView, id, parent.getContext());
        fillData(position, myHolder);
        return myHolder.getConvertView();
    }

    public abstract void fillData(int position, MyHolder myHolder);
}
