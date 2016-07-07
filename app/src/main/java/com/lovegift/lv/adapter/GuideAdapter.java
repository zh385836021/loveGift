package com.lovegift.lv.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zane on 2016/6/26.
 */
public class GuideAdapter extends PagerAdapter {
    private Context context;
    private ArrayList<ImageView>dataList;

    public GuideAdapter(Context context,ArrayList<ImageView>dataList) {
        this.context=context;
        this.dataList=dataList;
    }

    @Override
    public int getCount() {
        return dataList==null?0:dataList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(dataList.get(position));
        return dataList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(dataList.get(position));
    }
}
