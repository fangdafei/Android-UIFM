package com.example.xrs_fang.testdemo.adaper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.example.xrs_fang.testdemo.utils.Constans;
import com.example.xrs_fang.testdemo.utils.FragMentCache;

public class MainCententPageAdaper extends FragmentPagerAdapter {


    public MainCententPageAdaper(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return FragMentCache.getFragMentByPosition(i);
    }

    @Override
    public int getCount() {
        return Constans.TAB_COUNT;
    }
}
