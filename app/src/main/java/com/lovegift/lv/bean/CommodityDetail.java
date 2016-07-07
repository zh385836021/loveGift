package com.lovegift.lv.bean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/6/22.
 */
public class CommodityDetail {
    public DataEntity data;

    public static class DataEntity {
        public String description;
        public String detail_html;
        public int comments_count;
        public String name;
        public String price;
        public ArrayList<String> image_urls;
        public String purchase_url;
    }
}
