package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lovegift.lv.bean.StratergyGridviewBean;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.lovegift.StrategyGvItemActivity;
import com.lovegift.lv.url.Urls;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/6/22 0022.
 */
public class StrategyGridviewAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<StratergyGridviewBean.DataBean.ChannelGroupsBean.ChannelsBean> data = new ArrayList<>();

    public StrategyGridviewAdapter(Context context,ArrayList<StratergyGridviewBean.DataBean.ChannelGroupsBean.ChannelsBean> data){
        this.context = context;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.strategy_gridview_item,parent,false);
            holder = new ViewHolder(convertView);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv.setText(data.get(position).getName());
        holder.sdv.setImageURI(data.get(position).getIcon_url());

        holder.sdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, StrategyGvItemActivity.class);
                intent.putExtra("urlId", Urls.strategyChannelGroupsUrl(data.get(position).getId()));
                intent.putExtra("name",data.get(position).getName());
                context.startActivity(intent);
            }
        });

        return convertView;
    }

    class ViewHolder{
        private SimpleDraweeView sdv;
        private TextView tv;


        public ViewHolder(View v){
            sdv = (SimpleDraweeView) v.findViewById(R.id.strategy_gridview_sdv);
            tv = (TextView) v.findViewById(R.id.strategy_gridview_tv);
            v.setTag(this);
        }
    }
}
