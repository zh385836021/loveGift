package com.lovegift.lv.lovegift;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.lovegift.lv.adapter.GuideAdapter;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GuideActivity extends AppCompatActivity {


    @Bind(R.id.guide_viewPager)
    ViewPager guideViewPager;
    @Bind(R.id.ll_point)
    LinearLayout llPoints;
    @Bind(R.id.btn_enter_main)
    Button btnEnterMain;

    private ArrayList<ImageView> ivList=new ArrayList<>();
    private ArrayList<View> pointList=new ArrayList<>();
    private int currentPos = 0;
    private GuideAdapter adapter;

    private int[] iv_Resource = {R.drawable.walkthrough_1,
            R.drawable.walkthrough_2,
            R.drawable.walkthrough_3,
            R.drawable.walkthrough_4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);

        initData();
        initAdapter();
        registerListener();
    }




    private void initData() {
        for (int i = 0; i <iv_Resource.length ; i++) {
            ImageView imageView=new ImageView(this);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(
                    RadioGroup.LayoutParams.WRAP_CONTENT,
                    RadioGroup.LayoutParams.MATCH_PARENT);

            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageResource(iv_Resource[i]);

            //TODO 把圆点放进集合
            ivList.add(imageView);
        }

        //TODO 初始化小圆点
        initPoints();
    }

    private void initPoints() {
        for (int i = 0; i < iv_Resource.length; i++) {
            View point = new View(this);
            point.setBackgroundResource(R.drawable.selector_point);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(10, 10);
            params.setMargins(3,0,3,0);
            point.setLayoutParams(params);
            //TODO 让每个圆点都记录下自己的下标
            pointList.add(point);
            point.setTag(i);
            if (i == 0) {
                //TODO 默认一开始显示的是第一页
                point.setEnabled(false);
            } else {
                point.setEnabled(true);
            }

            // TODO 将圆点添加到布局中
            llPoints.addView(point);
        }

    }

    private void initAdapter() {
        adapter=new GuideAdapter(this,ivList);
        guideViewPager.setAdapter(adapter);
    }

    private void registerListener() {
        guideViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                pointList.get(currentPos).setEnabled(true);
                pointList.get(position).setEnabled(false);
                currentPos = position;
                if (position == ivList.size() - 1) {
                    // 如果滑动到了最后一个页面，就显示按钮
                    btnEnterMain.setVisibility(View.VISIBLE);
                } else {
                    btnEnterMain.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        btnEnterMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuideActivity.this,NavigationActivity.class));
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
