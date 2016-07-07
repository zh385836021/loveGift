package com.lovegift.lv.bean;

import com.lovegift.lv.BaseApp.MyParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * 首页广告实体类
 * Created by Zane on 2016/6/20.
 */
@HttpResponse(parser= MyParser.class)
public class AdBean {


    /**
     * code : 200
     * data : {"banners":[{"ad_monitors":[],"channel":"all","id":623,"image_url":"http://img01.liwushuo.com/image/160614/mlpa9m3v9.jpg-w720","order":82,"status":0,"target":{"banner_image_url":"http://img01.liwushuo.com/image/160612/y0szig030.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160612/y0szig030.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/160612/b5xfwu4ji.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160612/b5xfwu4ji.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465736247,"id":311,"posts_count":7,"status":0,"subtitle":"打造夏日小清新的秘籍在此","title":"清新一夏","updated_at":1465782340},"target_id":311,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=311","type":"collection","webp_url":"http://img01.liwushuo.com/image/160614/mlpa9m3v9.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":625,"image_url":"http://img02.liwushuo.com/image/160612/9104l2euh.jpg-w720","order":79,"status":0,"target":{"banner_image_url":"http://img02.liwushuo.com/image/160612/v5f6m0rfm.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160612/v5f6m0rfm.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/160612/a8ay4ow56.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160612/a8ay4ow56.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465736270,"id":312,"posts_count":6,"status":0,"subtitle":"颜值当然高","title":"装下整个明媚夏日的包包","updated_at":1465782458},"target_id":312,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=312","type":"collection","webp_url":"http://img02.liwushuo.com/image/160612/9104l2euh.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":611,"image_url":"http://img03.liwushuo.com/image/160531/ybd7suns9.jpg-w720","order":71,"status":0,"target":{"banner_image_url":"http://img03.liwushuo.com/image/160531/8g7irlaez.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160531/8g7irlaez.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160531/y78zk2gpv.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160531/y78zk2gpv.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464659407,"id":300,"posts_count":8,"status":1,"subtitle":"打包行李这么多年，你都get到点了吗","title":"旅行必备清单","updated_at":1464659407},"target_id":300,"target_type":"url","target_url":"liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=300","type":"collection","webp_url":"http://img03.liwushuo.com/image/160531/ybd7suns9.jpg?imageView2/2/w/720/q/85/format/webp"},{"ad_monitors":[],"channel":"all","id":627,"image_url":"http://img01.liwushuo.com/image/160614/j5p6yrtjl.jpg-w720","order":0,"status":0,"target_id":null,"target_type":"url","target_url":"liwushuo:///page?url=http%3A%2F%2Fredirect.liwushuo.com%2Fj%2Fmeila&page_action=navigation&login=false&type=url","type":"url","webp_url":"http://img01.liwushuo.com/image/160614/j5p6yrtjl.jpg?imageView2/2/w/720/q/85/format/webp"}]}
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

    public static class DataBean {
        /**
         * ad_monitors : []
         * channel : all
         * id : 623
         * image_url : http://img01.liwushuo.com/image/160614/mlpa9m3v9.jpg-w720
         * order : 82
         * status : 0
         * target : {"banner_image_url":"http://img01.liwushuo.com/image/160612/y0szig030.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160612/y0szig030.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img01.liwushuo.com/image/160612/b5xfwu4ji.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160612/b5xfwu4ji.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465736247,"id":311,"posts_count":7,"status":0,"subtitle":"打造夏日小清新的秘籍在此","title":"清新一夏","updated_at":1465782340}
         * target_id : 311
         * target_type : url
         * target_url : liwushuo:///page?page_action=navigation&login=false&type=topic&topic_id=311
         * type : collection
         * webp_url : http://img01.liwushuo.com/image/160614/mlpa9m3v9.jpg?imageView2/2/w/720/q/85/format/webp
         */

        private List<BannersBean> banners;

        public List<BannersBean> getBanners() {
            return banners;
        }

        public void setBanners(List<BannersBean> banners) {
            this.banners = banners;
        }

        public static class BannersBean {
            private String channel;
            private int id;
            private String image_url;
            private int order;
            private int status;
            /**
             * banner_image_url : http://img01.liwushuo.com/image/160612/y0szig030.jpg-w300
             * banner_webp_url : http://img01.liwushuo.com/image/160612/y0szig030.jpg?imageView2/2/w/300/q/85/format/webp
             * cover_image_url : http://img01.liwushuo.com/image/160612/b5xfwu4ji.jpg-w720
             * cover_webp_url : http://img01.liwushuo.com/image/160612/b5xfwu4ji.jpg?imageView2/2/w/720/q/85/format/webp
             * created_at : 1465736247
             * id : 311
             * posts_count : 7
             * status : 0
             * subtitle : 打造夏日小清新的秘籍在此
             * title : 清新一夏
             * updated_at : 1465782340
             */

            private TargetBean target;
            private int target_id;
            private String target_type;
            private String target_url;
            private String type;
            private String webp_url;
            private List<?> ad_monitors;

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public TargetBean getTarget() {
                return target;
            }

            public void setTarget(TargetBean target) {
                this.target = target;
            }

            public int getTarget_id() {
                return target_id;
            }

            public void setTarget_id(int target_id) {
                this.target_id = target_id;
            }

            public String getTarget_type() {
                return target_type;
            }

            public void setTarget_type(String target_type) {
                this.target_type = target_type;
            }

            public String getTarget_url() {
                return target_url;
            }

            public void setTarget_url(String target_url) {
                this.target_url = target_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getWebp_url() {
                return webp_url;
            }

            public void setWebp_url(String webp_url) {
                this.webp_url = webp_url;
            }

            public List<?> getAd_monitors() {
                return ad_monitors;
            }

            public void setAd_monitors(List<?> ad_monitors) {
                this.ad_monitors = ad_monitors;
            }

            public static class TargetBean {
                private String banner_image_url;
                private String banner_webp_url;
                private String cover_image_url;
                private String cover_webp_url;
                private int created_at;
                private int id;
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

                @Override
                public String toString() {
                    return "TargetBean{" +
                            "banner_image_url='" + banner_image_url + '\'' +
                            ", banner_webp_url='" + banner_webp_url + '\'' +
                            ", cover_image_url='" + cover_image_url + '\'' +
                            ", cover_webp_url='" + cover_webp_url + '\'' +
                            ", created_at=" + created_at +
                            ", id=" + id +
                            ", posts_count=" + posts_count +
                            ", status=" + status +
                            ", subtitle='" + subtitle + '\'' +
                            ", title='" + title + '\'' +
                            ", updated_at=" + updated_at +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "BannersBean{" +
                        "channel='" + channel + '\'' +
                        ", id=" + id +
                        ", image_url='" + image_url + '\'' +
                        ", order=" + order +
                        ", status=" + status +
                        ", target=" + target +
                        ", target_id=" + target_id +
                        ", target_type='" + target_type + '\'' +
                        ", target_url='" + target_url + '\'' +
                        ", type='" + type + '\'' +
                        ", webp_url='" + webp_url + '\'' +
                        ", ad_monitors=" + ad_monitors +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "banners=" + banners +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AdBean{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
