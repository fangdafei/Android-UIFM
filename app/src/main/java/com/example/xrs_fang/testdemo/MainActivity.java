package com.example.xrs_fang.testdemo;

import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

import com.example.xrs_fang.testdemo.adaper.MainCententPageAdaper;
import com.example.xrs_fang.testdemo.utils.Constans;

public class MainActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup tabGroup;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }


    void initView(){


        FragmentManager supportFragmentManager = getSupportFragmentManager();

        //创建适配器
        MainCententPageAdaper mainAdaper = new MainCententPageAdaper(supportFragmentManager);


        viewPager = (ViewPager) findViewById(R.id.viewpageid);
        viewPager.setAdapter(mainAdaper);

        tabGroup = (RadioGroup)findViewById(R.id.tab_group);
        //默认选中
        tabGroup.check(R.id.fistitem);
        //设置监听-item选中
        tabGroup.setOnCheckedChangeListener(this);

    }

    //option+enter 创建方法
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        //处理底部item处理点击
        int index = Constans.PAGE_MAIN;
        switch (i) {
            case R.id.fistitem:
                 index = Constans.PAGE_MAIN;
            break;
            case R.id.towitem:
                index = Constans.PAGE_MYLISTER;
            break;
            case R.id.fouritem:
                index = Constans.PAGE_THREE;
            break;
            case R.id.fiveitem:
                index = Constans.PAGE_FOUR;
            break;
        }
        viewPager.setCurrentItem(index,false);
    }
}
