package com.yctc.kiven.retrofit_rxandroid_mvp.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Kiven on 2016/11/19.
 */

public class MyHolder {

    private View convertView;
    private SparseArray<View> sparseArray = new SparseArray<>();


    public MyHolder(Context context, int id) {
        convertView = LayoutInflater.from(context).inflate(id, null);
        convertView.setTag(this);
    }


    public View getConvertView() {
        return convertView;
    }

    public static MyHolder getHolder(View convertView, @LayoutRes int id, Context context) {
        MyHolder myHolder = null;
        if (convertView == null) {
            myHolder = new MyHolder(context, id);
        } else {
            myHolder = (MyHolder) convertView.getTag();
        }
        return myHolder;
    }

    public View findView(int id) {
        View view = sparseArray.get(id);
        if (view == null) {
            view = convertView.findViewById(id);
            sparseArray.put(id, view);
        }
        return view;
    }
}
