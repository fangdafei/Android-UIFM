package com.example.xrs_fang.testdemo.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xrs_fang.testdemo.R;

public class ThreeFragMent extends BaseFragMent {
    @Override
    protected void setSublistener() {

    }

    @Override
    protected View getSubView(LayoutInflater inflater, ViewGroup container) {
        View rootview = inflater.inflate(R.layout.fragment_three,container,false);

        return rootview;
    }
}
