package com.lovegift.lv.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.lovegift.lv.adapter.SearchRecycleViewAdapter;
import com.lovegift.lv.bean.SearchEvery;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.request.GiftRequest;
import com.lovegift.lv.url.Urls;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin-pc on 2016/6/25.
 */
public class SearchEveryFragment extends Fragment {
    private RecyclerView search_rcv;
    private List<String> hotwords;
    private RequestQueue queue;
    private String regix = ",";
    private SearchRecycleViewAdapter adapter;
    private FragmentManager manager;
    private SearchGiftFragment searchGiftFragment;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        queue = Volley.newRequestQueue(getActivity());
        manager = getFragmentManager();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_search_recycle, container, false);
        initView(view);
        setData();
        initAdapter();
        return view;
    }


    private void initAdapter() {
        adapter = new SearchRecycleViewAdapter(getActivity(), hotwords);
        search_rcv.setAdapter(adapter);
        adapter.setOnItemClickListener(new SearchRecycleViewAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, String word) {
                searchGiftFragment = new SearchGiftFragment();
                Bundle bundle = new Bundle();

                if (!TextUtils.isEmpty(word)) {
                    bundle.putString("word", word);
                    searchGiftFragment.setArguments(bundle);
                }

                manager.beginTransaction().replace(R.id.search_fragment, searchGiftFragment).commit();
            }
        });
    }

    private void setData() {
        hotwords = new ArrayList<>();

        GiftRequest<SearchEvery> getRequest = new GiftRequest<>(
                SearchEvery.class,
                Urls.HOT_WORD,
                new Response.Listener<SearchEvery>() {
                    @Override
                    public void onResponse(SearchEvery response) {
                        String s = response.getData().getHot_words().toString();
                        String ss = s.substring(1, s.length() - 1);
                        String[] strings = ss.split(regix);
                        for (String string : strings
                                ) {
                            hotwords.add(string);
                        }
                        adapter.notifyDataSetChanged();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), "网络错误！", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        queue.add(getRequest);
    }

    private void initView(View view) {
        search_rcv = (RecyclerView) view.findViewById(R.id.search_rcv);
        search_rcv.setLayoutManager(new GridLayoutManager(getActivity(), 4));
    }

}
