package com.lovegift.lv.utils;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.module.GlideModule;

/**
 *
 */
public class MyMode implements GlideModule {

    //应用选项，
    //
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {

        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);
    }

    /*
    * 用于注册组件
    * */
    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
