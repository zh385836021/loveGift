package com.lovegift.lv.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by lin-pc on 2016/6/20.
 */
public class SearchButton extends Button {
    public SearchButton(Context context) {
        super(context);
    }

    public SearchButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        widthMeasureSpec =  MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels/8,MeasureSpec.EXACTLY);
        heightMeasureSpec = widthMeasureSpec;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
