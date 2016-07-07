package com.lovegift.lv.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.lovegift.lv.bean.Comments;
import com.lovegift.lv.lovegift.R;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2016/6/22.
 */
public class CommentRecyclerViewAdapter extends RecyclerView.Adapter<CommentRecyclerViewAdapter.MyHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Comments.DataEntity.CommentsEntity> commentsList;
    private ImageLoader loader;
    private DisplayImageOptions options;

    public CommentRecyclerViewAdapter(Context context,ArrayList<Comments.DataEntity.CommentsEntity> commentsList,ImageLoader loader){
        this.loader=loader;
        this.context=context;
        this.commentsList=commentsList;
        layoutInflater=LayoutInflater.from(context);
        // 使用DisplayImageOptions.Builder()创建DisplayImageOptions
        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.me_avatar_boy)         // 设置图片在下载期间显示的图片
                .showImageForEmptyUri(R.mipmap.me_avatar_boy)       // 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.mipmap.me_avatar_boy)            // 设置图片加载/解码过程中错误时候显示的图片
                .bitmapConfig(Bitmap.Config.RGB_565)                // 设置图片的解码类型
                .imageScaleType(ImageScaleType.EXACTLY_STRETCHED)   // 设置图片以何种编码方式显示
                .cacheInMemory(true)                                // 设置下载的图片是否缓存在内存中
                .cacheOnDisk(true)                                  // 设置下载的图片是否缓存在SD卡中
                .displayer(new RoundedBitmapDisplayer(90))          // 设置成圆角图片
                .build();                                           // 创建配置过得DisplayImageOption对象


    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.item_recycler_comment,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        Comments.DataEntity.CommentsEntity data = commentsList.get(position);
        holder.tv_nickname.setText(data.user.nickname);//设置姓名

        //设置评论内容:判断是否是回复他人的评论
        if (data.reply_to_id == 0) {
            holder.tv_content.setText(data.content);
        } else {
            holder.tv_content.setText("回复" + data.replied_user.nickname + ":" + data.content);
        }

        ImageLoader imageLoader = ImageLoader.getInstance();
        if (data.user.avatar_url.indexOf("liwushuo") >= 0) {
            imageLoader.init(ImageLoaderConfiguration.createDefault(context));
            imageLoader.displayImage(data.user.avatar_url, holder.iv_avatar, options);
        } else {
            holder.iv_avatar.setImageResource(R.mipmap.me_avatar_boy);
        }
        holder.tv_created_at.setText(getCreatTime((long) data.created_at));
    }

    //格式化评论时间
    public String getCreatTime(long createdTime) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM月dd日 , HH:mm");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(createdTime * 1000);//用给定的long值设置此 Calendar的当前时间值。
        Date date = calendar.getTime();// 返回Data对象,可用于格式化
        return formatter.format(date);//格式化成:"MM月dd日 , HH:mm"

    }

    @Override
    public int getItemCount() {
        return commentsList==null?0:commentsList.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        private ImageView iv_avatar;
        private TextView tv_nickname,tv_content,tv_created_at;
        public MyHolder(View itemView) {
            super(itemView);
            iv_avatar= (ImageView) itemView.findViewById(R.id.iv_avatar);
            tv_nickname= (TextView) itemView.findViewById(R.id.tv_nickname);
            tv_content= (TextView) itemView.findViewById(R.id.tv_content);
            tv_created_at= (TextView) itemView.findViewById(R.id.tv_created_at);
        }
    }

}
