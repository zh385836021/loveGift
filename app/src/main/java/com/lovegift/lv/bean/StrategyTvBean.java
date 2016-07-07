package com.lovegift.lv.bean;

import com.lovegift.lv.BaseApp.MyParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * Created by Xu on 2016/6/22 0022.
 */

@HttpResponse(parser = MyParser.class)
public class StrategyTvBean {


    /**
     * code : 200
     * data : {"collections":[{"banner_image_url":"http://img01.liwushuo.com/image/160612/v5f6m0rfm.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160612/v5f6m0rfm.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160612/a8ay4ow56.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160612/a8ay4ow56.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465736270,"id":312,"order":0,"posts_count":6,"status":0,"subtitle":"颜值当然高","title":"装下整个明媚夏日的包包","updated_at":1465782458},{"banner_image_url":"http://img03.liwushuo.com/image/160612/y0szig030.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160612/y0szig030.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160612/b5xfwu4ji.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160612/b5xfwu4ji.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465736247,"id":311,"order":0,"posts_count":7,"status":0,"subtitle":"打造夏日小清新的秘籍在此","title":"清新一夏","updated_at":1465782340},{"banner_image_url":"http://img02.liwushuo.com/image/160531/nbrhjg3v6.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160531/nbrhjg3v6.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160531/xvdeuq0r8.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160531/xvdeuq0r8.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464659436,"id":301,"order":0,"posts_count":8,"status":0,"subtitle":"将生活过成诗的文艺风家居","title":"文艺家生活","updated_at":1464659436},{"banner_image_url":"http://img02.liwushuo.com/image/160525/az0729t55.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160525/az0729t55.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/160525/7lfkrq7vr.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160525/7lfkrq7vr.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464172509,"id":294,"order":0,"posts_count":11,"status":0,"subtitle":"六一献礼","title":"本宝宝这么萌，当然要过儿童节","updated_at":1464172509},{"banner_image_url":"http://img02.liwushuo.com/image/160525/o7w1va186.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160525/o7w1va186.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/160525/cxycmyi5p.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160525/cxycmyi5p.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464141012,"id":293,"order":0,"posts_count":6,"status":0,"subtitle":"无论晴天雨天，我们不见不[伞]","title":"美貌晴雨伞","updated_at":1464141012},{"banner_image_url":"http://img03.liwushuo.com/image/160524/vraqe223q.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160524/vraqe223q.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/160524/6cxt2g5kv.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160524/6cxt2g5kv.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464087738,"id":292,"order":0,"posts_count":6,"status":0,"subtitle":"这个会充电的宝宝，比男票更有安全感","title":"手机加油站","updated_at":1464087738},{"banner_image_url":"http://img01.liwushuo.com/image/160524/nrs9hktd7.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160524/nrs9hktd7.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/160524/ny0qkxyne.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160524/ny0qkxyne.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464081364,"id":291,"order":0,"posts_count":8,"status":0,"subtitle":"细节提升你的美","title":"入夏轻饰品","updated_at":1464081364},{"banner_image_url":"http://img02.liwushuo.com/image/160517/e6kho2o7d.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160517/e6kho2o7d.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160517/7qz4zpyq6.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160517/7qz4zpyq6.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463484080,"id":290,"order":0,"posts_count":7,"status":0,"subtitle":"教你如何撩妹/撩汉","title":"520脱单计划","updated_at":1463484080},{"banner_image_url":"http://img03.liwushuo.com/image/160518/cdtoe36bq.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160518/cdtoe36bq.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160518/oi08k83ji.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160518/oi08k83ji.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463452817,"id":288,"order":0,"posts_count":7,"status":0,"subtitle":"有整个夏天的味道","title":"腕间小清新","updated_at":1463452817},{"banner_image_url":"http://img03.liwushuo.com/image/160518/v8su6youf.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160518/v8su6youf.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/160518/7doo6pm3c.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160518/7doo6pm3c.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463452367,"id":286,"order":0,"posts_count":7,"status":0,"subtitle":"让你的时尚指数UP↑UP↑","title":"一周穿搭指南","updated_at":1463452367}],"paging":{"next_url":"http://api.liwushuo.com/v2/collections?limit=10&offset=10"}}
     * message : OK
     */

