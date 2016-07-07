package com.lovegift.lv.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Xu on 2016/6/21 0021.
 */
public class CategoryVpAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> list;
    private String [] strs;

    public CategoryVpAdapter(FragmentManager fm,ArrayList<Fragment> list,String [] strs) {
        super(fm);
        this.list = list;
        this.strs = strs;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size()==0?0:list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return strs[position];
    }
}
