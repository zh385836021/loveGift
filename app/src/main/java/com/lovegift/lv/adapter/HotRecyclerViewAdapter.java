package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.lovegift.lv.bean.HotCommodityData;
import com.lovegift.lv.lovegift.CommodityActivity;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.url.Urls;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/6/21.
 */
public class HotRecyclerViewAdapter extends RecyclerView.Adapter<HotRecyclerViewAdapter.MyViewHolder> {
    private ArrayList<HotCommodityData.DatasEntity.ItemsEntity.DataEntity> listCommodityData;
    private Context context;
    private LayoutInflater inflater;
    private StringBuilder sb=new StringBuilder();
    private ImageLoader loader;

    public HotRecyclerViewAdapter(Context context,ArrayList<HotCommodityData.DatasEntity.ItemsEntity.DataEntity> listCommodityData,ImageLoader loader){
        this.loader=loader;
        this.context=context;
        this.listCommodityData=listCommodityData;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.item_recyclerview_commodity,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        if(listCommodityData!=null){
            holder.tv_name.setText(listCommodityData.get(position).name);
            holder.tv_price.setText(listCommodityData.get(position).price);
            holder.tv_favorites_count.setText(getFotmatFavoritescount(listCommodityData.get(position).favorites_count));
            String iconUrl=listCommodityData.get(position).cover_image_url;
            loader.displayImage(iconUrl,holder.imageView);
           //设置imageView的点击事件
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id = listCommodityData.get(position).id;
                    String url_commodity = Urls.URL_COMMODITY + "/" + id;
                    Intent intent = new Intent(context, CommodityActivity.class);
                    intent.putExtra("url_commodity", url_commodity);
                    intent.putExtra("COMMODITYID", id);
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
            return listCommodityData==null?0:listCommodityData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView tv_name,tv_price,tv_favorites_count;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.imageView);
            tv_name= (TextView) itemView.findViewById(R.id.tv_name);
            tv_price= (TextView) itemView.findViewById(R.id.tv_price);
            tv_favorites_count= (TextView) itemView.findViewById(R.id.tv_favorites_count);
        }
    }

    //格式化喜欢数量的方法
    public String getFotmatFavoritescount(int favorites_count){
        //如果数量小于1000就直接显示
        if (favorites_count<1000){
            return favorites_count+"";
        }else {
            sb.delete(0,sb.length());
            String thousand =favorites_count/1000+"";
            sb.append(thousand+".");
            String hundred=favorites_count%1000/100+"";
            sb.append(hundred+"k");
            return sb.toString();
        }
    }
}
