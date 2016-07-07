package com.lovegift.lv.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/6/23 0023.
 */
public class MyListview extends ListView {

    public MyListview(Context context) {
        super(context);
    }

    public MyListview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, height);
    }
}
