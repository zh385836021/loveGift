package com.lovegift.lv.bean;

import com.lovegift.lv.BaseApp.MyParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * Created by Administrator on 2016/6/20.
 */
@HttpResponse(parser = MyParser.class)
public class HotCommodityData {
    public int code;

    public DatasEntity data;
    public String message;

    public static class DatasEntity {

        public PagingEntity paging;

        public List<ItemsEntity> items;


        public static class PagingEntity {
            public String next_url;

        }

        public static class ItemsEntity {

            public DataEntity data;

            public static class DataEntity {
                public String cover_image_url;
                public int favorites_count;
                public int id;
                public boolean is_favorite;
                public String name;
                public String price;

            }
        }
    }
}
