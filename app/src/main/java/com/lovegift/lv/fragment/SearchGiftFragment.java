package com.lovegift.lv.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.text.LoginFilter;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lovegift.lv.adapter.SearchFragmentAdapter;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.url.Urls;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin-pc on 2016/6/25.
 */
public class SearchGiftFragment extends Fragment {
    private TabLayout search_tab;
    private ViewPager search_pager;
    public List<Fragment> fragmentList;
    private SearchFragmentAdapter adapter;
    private FragmentManager manager;
    private String[] title = {"礼物", "攻略"};
    private String word;
    private String searchKey;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        manager = getFragmentManager();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search_gift, container, false);
        initView(view);
        setData();
        initAdapter();
        search_tab.setupWithViewPager(search_pager);

        return view;
    }


    private void initAdapter() {
        adapter = new SearchFragmentAdapter(getChildFragmentManager(), fragmentList, title);
        search_pager.setAdapter(adapter);
        Log.i("123123", "initAdapter: "+adapter.getCount());
    }

    private void setData() {

        if (fragmentList == null) {
            fragmentList = new ArrayList<>();
        }

        if (TextUtils.isEmpty(searchKey)) {
            Bundle bundle = getArguments();
            word = bundle.getString("word");
            Log.i("123123", "第一种: " + word);
            SearchPagerGiftFragment searchPagerGiftFragment = SearchPagerGiftFragment.getInstance(Urls.SEARCH_GIFT, word);
            SearchPagerStrategyFragment searchPagerStrategyFragment = SearchPagerStrategyFragment.getInstance(Urls.SEARCH_STRATEGY, word);
            if (fragmentList.size() != 0) {
                fragmentList.clear();
            }
            fragmentList.add(searchPagerGiftFragment);
            fragmentList.add(searchPagerStrategyFragment);
            Log.i("123123", "第一种: " + 111);
        } else {
            SearchPagerGiftFragment searchPagerGiftFragment = SearchPagerGiftFragment.getInstance(Urls.SEARCH, searchKey);
            SearchPagerStrategyFragment searchPagerStrategyFragment = SearchPagerStrategyFragment.getInstance(Urls.SEARCH2, searchKey);
            if (fragmentList.size() != 0) {
                fragmentList.clear();
            }
            fragmentList.add(searchPagerGiftFragment);
            fragmentList.add(searchPagerStrategyFragment);
            Log.i("123123", "第二种: " + 222);
        }
    }

    private void initView(View view) {
        search_tab = (TabLayout) view.findViewById(R.id.search_tab);
        search_pager = (ViewPager) view.findViewById(R.id.search_pager);
    }

    public void getSearchKey(String key) {
        searchKey = key;
    }
}