    private int code;
    /**
     * collections : [{"banner_image_url":"http://img01.liwushuo.com/image/160612/v5f6m0rfm.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160612/v5f6m0rfm.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160612/a8ay4ow56.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160612/a8ay4ow56.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465736270,"id":312,"order":0,"posts_count":6,"status":0,"subtitle":"颜值当然高","title":"装下整个明媚夏日的包包","updated_at":1465782458},{"banner_image_url":"http://img03.liwushuo.com/image/160612/y0szig030.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160612/y0szig030.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160612/b5xfwu4ji.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160612/b5xfwu4ji.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465736247,"id":311,"order":0,"posts_count":7,"status":0,"subtitle":"打造夏日小清新的秘籍在此","title":"清新一夏","updated_at":1465782340},{"banner_image_url":"http://img02.liwushuo.com/image/160531/nbrhjg3v6.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160531/nbrhjg3v6.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160531/xvdeuq0r8.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160531/xvdeuq0r8.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464659436,"id":301,"order":0,"posts_count":8,"status":0,"subtitle":"将生活过成诗的文艺风家居","title":"文艺家生活","updated_at":1464659436},{"banner_image_url":"http://img02.liwushuo.com/image/160525/az0729t55.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160525/az0729t55.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/160525/7lfkrq7vr.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160525/7lfkrq7vr.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464172509,"id":294,"order":0,"posts_count":11,"status":0,"subtitle":"六一献礼","title":"本宝宝这么萌，当然要过儿童节","updated_at":1464172509},{"banner_image_url":"http://img02.liwushuo.com/image/160525/o7w1va186.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160525/o7w1va186.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/160525/cxycmyi5p.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160525/cxycmyi5p.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464141012,"id":293,"order":0,"posts_count":6,"status":0,"subtitle":"无论晴天雨天，我们不见不[伞]","title":"美貌晴雨伞","updated_at":1464141012},{"banner_image_url":"http://img03.liwushuo.com/image/160524/vraqe223q.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160524/vraqe223q.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/160524/6cxt2g5kv.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160524/6cxt2g5kv.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464087738,"id":292,"order":0,"posts_count":6,"status":0,"subtitle":"这个会充电的宝宝，比男票更有安全感","title":"手机加油站","updated_at":1464087738},{"banner_image_url":"http://img01.liwushuo.com/image/160524/nrs9hktd7.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160524/nrs9hktd7.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/160524/ny0qkxyne.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160524/ny0qkxyne.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464081364,"id":291,"order":0,"posts_count":8,"status":0,"subtitle":"细节提升你的美","title":"入夏轻饰品","updated_at":1464081364},{"banner_image_url":"http://img02.liwushuo.com/image/160517/e6kho2o7d.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160517/e6kho2o7d.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160517/7qz4zpyq6.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160517/7qz4zpyq6.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463484080,"id":290,"order":0,"posts_count":7,"status":0,"subtitle":"教你如何撩妹/撩汉","title":"520脱单计划","updated_at":1463484080},{"banner_image_url":"http://img03.liwushuo.com/image/160518/cdtoe36bq.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160518/cdtoe36bq.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160518/oi08k83ji.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160518/oi08k83ji.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463452817,"id":288,"order":0,"posts_count":7,"status":0,"subtitle":"有整个夏天的味道","title":"腕间小清新","updated_at":1463452817},{"banner_image_url":"http://img03.liwushuo.com/image/160518/v8su6youf.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160518/v8su6youf.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img02.liwushuo.com/image/160518/7doo6pm3c.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160518/7doo6pm3c.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463452367,"id":286,"order":0,"posts_count":7,"status":0,"subtitle":"让你的时尚指数UP↑UP↑","title":"一周穿搭指南","updated_at":1463452367}]
     * paging : {"next_url":"http://api.liwushuo.com/v2/collections?limit=10&offset=10"}
     */

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

    public static class DataBean {
        /**
         * next_url : http://api.liwushuo.com/v2/collections?limit=10&offset=10
         */

        private PagingBean paging;
        /**
         * banner_image_url : http://img01.liwushuo.com/image/160612/v5f6m0rfm.jpg-w300
         * banner_webp_url : http://img01.liwushuo.com/image/160612/v5f6m0rfm.jpg?imageView2/2/w/300/q/85/format/webp
         * cover_image_url : http://img03.liwushuo.com/image/160612/a8ay4ow56.jpg-w720
         * cover_webp_url : http://img03.liwushuo.com/image/160612/a8ay4ow56.jpg?imageView2/2/w/720/q/85/format/webp
         * created_at : 1465736270
         * id : 312
         * order : 0
         * posts_count : 6
         * status : 0
         * subtitle : 颜值当然高
         * title : 装下整个明媚夏日的包包
         * updated_at : 1465782458
         */

        private List<CollectionsBean> collections;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<CollectionsBean> getCollections() {
            return collections;
        }

        public void setCollections(List<CollectionsBean> collections) {
            this.collections = collections;
        }

        public static class PagingBean {
            private String next_url;

            public String getNext_url() {
                return next_url;
            }

            public void setNext_url(String next_url) {
                this.next_url = next_url;
            }
        }

        public static class CollectionsBean {
            private String banner_image_url;
            private String banner_webp_url;
            private String cover_image_url;
            private String cover_webp_url;
            private int created_at;
            private int id;
            private int order;
            private int posts_count;
            private int status;
            private String subtitle;
            private String title;
            private int updated_at;

            public String getBanner_image_url() {
                return banner_image_url;
            }

            public void setBanner_image_url(String banner_image_url) {
                this.banner_image_url = banner_image_url;
            }

            public String getBanner_webp_url() {
                return banner_webp_url;
            }

            public void setBanner_webp_url(String banner_webp_url) {
                this.banner_webp_url = banner_webp_url;
            }

            public String getCover_image_url() {
                return cover_image_url;
            }

            public void setCover_image_url(String cover_image_url) {
                this.cover_image_url = cover_image_url;
            }

            public String getCover_webp_url() {
                return cover_webp_url;
            }

            public void setCover_webp_url(String cover_webp_url) {
                this.cover_webp_url = cover_webp_url;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getPosts_count() {
                return posts_count;
            }

            public void setPosts_count(int posts_count) {
                this.posts_count = posts_count;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(int updated_at) {
                this.updated_at = updated_at;
            }
        }
    }
}
