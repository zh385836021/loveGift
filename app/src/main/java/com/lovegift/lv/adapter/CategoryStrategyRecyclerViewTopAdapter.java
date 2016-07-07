package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.lovegift.lv.bean.CategoryStrateryRecyclerViewTopBean;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.lovegift.StrategyPostActivity;
import com.lovegift.lv.url.Urls;

import java.util.List;

/**
 * Created by Xu on 2016/6/21 0021.
 */
public class CategoryStrategyRecyclerViewTopAdapter extends RecyclerView.Adapter<CategoryStrategyRecyclerViewTopAdapter.ViewHolder> {

    private List<CategoryStrateryRecyclerViewTopBean.DataBean.CollectionsBean> data;
    private Context context;

    public CategoryStrategyRecyclerViewTopAdapter(Context context,List<CategoryStrateryRecyclerViewTopBean.DataBean.CollectionsBean> data){
       this.context = context;
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.fragment_category_recyclerview,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.sdv.setImageURI(data.get(position).getBanner_image_url());

        //设置滚动的每张图片的监听事件

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,StrategyPostActivity.class);
                intent.putExtra("title",data.get(position).getTitle());
                intent.putExtra("id", Urls.strategySubUrl(data.get(position).getId()));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size()==0?0:data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private View view;
        private SimpleDraweeView sdv;

        public ViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
            sdv = (SimpleDraweeView) itemView.findViewById(R.id.category_strategy_recyclerview_sdv);
        }
    }

}
