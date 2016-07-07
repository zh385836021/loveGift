package com.lovegift.lv.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lovegift.lv.bean.CategoryGiftBean;
import com.lovegift.lv.lovegift.R;

import java.util.List;

/**
 * Created by Xu on 2016/6/23 0023.
 *
 * 礼物页面中listview的适配器
 */

public class CategoryGiftLvAdapter extends BaseAdapter {

    private List<CategoryGiftBean.DataBean.CategoriesBean> data;
    private Context context;

    public CategoryGiftLvAdapter(Context context,List<CategoryGiftBean.DataBean.CategoriesBean> data){
        this.context=context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size()==0?0:data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.category_gift_lv,parent,false);
            holder = new ViewHolder(convertView);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv.setText(data.get(position).getName());

        return convertView;
    }

    class ViewHolder{
        private TextView tv;

        private ViewHolder(View view){
            tv = (TextView) view.findViewById(R.id.gift_lv_tv);
            view.setTag(this);
        }
    }
}
