package com.lovegift.lv.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.lovegift.lv.lovegift.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/6/22.
 */
public class IntroduceFragment extends Fragment {
    @Bind(R.id.wv_instroduce)
    WebView wvInstroduce;
    private String detail_html;

    public static IntroduceFragment getInstance(String detail_html) {
        IntroduceFragment introduceFragment=new IntroduceFragment();
        Bundle args=new Bundle();
        args.putString("detail_html",detail_html);
        introduceFragment.setArguments(args);
        return introduceFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args=getArguments();
        if(args!=null){
            detail_html=args.getString("detail_html");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_introduce, container, false);
        //使用ButterKnife初始化控件
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initWebView();
        initData();
    }

    private void initData() {
        wvInstroduce.loadDataWithBaseURL(null,detail_html,"text/html","UTF-8",null);
    }

    private void initWebView() {
        WebSettings webSettings = wvInstroduce.getSettings();
        webSettings.setDefaultTextEncodingName("UTF-8");
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDisplayZoomControls(true);
        webSettings.setSupportZoom(true);
        // 设置缩放工具的显示
        webSettings.setBuiltInZoomControls(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
