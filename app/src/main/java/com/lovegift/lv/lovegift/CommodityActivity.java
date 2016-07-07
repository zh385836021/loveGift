package com.lovegift.lv.lovegift;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.lovegift.lv.bean.CommodityDetail;
import com.lovegift.lv.fragment.CommentFragment;
import com.lovegift.lv.fragment.IntroduceFragment;
import com.lovegift.lv.request.GiftRequest;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

public class CommodityActivity extends BaseActivity {

    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.appBarLayout)
    AppBarLayout appBarLayout;
    @Bind(R.id.vp_commodity)
    ViewPager vpCommodity;
    @Bind(R.id.ll_point)
    LinearLayout llPoint;
    @Bind(R.id.rLayout)
    RelativeLayout rLayout;
    @Bind(R.id.tv_name)
    TextView tvName;
    @Bind(R.id.tv_price)
    TextView tvPrice;
    @Bind(R.id.tv_description)
    TextView tvDescription;
    @Bind(R.id.ll_text)
    LinearLayout llText;
    @Bind(R.id.tbLayout)
    TabLayout tbLayout;
    @Bind(R.id.appbar)
    AppBarLayout appbar;
    @Bind(R.id.vp_comment)
    ViewPager vpComment;
    @Bind(R.id.btn_goTianMao)
    Button btnGoTianMao;
    @Bind(R.id.bottom_llayout)
    LinearLayout bottomLlayout;
    @Bind(R.id.main_content)
    LinearLayout mainContent;
    private ArrayList<ImageView> ivList=new ArrayList<>();
    private ArrayList<View> pointList=new ArrayList<>();
    private String url_commodity; //商品详情页面URL
    private int commodityId; //商品ID
    private StringBuilder sb=new StringBuilder();
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private MyFragmentPager mFragmentPager;
    private RequestQueue queue;
    private ArrayList<String> imageUrlList;
    private String purchase_url;//天猫购买页面的URL
    private String detail_html;//图文介绍页面使用的Html字符串
    private int currentPos = 0;//商品图片展示初始展示页
    private MyPagerAdapter mpagerAdapter;
    private String comments_count;
    private String[] mTitles;
    private com.nostra13.universalimageloader.core.ImageLoader loader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_commodity);
        //使用ButterKnife初始化控件
        ButterKnife.bind(this);
        queue= Volley.newRequestQueue(this);
       // loader=((MyApp)getApplication()).getLoader();
        setTabViewPager();
        //初始化Toobar设置相关属性
        initToobar();
        //初始化数据商品详情页面数据
        initData();
        setListener();
        //将TabLayout和ViewPager关联起来
        tbLayout.setupWithViewPager(vpComment);
    }

    @Override
    protected void getIntentData(Bundle savedInstanceState) {
        Intent intent=getIntent();
        url_commodity=intent.getStringExtra("url_commodity");
        commodityId=intent.getIntExtra("COMMODITYID",-1);
    }

    private void setListener() {
        btnGoTianMao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommodityActivity.this,PurchaseActivity.class);
                intent.putExtra("purchase_url", purchase_url);
                startActivity(intent);
            }
        });
    }

    private void initData() {
        GiftRequest<CommodityDetail> request=new GiftRequest<CommodityDetail>(
                CommodityDetail.class,
                url_commodity,
                new Response.Listener<CommodityDetail>() {
                    @Override
                    public void onResponse(CommodityDetail response) {
                        imageUrlList = response.data.image_urls;
                        detail_html = response.data.detail_html;
                        purchase_url = response.data.purchase_url;
                        // 显示商品图片信息
                        initImageList();
                        setpagerAdapter();
                        // 显示商品文字信息
                        tvName.setText(response.data.name);
                        tvPrice.setText(response.data.price);
                        tvDescription.setText(response.data.description);
                        //添加页卡Fragment
                        fragments.add(IntroduceFragment.getInstance(detail_html));
                        fragments.add(CommentFragment.getInstance(commodityId));
                        //获取评论数量
                        comments_count=response.data.comments_count+"";
                        //添加图文介绍和评论页卡标题
                        sb.append("评论(" + comments_count + ")");
                        mTitles=new String[]{"图文介绍",sb.toString()};
                        //刷新图文介绍和评论 ViewPager的适配器
                        mFragmentPager.notifyDataSetChanged();

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(CommodityActivity.this, "数据下载失败！", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        queue.add(request);
    }

    private void setpagerAdapter() {
        mpagerAdapter=new MyPagerAdapter();
        vpCommodity.setAdapter(mpagerAdapter);
    }

    /**
     * 初始化商品图片集合
     * 在图片集合加载完成后再初始化圆点
     */
    private void initImageList() {
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .bitmapConfig(Bitmap.Config.RGB_565)                //设置图片的解码类型
                .imageScaleType(ImageScaleType.EXACTLY_STRETCHED)   //设置图片以何种编码方式显示
                .cacheInMemory(true)                                // 设置下载的图片是否缓存在内存中
                .cacheOnDisk(true)                                  // 设置下载的图片是否缓存在SD卡中
                .build();

        loader= com.nostra13.universalimageloader.core.ImageLoader.getInstance();
        loader.init(ImageLoaderConfiguration.createDefault(this));

        for (int i = 0; i < imageUrlList.size(); i++) {
            ImageView tempImageView = new ImageView(this);
            tempImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(
                    RadioGroup.LayoutParams.MATCH_PARENT,
                    RadioGroup.LayoutParams.MATCH_PARENT);
            tempImageView.setLayoutParams(layoutParams);
            // 开始加载图片
            loader.displayImage(imageUrlList.get(i), tempImageView,options);
            ivList.add(tempImageView);
            if (ivList.size() == imageUrlList.size()) {
                initPoints();
                vpCommodity.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                        pointList.get(currentPos).setEnabled(true);
                        pointList.get(position).setEnabled(false);
                        currentPos = position;
                    }

                    @Override
                    public void onPageSelected(int position) {

                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
            }
        }
    }

    /**
     * 初始化圆点
     */

    private void initPoints() {
        for (int i = 0; i < ivList.size(); i++) {
            View point = new View(this);
            point.setBackgroundResource(R.drawable.selector_commodity_point);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(15, 15);
            params.setMargins(5, 0, 5, 0);
            point.setLayoutParams(params);
            pointList.add(point);
            if (i == 0) {
                // 默认一开始显示的是第一页
                point.setEnabled(false);
            } else {
                point.setEnabled(true);
            }
            // 让每个圆点都记录下自己的下标
            point.setTag(i);
            // 将圆点添加到布局中
            llPoint.addView(point);
        }
    }


    private void initToobar() {
        setSupportActionBar(toolbar);
        //显示左侧的返回箭头默认是不显示的
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //不显示title
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void setTabViewPager() {
        mFragmentPager=new MyFragmentPager(getSupportFragmentManager());
        vpComment.setAdapter(mFragmentPager);
    }

    //右上角菜单位置分享按钮初始化
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.share,menu);
        return true;
    }
    //分享按钮点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_share:
                ShareSDK.initSDK(this);
                OnekeyShare oks = new OnekeyShare();
                //关闭sso授权
                oks.disableSSOWhenAuthorize();
                // title标题：微信、QQ（新浪微博不需要标题）
                oks.setTitle("我是分享标题");  //最多30个字符
                // text是分享文本：所有平台都需要这个字段
                oks.setText("我是分享文本，啦啦啦~http://uestcbmi.com/");  //最多40个字符
                // imagePath是图片的本地路径：除Linked-In以外的平台都支持此参数
                //oks.setImagePath(Environment.getExternalStorageDirectory() + "/meinv.jpg");//确保SDcard下面存在此张图片
                //网络图片的url：所有平台
                oks.setImageUrl("http://7sby7r.com1.z0.glb.clouddn.com/CYSJ_02.jpg");//网络图片rul
                // url：仅在微信（包括好友和朋友圈）中使用
                oks.setUrl("http://sharesdk.cn");   //网友点进链接后，可以看到分享的详情
                // Url：仅在QQ空间使用
                oks.setTitleUrl("http://www.baidu.com");  //网友点进链接后，可以看到分享的详情
                // 启动分享GUI
                oks.show(this);
                return true;
            case android.R.id.home://左侧返回箭头的点击事件
                finish();
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ShareSDK.stopSDK(this);
    }

    /**
     * 商品详情图片展示ViewPager适配器
     */
    class MyPagerAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return ivList==null?0:ivList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(ivList.get(position));
            return ivList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(ivList.get(position));
        }
    }

    /**
     * 图文介绍和评论 ViewPager适配器
     */
    class MyFragmentPager extends FragmentPagerAdapter{

        public MyFragmentPager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments==null?0: fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }

    }

}
