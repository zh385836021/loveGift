package com.lovegift.lv.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lovegift.lv.adapter.CategoryVpAdapter;
import com.lovegift.lv.lovegift.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lin-pc on 2016/6/20.
 */
public class CategoryFragment extends Fragment {


    @Bind(R.id.category_main_tablayout)
    TabLayout categoryMainTablayout;
    @Bind(R.id.category_main_viewpager)
    ViewPager categoryMainViewpager;
    //攻略和礼物 viewpager页面 中的fragment 集合
    private ArrayList<Fragment> viewpager_fragment = new ArrayList<>();
    //tablayout的字符串数组
    private String [] str_tab = {"攻略专题","礼物大全"};
    //viewpager的适配器
    private CategoryVpAdapter categoryVpAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.category_main, container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);//初始化控件
        initData();//viewpager中Fragment的初始化，tablayout的初始化，
                    // 设置viewpager适配器tablayout和viewpager的绑定
    }

    private void initData() {
        viewpager_fragment.add(new CategoryStrategyFragment());
        viewpager_fragment.add(new CategoryGiftFragment());

        categoryVpAdapter = new CategoryVpAdapter(getFragmentManager(),viewpager_fragment,str_tab);
        categoryMainViewpager.setAdapter(categoryVpAdapter);

        categoryMainTablayout.setupWithViewPager(categoryMainViewpager);
        categoryVpAdapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
