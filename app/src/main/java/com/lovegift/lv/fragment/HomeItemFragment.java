package com.lovegift.lv.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.adapter.HomeAdAdapter;
import com.lovegift.lv.adapter.HomeRecyclerAdapter;
import com.lovegift.lv.bean.AdBean;
import com.lovegift.lv.bean.HomeContentBean;
import com.lovegift.lv.bean.HomeIconBean;
import com.lovegift.lv.lovegift.GloriousThingActivity;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.lovegift.StrategyTopicsActivity;
import com.lovegift.lv.url.Urls;
import com.lovegift.lv.utils.LogUtils;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import it.gmariotti.recyclerview.adapter.SlideInBottomAnimatorAdapter;

/**
 * Created by Zane on 2016/6/20.
 */
public class HomeItemFragment extends Fragment {

    @Bind(R.id.homeItem_viewPager)
    ViewPager homeItemViewPager;
    @Bind(R.id.iv_f4_small)
    SimpleDraweeView ivF4Small;
    @Bind(R.id.iv_f4_taste)
    SimpleDraweeView ivF4Taste;
    @Bind(R.id.iv_f4_sign)
    SimpleDraweeView ivF4Sign;
    @Bind(R.id.iv_prize)
    SimpleDraweeView ivPrize;
    @Bind(R.id.home_item_Recycler)
    RecyclerView homeItemRecycler;
    @Bind(R.id.icon_small_title1)
    TextView iconSmallTitle1;
    @Bind(R.id.icon_taste_title2)
    TextView iconTasteTitle2;
    @Bind(R.id.icon_sign_title3)
    TextView iconSignTitle3;
    @Bind(R.id.icon_prize_title4)
    TextView iconPrizeTitle4;
    @Bind(R.id.radiogroup)
    RadioGroup rg;

