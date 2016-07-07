package com.lovegift.lv.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lovegift.lv.bean.HomeTabBean;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.url.Urls;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {

    @Bind(R.id.home_tab)
    TabLayout homeTab;
    @Bind(R.id.home_viewPager)
    ViewPager homeViewPager;
    protected ArrayList<Fragment> frag_List = new ArrayList<>();
    protected ArrayList<String> titleList = new ArrayList<>();
    private List<HomeTabBean.DataBean.ChannelsBean>tab_List=new ArrayList<>();
    private static final String TAG="HomeFragment";
    private BaseViewPagerAdapter adapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();

    }

    private void initData() {
        //TODO 加载Tab数据
        Log.i(TAG, "frag_List: "+frag_List.toString());
        RequestParams tab_params=new RequestParams(Urls.URL_HOME_TAB);
        x.http().get(tab_params, new Callback.CommonCallback<HomeTabBean>() {

            @Override
            public void onSuccess(HomeTabBean result) {
                if (result!=null) {
                    List<HomeTabBean.DataBean.ChannelsBean> channels = result.getData().getChannels();

                    tab_List.addAll(channels);

                    for (int i = 0; i < channels.size(); i++) {
                        titleList.add(channels.get(i).getName());
                        //TODO Fragments的添加
                        if (i==0) {
                            frag_List.add(new HomeItemFragment());
                        }
                        else {
                            frag_List.add(new OtherHomeFragment().newInstance(channels.get(i).getName(),channels.get(i).getId()));
                            Log.i(TAG, "channels: "+channels.get(i).getName()+"!!!!!!"+channels.get(i).getId());
                        }
                        Log.i(TAG, "frag_List: "+frag_List.toString());
                    }
                    setAdAdapter();
                    homeTab.setupWithViewPager(homeViewPager);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Log.i(TAG, "frag_List: "+ex.fillInStackTrace());
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

    }

    private void setAdAdapter() {
        adapter=new BaseViewPagerAdapter(getFragmentManager());
        //TODO 设置viewPager不回收
        homeViewPager.setOffscreenPageLimit(titleList.size());
        homeViewPager.setAdapter(adapter);

    }
    /**
     * Tab与Viewpager适配器
     */
    class BaseViewPagerAdapter extends FragmentStatePagerAdapter {

        public BaseViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {

            Log.i(TAG, "getItem: ==="+frag_List.get(position).toString());
            return frag_List.get(position);
        }

        @Override
        public int getCount() {
            return frag_List ==null?0: frag_List.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titleList.get(position);
        }


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
