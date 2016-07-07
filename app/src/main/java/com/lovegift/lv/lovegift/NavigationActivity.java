package com.lovegift.lv.lovegift;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.lovegift.lv.fragment.CategoryFragment;
import com.lovegift.lv.fragment.HomeFragment;
import com.lovegift.lv.fragment.HotFragment;
import com.lovegift.lv.fragment.SearchFragment;
import com.lovegift.lv.utils.DataCleanManager;
import com.zxing.activity.CaptureActivity;

import java.util.ArrayList;
import java.util.List;

import cn.jpush.android.api.JPushInterface;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout main_tabLayout;
    private FrameLayout main_fragment;
    private ImageView iv_QRCode;
    private String[] title = {"首页", "热门", "分类", "搜索"};
    private int[] style = {R.drawable.bottom_home, R.drawable.bottom_hot, R.drawable.bottom_category, R.drawable.bottom_search};
    private FragmentManager manager = getSupportFragmentManager();
    private List<Fragment> list;
    private Toolbar toolbar;
    private static final int RESULT_CODE = 0;
    private static double VERSION = 1.0;
    private NavigationView navigationView;
    private String info;
    private TextView headTv;
    private ImageView headIv;
    private DrawerLayout drawer;
    private int currentPosition;
    private static final  int REQUEST_CODE=110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main2);
        toolbar = (Toolbar) findViewById(R.id.nav_toolbar);
        setSupportActionBar(toolbar);
        VERSION++;

        initView();//初始化布局控件
        initTabs();//初始化TabLayout
        initFragment();//初始化Fragment
        setTabListener();//tablayout的监听

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_identity:
                break;

            case R.id.nav_push_notifiy:
                JPushInterface.init(getApplicationContext());
                Snackbar.make(toolbar, "已经启用消息推送功能", Snackbar.LENGTH_SHORT).show();
                break;

            case R.id.nav_update:
                Snackbar.make(toolbar, "当前版本号：Version" + VERSION + "，已是最新", Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.nav_clear_cache:
                DataCleanManager.cleanInternalCache(this);
                DataCleanManager.cleanExternalCache(this);
                Snackbar.make(toolbar, "已经清除缓存", Snackbar.LENGTH_SHORT).show();
                break;

        }


        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void setTabListener() {

        main_tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = Integer.parseInt(tab.getTag().toString());

                if (!list.get(position).isAdded()) {
                    manager.beginTransaction().add(R.id.main_framelayout, list.get(position)).commitAllowingStateLoss();
                }

                for (int i = 0; i < list.size(); i++) {
                    if (i == position) {
                        if (i != 3) {
                            manager.beginTransaction().show(list.get(i)).commitAllowingStateLoss();
                            currentPosition = position;
                        } else {
                            startActivityForResult(new Intent(NavigationActivity.this, SearchActivity.class), 10086);
                            return;
                        }
                    } else {
                        manager.beginTransaction().hide(list.get(i)).commitAllowingStateLoss();
                    }
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //TODO 二维码扫描
        iv_QRCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(NavigationActivity.this, CaptureActivity.class), RESULT_CODE);
            }
        });

        ClickLogin();

    }

    private void ClickLogin() {
        View headerView = navigationView.getHeaderView(0);
        headTv = (TextView) headerView.findViewById(R.id.nav_head_tv);
        headIv = (ImageView) headerView.findViewById(R.id.nav_header_iv);
        headIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(info)) {
                    startActivityForResult(new Intent(NavigationActivity.this, LoginActivity.class),REQUEST_CODE);
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    Snackbar.make(view, "您已经登录了", Snackbar.LENGTH_SHORT).show();
                    return;
                }


            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) { //成功获取结果
            String result = data.getExtras().getString("result");
            Log.i("mtag", "onActivityResult: result  " + result);
        }

        if (resultCode==REQUEST_CODE) {
            String name=data.getStringExtra("username");
            headIv.setImageResource(R.drawable.head_a);
            headTv.setText(name);
        }
    }

    private void initFragment() {
        list = new ArrayList<>();

        list.add(new HomeFragment());
        list.add(new HotFragment());
        list.add(new CategoryFragment());
        list.add(new SearchFragment());

        manager.beginTransaction().replace(R.id.main_framelayout, list.get(0)).commit();
    }

    private void initTabs() {
        main_tabLayout.setSelectedTabIndicatorHeight(0);
        for (int i = 0; i < style.length; i++) {
            TabLayout.Tab tab = main_tabLayout.newTab().setText(title[i]).setTag(i).setIcon(style[i]);
            main_tabLayout.addTab(tab);
        }
    }

    private void initView() {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        iv_QRCode = (ImageView) findViewById(R.id.iv_QRCode);
        main_tabLayout = (TabLayout) findViewById(R.id.main_tablayout);
        main_fragment = (FrameLayout) findViewById(R.id.main_framelayout);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



    }


    @Override
    protected void onPause() {
        super.onPause();
        JPushInterface.onPause(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        JPushInterface.onResume(this);
    }



    @Override
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        switch (requestCode) {
            case 10086:
                main_tabLayout.getTabAt(currentPosition).select();
                break;

        }
        super.startActivityForResult(intent, requestCode, options);
    }

}