    private HomeAdAdapter adAdapter;
    private ArrayList<AdBean.DataBean.BannersBean> data_List = new ArrayList<>();
    private ArrayList<HomeContentBean.DataBean.ItemsBean> content_List = new ArrayList<>();
    private Handler handler = new Handler();
    List<HomeIconBean.DataBean.PromotionsBean> icon_List = new ArrayList<>();
    private static final String TAG = "HomeItemFragment";
    private SimpleDraweeView[] icon = new SimpleDraweeView[4];
    private TextView[] title = new TextView[4];
    private HomeRecyclerAdapter recyAdapter;
    final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
    private ArrayList<Integer>target_id=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container, false);
        ButterKnife.bind(this, view);
        initIconTitles();

        return view;
    }

    //TODO 绑定控件后，初始化
    private void initIconTitles() {
        icon[0] = ivF4Small;
        icon[1] = ivF4Taste;
        icon[2] = ivF4Sign;
        icon[3] = ivPrize;

        title[0] = iconSmallTitle1;
        title[1] = iconTasteTitle2;
        title[2] = iconSignTitle3;
        title[3] = iconPrizeTitle4;
    }

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        initListener();
    }


    private void initData() {
        //TODO 加载首页广告
        RequestParams params = new RequestParams(Urls.URL_HOME_BANNER);
        x.http().get(params, new Callback.CommonCallback<AdBean>() {
            @Override
            public void onSuccess(AdBean result) {
                if (result != null) {
                    List<AdBean.DataBean.BannersBean> banners = result.getData().getBanners();
                    Log.i(TAG, "AdBean onSuccess: " + banners);
                    data_List.addAll(banners);
                    initAdapter();

                    //TODO 广告点击事件根据target_id区分
                    for (int i = 0; i <banners.size() ; i++) {
                        target_id.add(result.getData().getBanners().get(i).getTarget_id());
                        LogUtils.i(TAG, "target_id::" + result.getData().getBanners().get(i).getTarget_id());
                    }
                }
                LogUtils.i(TAG, "BannersBean onSuccess==" + result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                LogUtils.i(TAG, "BannersBean onError==" + ex.fillInStackTrace());
            }

            @Override
            public void onCancelled(CancelledException cex) {
                LogUtils.i(TAG, "BannersBean onCancelled==" + cex.fillInStackTrace());
            }


            @Override
            public void onFinished() {
                LogUtils.i(TAG, "BannersBean onFinished==");
            }
        });


        //TODO 加载4个Icon图片和标题
        RequestParams icon_Params = new RequestParams(Urls.URL_HOME_F4_ICON);
        x.http().get(icon_Params, new Callback.CommonCallback<HomeIconBean>() {

            @Override
            public void onSuccess(HomeIconBean result) {
                if (result != null) {
                    List<HomeIconBean.DataBean.PromotionsBean> promotions = result.getData().getPromotions();
                    icon_List.addAll(promotions);
                    setIcon();
                    setIconTitles();
                    LogUtils.i("icon_Params", "promotions ====" + promotions.toString());
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

        //TODO 加载首页RecylerView网络数据
        RequestParams recy_Params = new RequestParams(Urls.URL_HOME_RECYCLERVIEW);
        x.http().get(recy_Params, new Callback.CommonCallback<HomeContentBean>() {
            @Override
            public void onSuccess(HomeContentBean result) {
                if (result != null) {
                    List<HomeContentBean.DataBean.ItemsBean> ItemsBean = result.getData().getItems();
                    content_List.addAll(ItemsBean);
                    setRecyAdapter();
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
    String nextUrl = null;
    private boolean isReflash = false;

    private void initListener() {
        homeItemViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                rg.check(position % data_List.size());

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                switch (state) {
                    //TODO 滑动
                    case ViewPager.SCROLL_STATE_DRAGGING:
                        handler.removeCallbacks(r);
                        flag = true;
                        break;

                    //TODO 滑动停止
                    case ViewPager.SCROLL_STATE_IDLE:
                        if (flag) {
                            handler.postDelayed(r, 2000);
                            flag = false;
                        }
                        break;
                }
            }
        });

        //TODO 设置读条渐变色
//        homeSwipeLayout.setColorSchemeColors(Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW);
//        homeSwipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                handler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        homeSwipeLayout.setRefreshing(false);
//                    }
//                }, 3000);
//            }
//        });
        homeItemRecycler.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int lastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                int itemCount = linearLayoutManager.getItemCount();
                if (lastVisibleItemPosition + 1 == itemCount) {
                    //加载下一页内容
                    if (!isReflash) {
                        UpdataRecycler(nextUrl);
                    }
                }
            }
        });
        //TODO 图片圆点的切换事件
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rbs = (RadioButton) group.findViewById(checkedId);
                int num = rbs.getId();
                homeItemViewPager.setCurrentItem(num%data_List.size());

            }
        });

    }


    private void setRecyAdapter() {
        homeItemRecycler.setLayoutManager(linearLayoutManager);
        recyAdapter = new HomeRecyclerAdapter(getActivity(), content_List);
        homeItemRecycler.setAdapter(new SlideInBottomAnimatorAdapter(recyAdapter,homeItemRecycler));
        recyAdapter.notifyDataSetChanged();
    }

    //TODO 设置F4 icon的名字
    private void setIconTitles() {
                for (int i = 0; i < icon_List.size(); i++) {
                    LogUtils.i("setIconTitles", "title==" + icon_List.get(i).getTitle() + "");
                    title[i].setText(icon_List.get(i).getTitle());
                }

    }


    //TODO 设置F4 icon显示
    private void setIcon() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < icon_List.size(); i++) {
                    LogUtils.i("setIcon", "getIcon_url:::" + icon_List.get(i).getIcon_url());
                    icon[i].setImageURI(icon_List.get(i).getIcon_url());
                }
            }
        },500);


        fourIconClick();
    }

    //TODO F4的点击事件
    private void fourIconClick() {
        icon[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), GloriousThingActivity.class));
            }
        });

        icon[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), StrategyTopicsActivity.class));
            }
        });

        icon[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"已签到", Snackbar.LENGTH_SHORT).show();
            }
        });


        icon[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"活动已经", Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    Runnable r;
    boolean flag;

    private void initAdapter() {
        adAdapter = new HomeAdAdapter(getActivity(), data_List);
        homeItemViewPager.setAdapter(adAdapter);
        adAdapter.notifyDataSetChanged();

        //TODO 初始化radioButton
        for (int i = 0; i <data_List.size() ; i++) {
            RadioButton rb = new RadioButton(getActivity());
            rb.setId(i);
            //设置radioButton的被选择的效果
            rb.setButtonDrawable(R.drawable.selec_ad);
            rg.addView(rb);
        }

        rg.check(0);

        r = new Runnable() {
            @Override
            public void run() {
                int position = homeItemViewPager.getCurrentItem() + 1;
                if (data_List != null && position == data_List.size()) {
                    position = 0;
                }
                homeItemViewPager.setCurrentItem(position);
                handler.postDelayed(this, 2000);
            }
        };
        handler.postDelayed(r, 2000);

    }


    //TODO Recycler 分页加载数据
    private void UpdataRecycler(String url) {
        if (url != null) {
            RequestParams updata_Params = new RequestParams(url);
            x.http().get(updata_Params, new Callback.CommonCallback<HomeContentBean>() {
                @Override
                public void onSuccess(HomeContentBean result) {
                    if (result != null) {
                        List<HomeContentBean.DataBean.ItemsBean> ItemsBean = result.getData().getItems();
                        content_List.addAll(ItemsBean);
                        recyAdapter.notifyDataSetChanged();
                        nextUrl = result.getData().getPaging().getNext_url();
                    }
                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {

                }

                @Override
                public void onCancelled(CancelledException cex) {

                }

                @Override
                public void onFinished() {

                }
            });
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        handler.removeCallbacks(r);
    }
}
