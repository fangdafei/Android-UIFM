package com.example.xrs_fang.testdemo.utils;

import com.example.xrs_fang.testdemo.R;
import com.example.xrs_fang.testdemo.fragment.BaseFragMent;
import com.example.xrs_fang.testdemo.fragment.FourFragMent;
import com.example.xrs_fang.testdemo.fragment.MainFragMent;
import com.example.xrs_fang.testdemo.fragment.MyListenerFragMent;
import com.example.xrs_fang.testdemo.fragment.ThreeFragMent;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class FragMentCache {

    public static Map<Integer,BaseFragMent> sCache = new HashMap<>();

    public static BaseFragMent getFragMentByPosition(int positon){
        BaseFragMent baseFragMent = sCache.get(positon);
        if (baseFragMent != null){
            return baseFragMent;
        }

        switch (positon){
            case 0:
                baseFragMent = new MainFragMent();
                break;
            case 1:
                baseFragMent = new MyListenerFragMent();
                break;
            case 2:
                baseFragMent = new ThreeFragMent();
                break;
            case 3:
                baseFragMent = new FourFragMent();
                break;
        }

        sCache.put(positon,baseFragMent);
        return baseFragMent;
    }
}
