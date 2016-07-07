package com.lovegift.lv.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * name:zhangHang
 *
 * date:2016/6/26
 *
 * version:1.0
 */
public class SharedPrefUtils {
    private static SharedPreferences mSharedPref;
    private static final String SHAREDPREF_NAME="config";

    /**是否是第一次进入引导页*/
    public static final String ISFIRST="isFirst";
    /**
     * 是否开启极光推送
     */
    public static String OPEN_OR_CLOSE_JPush="isOpen";

    /**
     * 得到boolean值
     * @param context
     * @param key
     * @param defValue
     * @return boolean
     */
    public static boolean getBoolean(Context context,String key,boolean defValue){
        if(mSharedPref==null){
            mSharedPref=context.getSharedPreferences(SHAREDPREF_NAME,Context.MODE_PRIVATE);
        }
        return mSharedPref.getBoolean(key,defValue);
    }

    /**
     * 保存boolean值
     * @param context
     * @param key
     * @param value
     */
    public static void saveBoolean(Context context,String key,boolean value){
        if(mSharedPref==null) {
            mSharedPref = context.getSharedPreferences(SHAREDPREF_NAME, Context.MODE_PRIVATE);
        }
        mSharedPref.edit().putBoolean(key, value).commit();
    }

    /**
     * 保存String值
     * @param context
     * @param key
     * @param value
     */
    public static void saveString(Context context,String key,String value){
        if(mSharedPref==null) {
            mSharedPref = context.getSharedPreferences(SHAREDPREF_NAME, Context.MODE_PRIVATE);
        }
        mSharedPref.edit().putString(key, value).commit();
    }

    /**
     * 得到String
     * @param context
     * @param key
     * @param defValue
     * @return String
     */
    public static String getString(Context context,String key,String defValue){
        if(mSharedPref==null){
            mSharedPref=context.getSharedPreferences(SHAREDPREF_NAME,Context.MODE_PRIVATE);
        }
        return mSharedPref.getString(key,defValue);
    }
    /**
     * 设置Int
     *
     */
    public static void saveInt(Context context,String key,int value){
        if(mSharedPref==null) {
            mSharedPref = context.getSharedPreferences(SHAREDPREF_NAME, Context.MODE_PRIVATE);
        }
        mSharedPref.edit().putInt(key, value).commit();
    }


    /**
     * 更改int
     */
    public static int getInt(Context context,String key,int defValue){
        if(mSharedPref==null){
            mSharedPref=context.getSharedPreferences(SHAREDPREF_NAME,Context.MODE_PRIVATE);
        }
        return mSharedPref.getInt(key,defValue);
    }
}
