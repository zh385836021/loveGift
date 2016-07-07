package com.lovegift.lv.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by lin-pc on 2016/6/25.
 */
public class SearchFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    private String[] title;
    public SearchFragmentAdapter(FragmentManager fm,List<Fragment> list,String[] title) {
        super(fm);
        this.list = list;
        this.title = title;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
