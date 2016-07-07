package com.lovegift.lv.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.lovegift.lv.bean.SearchStrategyBean;
import com.lovegift.lv.lovegift.CommodityActivity;
import com.lovegift.lv.lovegift.R;
import com.lovegift.lv.lovegift.SearchStrategyActivity;
import com.lovegift.lv.url.Urls;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by lin-pc on 2016/6/27.
 */
public class SearchPagerStrategyAdapter extends RecyclerView.Adapter<SearchPagerStrategyAdapter.strategyHolder> {
    private Context context;
    private List<SearchStrategyBean.DataBean.PostsBean> strategyList;
    private ImageLoader loader;
    private LayoutInflater inflater;


    public SearchPagerStrategyAdapter(Context context, List<SearchStrategyBean.DataBean.PostsBean> strategyList, ImageLoader loader) {
        this.context = context;
        this.strategyList = strategyList;
        this.loader = loader;
        inflater = inflater.from(context);
    }

    @Override
    public strategyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.search_pager_strategy, parent, false);
        strategyHolder sh = new strategyHolder(view);
        return sh;
    }

    @Override
    public void onBindViewHolder(strategyHolder holder, final int position) {
        holder.tv.setText(strategyList.get(position).getTitle());
        holder.tv1.setText(strategyList.get(position).getLikes_count()+"");
        loader.displayImage(strategyList.get(position).getCover_image_url(), holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = strategyList.get(position).getCover_image_url();
                String title = strategyList.get(position).getTitle();
                Intent intent = new Intent(context, SearchStrategyActivity.class);
                intent.putExtra("url", url);
                intent.putExtra("title", title);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return strategyList.size();
    }

    class strategyHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        CheckBox cbox;
        TextView tv;
        TextView tv1;

        public strategyHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            cbox = (CheckBox) itemView.findViewById(R.id.cbox);
            tv = (TextView) itemView.findViewById(R.id.tv);
            tv1 = (TextView) itemView.findViewById(R.id.tv1);
        }
    }
}
