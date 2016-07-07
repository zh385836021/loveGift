package com.lovegift.lv.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lovegift.lv.bean.CategoryGiftBean;
import com.lovegift.lv.lovegift.R;

import java.util.List;

/**
 * Created by Administrator on 2016/6/23 0023.
 */
public class CategoryGiftRvAdapter extends RecyclerView.Adapter<CategoryGiftRvAdapter.MyHolder> {

    private List<CategoryGiftBean.DataBean.CategoriesBean> data;
    private Context context;
    private CategoryGiftRvRvAdapter rv_rv_adapter;

    public CategoryGiftRvAdapter(Context context,List<CategoryGiftBean.DataBean.CategoriesBean> data){
        this.context = context;
        this.data = data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.category_gift_rv,parent,false));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.tv.setText(data.get(position).getName());

        //这里为三列的 grid类型的recyclerview
        holder.rv.setLayoutManager(new GridLayoutManager(context,3));
        rv_rv_adapter = new CategoryGiftRvRvAdapter(context,data.get(position).getSubcategories());
        holder.rv.setAdapter(rv_rv_adapter);

    }

    @Override
    public int getItemCount() {
        return data.size()==0?0:data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        private TextView tv;
        private RecyclerView rv;

        public MyHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.gift_rv_title);
            rv = (RecyclerView) itemView.findViewById(R.id.gift_rv_rv);
        }
    }

}
