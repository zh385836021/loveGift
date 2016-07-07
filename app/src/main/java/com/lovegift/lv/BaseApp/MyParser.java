package com.lovegift.lv.BaseApp;

import com.google.gson.Gson;

import org.xutils.http.app.ResponseParser;
import org.xutils.http.request.UriRequest;

import java.lang.reflect.Type;

/**
 * 解析bean
 */
public class MyParser implements ResponseParser {

    @Override
    public void checkResponse(UriRequest uriRequest) throws Throwable {

    }

    //用于对下载结果的字符串进行解析的方法
    /*
    *   参数3： 下载的字符串结果
    *   2： 要解析成那种bean对象类型
    *
    * */
    @Override
    public Object parse(Type type, Class<?> aClass, String s) throws Throwable {
        return new Gson().fromJson(s,aClass);
    }
}
