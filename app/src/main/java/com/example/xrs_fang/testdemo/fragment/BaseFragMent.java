package com.example.xrs_fang.testdemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragMent extends Fragment {

    private View rootview = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        rootview = getSubView(inflater,container);
        //设置时间监听
        setSublistener();
        return rootview;
    }

    protected abstract void setSublistener();

    protected abstract View getSubView(LayoutInflater inflater, ViewGroup container);
}
