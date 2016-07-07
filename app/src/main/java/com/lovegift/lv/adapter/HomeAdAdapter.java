package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.bean.AdBean;
import com.lovegift.lv.lovegift.AdActivity;
import com.lovegift.lv.lovegift.R;

import java.util.ArrayList;


/**
 * Created by Zane on 2016/6/20.
 */
public class HomeAdAdapter extends PagerAdapter {
    private SimpleDraweeView sdv;
    private ArrayList<AdBean.DataBean.BannersBean>list;
    private Context context;
    private LayoutInflater inflater;

    public HomeAdAdapter(Context context,ArrayList<AdBean.DataBean.BannersBean>list) {
        this.context=context;
        this.list=list;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        View inflate = inflater.inflate(R.layout.layout_frag_home_ad, container, false);
        sdv = (SimpleDraweeView) inflate.findViewById(R.id.ad_sdv);

        //TODO 广告的点击事件
        sdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("target_id",list.get(position).getTarget_id());
                intent.setClass(context, AdActivity.class);
                context.startActivity(intent);
            }
        });

        sdv.setImageURI(list.get(position%list.size()).getImage_url());

        container.addView(inflate);

        return inflate;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
