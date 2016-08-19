package com.yiku;

import android.app.Application;

/**
 * Created by daipeng on 16/8/19.
 */
public class YiKuApp extends Application {
    private static final String TAG = "YiKuApp";

    private static YiKuApp sInstanse;

    public static YiKuApp getInstanse() {
        return sInstanse;
    }

    @Override
    public void onCreate() {
        sInstanse = this;
        super.onCreate();
    }
}
