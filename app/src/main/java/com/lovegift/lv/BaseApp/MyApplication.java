package com.lovegift.lv.BaseApp;

import android.app.Application;
import android.graphics.Bitmap;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.lovegift.lv.lovegift.R;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

import org.xutils.DbManager;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

import java.io.File;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Zane on 2016/6/21.
 */
public class MyApplication extends Application {

    private ImageLoader loader;

    private DbManager manager;

    public ImageLoader getLoader() {
        return loader;
    }

    public DbManager getDb() {
        return manager;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        //TODO 初始化xutils框架
        x.Ext.init(this);

//        //TODO 初始化Vitamio
//        Vitamio.isInitialized(getApplicationContext());

        //TODO 初始化Fresco框架
        Fresco.initialize(getApplicationContext());

        //TODO 初始化JPushi
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

        //TODO 初始化数据库
        initManager();

        loader = ImageLoader.getInstance();

        //loader对象的手动配置
        // 初始化ImageLoaderConfiguration类对象
        ImageLoaderConfiguration config = initConfiguration();
        loader.init(config);
    }

    private void initManager() {
        //TODO 初始化DbManager对象
        DbManager.DaoConfig config = getDaoConfig();

        manager = x.getDb(config);
//        try {
//            manager.save(new User("admin","123"));
//        } catch (DbException e) {
//            e.printStackTrace();
//        }
    }

    private DbManager.DaoConfig getDaoConfig() {
        return new DbManager.DaoConfig()
                .setDbName("gift") //设置数据库文件的名称
                .setDbVersion(1)  //设置数据库的版本号
                .setDbDir(getCacheDir())  //指定数据库文件的存储位置
                .setAllowTransaction(true)  //设置是否支持事务操作
                .setDbOpenListener(new DbManager.DbOpenListener() {
                    @Override
                    public void onDbOpened(DbManager dbManager) {
                        Log.i("mtag", "onDbOpened: 数据库被打开了");
                    }
                })
                .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                    @Override
                    public void onUpgrade(DbManager dbManager, int i, int i1) {
                        Log.i("mtag", "onUpgrade: 数据库版本更新");
                    }
                })
                .setTableCreateListener(new DbManager.TableCreateListener() {
                    @Override
                    public void onTableCreated(DbManager dbManager, TableEntity<?> tableEntity) {
                        Log.i("mtag", "onTableCreated: 数据表被第一次创建！！！！");
                    }
                });
    }

    private ImageLoaderConfiguration initConfiguration() {
        File file = getCacheDir(); //获取缓存文件夹，位于：data/data/程序包名/caches
        if (!file.exists()) {
            file.mkdirs();
        }

        DisplayImageOptions options = initDisplayOptions();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
                .threadPoolSize(3)  //最多可以同时下载多少张图片
                .memoryCacheSizePercentage(30)  //设置最大的内容大小，占用可用内存的百分比
                .memoryCache(new LruMemoryCache(2*1024*1024)) //设置的缓存策略
                .diskCacheSize(10*1024*1024) //设置磁盘缓存的最大带下
                .diskCache(new UnlimitedDiskCache(file))  //设置磁盘缓存策略,参数中的file对象：设置图片的存储地址
                .diskCacheFileNameGenerator(new HashCodeFileNameGenerator()) //设置文件的命名方式
                .defaultDisplayImageOptions(options)  //设置图片显示时的配置信息
                .build();

        return config;
    }

    private DisplayImageOptions initDisplayOptions() {

        return new DisplayImageOptions.Builder()
                .cacheInMemory(true)  //是指图片下载后是否缓存到内存中
                .cacheOnDisk(true)//是指图片下载后是否到本地
                .showImageOnLoading(R.mipmap.ig_holder_image_large)  // 设置图片下载过程中，控件上显示的图片
                .showImageOnFail(R.mipmap.ig_holder_image_large) //设置图片下载失败，控件上显示的图片
                .showImageForEmptyUri(R.mipmap.ig_holder_image_large)//设置图片Uri为空或是错误的时候显示的图片
                .imageScaleType(ImageScaleType.EXACTLY_STRETCHED)// 设置图片以何种编码方式显示
                .bitmapConfig(Bitmap.Config.RGB_565) // 设置图片的解码类型
                .displayer(new RoundedBitmapDisplayer(10))// 设置成圆角图片
                .build();

    }
}
