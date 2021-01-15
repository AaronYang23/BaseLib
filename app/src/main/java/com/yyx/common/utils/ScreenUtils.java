package com.yyx.common.utils;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Author: AaronYang  \  aymiracle37@gmail.com
 * Date: 2021/1/15
 * Function: 屏幕工具
 */
public class ScreenUtils {


    /**
     * desc: 获取屏幕宽度     （ApplicationContext）
     */
    public static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels;
    }


    /**
     * desc: 获取Density      （ApplicationContext）
     */
    public static float getScreenDensity(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.density;
    }

    /**
     * desc: 获取屏幕像素密度(DPI)      （ApplicationContext）
     */
    public static int getScreenDpi(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.densityDpi;
    }


}