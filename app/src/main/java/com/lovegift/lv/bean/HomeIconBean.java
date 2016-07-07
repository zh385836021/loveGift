package com.lovegift.lv.bean;

import com.lovegift.lv.BaseApp.MyParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * 首页F4图标实体类
 * Created by Zane on 2016/6/20.
 */
@HttpResponse(parser= MyParser.class)
public class HomeIconBean {

    /**
     * code : 200
     * data : {"promotions":[{"color":"#81c52b","icon_url":"http://img02.liwushuo.com/image/150310/62ggu1j0m.png-pw144","id":1,"order":null,"status":0,"target_url":"liwushuo:///page?type=topic&topic_id=22&page_action=navigation&title=%e6%af%8f%e6%97%a5%e5%8d%81%e4%bb%b6%e7%be%8e%e5%a5%bd%e5%b0%8f%e7%89%a9","title":"美好小物"},{"color":"#fc716f","icon_url":"http://img03.liwushuo.com/image/150319/8edxk0je6.png-pw144","id":2,"order":null,"status":0,"target_url":"liwushuo:///page?type=topic_all","title":"攻略专题"},{"color":"#8686ff","icon_url":"http://img02.liwushuo.com/image/150310/f3hvat0ac.png-pw144","id":3,"order":null,"status":0,"target_url":"liwushuo:///page?type=url&url=http%3a%2f%2fwww.liwushuo.com%2fcredit%2fsign&login=true&right_item_title=","title":"每日签到"},{"color":"#fd6f9e","icon_url":"http://img03.liwushuo.com/image/150310/2q080j10l.png-pw144","id":4,"order":null,"status":0,"target_url":"","title":"天天刮奖"}]}
     * message : OK
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HomeIconBean{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

    public static class DataBean {
        /**
         * color : #81c52b
         * icon_url : http://img02.liwushuo.com/image/150310/62ggu1j0m.png-pw144
         * id : 1
         * order : null
         * status : 0
         * target_url : liwushuo:///page?type=topic&topic_id=22&page_action=navigation&title=%e6%af%8f%e6%97%a5%e5%8d%81%e4%bb%b6%e7%be%8e%e5%a5%bd%e5%b0%8f%e7%89%a9
         * title : 美好小物
         */

        private List<PromotionsBean> promotions;

        public List<PromotionsBean> getPromotions() {
            return promotions;
        }

        public void setPromotions(List<PromotionsBean> promotions) {
            this.promotions = promotions;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "promotions=" + promotions +
                    '}';
        }

        public static class PromotionsBean {
            private String color;
            private String icon_url;
            private int id;
            private Object order;
            private int status;
            private String target_url;
            private String title;

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public Object getOrder() {
                return order;
            }

            public void setOrder(Object order) {
                this.order = order;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getTarget_url() {
                return target_url;
            }

            public void setTarget_url(String target_url) {
                this.target_url = target_url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            @Override
            public String toString() {
                return "PromotionsBean{" +
                        "color='" + color + '\'' +
                        ", icon_url='" + icon_url + '\'' +
                        ", id=" + id +
                        ", order=" + order +
                        ", status=" + status +
                        ", target_url='" + target_url + '\'' +
                        ", title='" + title + '\'' +
                        '}';
            }
        }

    }
}
