package com.yiku.commonBase;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import com.yiku.YiKuApp;

/**
 * Created by daipeng on 16/8/19.
 */
public class UiUtils {
    // 手机屏幕密度
    private static float sDensity = 0f;
    // 手机dpi
    private static int sDensityDpi = 0;
    // 手机屏幕宽度
    private static int sScreenWidth = 0;
    // 手机屏幕高度
    private static int sScreenHeight = 0;

    public static int dipToPx(int dip) {
        return (int) (dip * getDensity() + 0.5f);
    }

    public static float getDensity() {
        if (sDensity == 0f) {
            DisplayMetrics dm = new DisplayMetrics();
            ((WindowManager) YiKuApp.getInstanse().getSystemService(Context.WINDOW_SERVICE))
                    .getDefaultDisplay().getMetrics(dm);
            sDensity = dm.density;
        }
        return sDensity;
    }

    public static int getDensityDpi() {
        if (sDensityDpi == 0) {
            DisplayMetrics dm = new DisplayMetrics();
            ((WindowManager) YiKuApp.getInstanse().getSystemService(Context.WINDOW_SERVICE))
                    .getDefaultDisplay().getMetrics(dm);
            sDensityDpi = dm.densityDpi;
        }
        return sDensityDpi;
    }

    public static int getScreenWidthPixels() {
        if (sScreenWidth == 0) {
            DisplayMetrics dm = new DisplayMetrics();
            ((WindowManager) YiKuApp.getInstanse().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay()
                    .getMetrics(dm);
            sScreenWidth = dm.widthPixels;
        }
        return sScreenWidth;
    }

    public static int getScreenHeightPixels() {
        if (sScreenHeight == 0) {
            DisplayMetrics dm = new DisplayMetrics();
            ((WindowManager) YiKuApp.getInstanse().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay()
                    .getMetrics(dm);
            sScreenHeight = dm.heightPixels;
        }
        return sScreenHeight;
    }

}
