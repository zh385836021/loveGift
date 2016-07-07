package com.lovegift.lv.request;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;


public class GiftRequest<T> extends Request<T>{

    public Response.Listener<T> listener;
    private  Class<T> clazz;

    public GiftRequest(Class<T> clazz, String url, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        this(clazz, Method.GET, url,listener ,errorListener);
    }
    public GiftRequest(Class<T> clazz, int method, String url, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        this.listener = listener;
        this.clazz = clazz;
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        String s ;
        try {
            s = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            s = new String(response.data);
        }
        T t = new Gson().fromJson(s,clazz);
        return Response.success(t,HttpHeaderParser.parseCacheHeaders(response));
    }

    @Override
    protected void deliverResponse(T response) {
        if (listener != null) {
            listener.onResponse(response);
        }
    }

    @Override
    protected void onFinish() {
        super.onFinish();
        listener = null;
    }
}
