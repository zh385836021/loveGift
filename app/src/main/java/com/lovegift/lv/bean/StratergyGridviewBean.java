package com.lovegift.lv.bean;

import com.lovegift.lv.BaseApp.MyParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * Created by Xu on 2016/6/22 0022.
 */

/*
  存储分类页面中攻略专题下方的三个gridview中的数据
 */
@HttpResponse(parser = MyParser.class)
public class StratergyGridviewBean {


    /**
     * code : 200
     * data : {"channel_groups":[{"channels":[{"cover_image_url":"http://img03.liwushuo.com/image/160613/mm5r87frx.png","group_id":5,"icon_url":"http://img03.liwushuo.com/image/160414/kwzqtscoa.png-pw144","id":111,"items_count":1139,"name":"礼物","order":10,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/a7egskabh.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/58kdnthsn.png-pw144","id":112,"items_count":584,"name":"家居","order":9,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160613/5rtlibfft.png","group_id":5,"icon_url":"http://img02.liwushuo.com/image/160414/6eutomjeo.png-pw144","id":110,"items_count":660,"name":"穿搭","order":8,"status":0},{"cover_image_url":"http://img01.liwushuo.com/image/160612/bpdweml2o.png","group_id":5,"icon_url":"http://img03.liwushuo.com/image/160414/abuv6vssc.png-pw144","id":2,"items_count":561,"name":"美物","order":7,"status":0},{"cover_image_url":"http://img01.liwushuo.com/image/160613/5334cfv4r.png","group_id":5,"icon_url":"http://img02.liwushuo.com/image/160401/5al9xhwg1.png-pw144","id":116,"items_count":196,"name":"饰品","order":6,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160606/5ikc9i5hf.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/58vv7n29y.png-pw144","id":118,"items_count":488,"name":"美食","order":5,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160612/ni68k6jbf.png","group_id":5,"icon_url":"http://img02.liwushuo.com/image/160401/5dgflkj6g.png-pw144","id":117,"items_count":195,"name":"鞋包","order":5,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160612/zi1d7qii7.png","group_id":5,"icon_url":"http://img02.liwushuo.com/image/160401/fb7e1012t.png-pw144","id":113,"items_count":510,"name":"美护","order":4,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160613/rcpdke09i.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/59hgqd1x8.png-pw144","id":121,"items_count":209,"name":"数码","order":4,"status":0},{"cover_image_url":"http://img01.liwushuo.com/image/160606/yejz60vcy.png","group_id":5,"icon_url":"http://img03.liwushuo.com/image/160401/u4r2a9q72.png-pw144","id":3,"items_count":89,"name":"手工","order":3,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/4wcciftfh.png","group_id":5,"icon_url":"http://img03.liwushuo.com/image/160401/i69bjp6bm.png-pw144","id":119,"items_count":51,"name":"母婴","order":0,"status":0},{"cover_image_url":null,"group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/myl8eb2sk.png-pw144","id":120,"items_count":182,"name":"涨姿势","order":0,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160606/fsjzjhnvu.png","group_id":5,"icon_url":"http://img03.liwushuo.com/image/160401/t9t9hzntc.png-pw144","id":122,"items_count":65,"name":"爱动漫","order":0,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160612/26g3a35ma.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/3ziqypz1f.png-pw144","id":123,"items_count":31,"name":"爱运动","order":0,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160606/ad06sqrix.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/6pdxbaqz2.png-pw144","id":124,"items_count":22,"name":"爱读书","order":0,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/ag9tk2cl5.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/voku467wc.png-pw144","id":129,"items_count":150,"name":"海淘","order":0,"status":0}],"id":5,"name":"品类","order":6,"status":0},{"channels":[{"cover_image_url":"http://img03.liwushuo.com/image/160606/yt3vxeg1m.png","group_id":1,"icon_url":"http://img02.liwushuo.com/image/160401/y6s6hso8w.png-pw144","id":125,"items_count":99,"name":"创意生活","order":5,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160612/m09xh7xtb.png","group_id":1,"icon_url":"http://img03.liwushuo.com/image/160401/vx9i89n0s.png-pw144","id":11,"items_count":185,"name":"萌萌哒","order":4,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160613/n8sl1qhm7.png","group_id":1,"icon_url":"http://img01.liwushuo.com/image/160401/i3aupd3j5.png-pw144","id":14,"items_count":304,"name":"小清新","order":3,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/qmv48m8v5.png","group_id":1,"icon_url":"http://img03.liwushuo.com/image/160401/9hmc5ux1f.png-pw144","id":28,"items_count":104,"name":"科技范","order":3,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/116ekr7kk.png","group_id":1,"icon_url":"http://img02.liwushuo.com/image/160401/h54c765kw.png-pw144","id":126,"items_count":37,"name":"奇葩搞怪","order":0,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/0dn7gl8jm.png","group_id":1,"icon_url":"http://img01.liwushuo.com/image/160401/laseg7k6q.png-pw144","id":127,"items_count":98,"name":"设计感","order":0,"status":0}],"id":1,"name":"风格","order":5,"status":0},{"channels":[{"cover_image_url":"http://img02.liwushuo.com/image/160606/f72n6nn6t.png","group_id":2,"icon_url":"http://img02.liwushuo.com/image/160414/j868ssqkl.png-pw144","id":10,"items_count":436,"name":"送女票","order":8,"status":0},{"cover_image_url":"http://img01.liwushuo.com/image/160606/d72wf1hmo.png","group_id":2,"icon_url":"http://img01.liwushuo.com/image/160401/56j52lxyq.png-pw144","id":9,"items_count":285,"name":"送男票","order":7,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160606/s4vvvdu4z.png","group_id":2,"icon_url":"http://img01.liwushuo.com/image/160401/9fml1mzye.png-pw144","id":24,"items_count":88,"name":"送宝贝","order":6,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160606/lj5h4k0s0.png","group_id":2,"icon_url":"http://img03.liwushuo.com/image/160401/tsskwt8rq.png-pw144","id":6,"items_count":211,"name":"送爸妈","order":5,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160613/92u4q0nih.png","group_id":2,"icon_url":"http://img01.liwushuo.com/image/160401/vq7h2y5ru.png-pw144","id":26,"items_count":583,"name":"送基友","order":5,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160606/ajyqfsl4k.png","group_id":2,"icon_url":"http://img01.liwushuo.com/image/160401/vmdxu2nrw.png-pw144","id":5,"items_count":1053,"name":"送闺蜜","order":4,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160613/5b9m502x6.png","group_id":2,"icon_url":"http://img03.liwushuo.com/image/160414/esbe2og0n.png-pw144","id":17,"items_count":96,"name":"送同事","order":2,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160606/fb890pl6q.png","group_id":2,"icon_url":"http://img02.liwushuo.com/image/160414/49ludf8iy.png-pw144","id":132,"items_count":29,"name":"新婚夫妇","order":1,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/4awq1dyqj.png","group_id":2,"icon_url":"http://img01.liwushuo.com/image/160414/gglbvbdjd.png-pw144","id":133,"items_count":37,"name":"新手妈妈","order":0,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/8xpgw5zoa.png","group_id":2,"icon_url":"http://img02.liwushuo.com/image/160426/7gmz13c47.png-pw144","id":134,"items_count":117,"name":"送自己","order":0,"status":0}],"id":2,"name":"对象","order":4,"status":0}]}
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
         * channels : [{"cover_image_url":"http://img03.liwushuo.com/image/160613/mm5r87frx.png","group_id":5,"icon_url":"http://img03.liwushuo.com/image/160414/kwzqtscoa.png-pw144","id":111,"items_count":1139,"name":"礼物","order":10,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/a7egskabh.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/58kdnthsn.png-pw144","id":112,"items_count":584,"name":"家居","order":9,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160613/5rtlibfft.png","group_id":5,"icon_url":"http://img02.liwushuo.com/image/160414/6eutomjeo.png-pw144","id":110,"items_count":660,"name":"穿搭","order":8,"status":0},{"cover_image_url":"http://img01.liwushuo.com/image/160612/bpdweml2o.png","group_id":5,"icon_url":"http://img03.liwushuo.com/image/160414/abuv6vssc.png-pw144","id":2,"items_count":561,"name":"美物","order":7,"status":0},{"cover_image_url":"http://img01.liwushuo.com/image/160613/5334cfv4r.png","group_id":5,"icon_url":"http://img02.liwushuo.com/image/160401/5al9xhwg1.png-pw144","id":116,"items_count":196,"name":"饰品","order":6,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160606/5ikc9i5hf.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/58vv7n29y.png-pw144","id":118,"items_count":488,"name":"美食","order":5,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160612/ni68k6jbf.png","group_id":5,"icon_url":"http://img02.liwushuo.com/image/160401/5dgflkj6g.png-pw144","id":117,"items_count":195,"name":"鞋包","order":5,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160612/zi1d7qii7.png","group_id":5,"icon_url":"http://img02.liwushuo.com/image/160401/fb7e1012t.png-pw144","id":113,"items_count":510,"name":"美护","order":4,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160613/rcpdke09i.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/59hgqd1x8.png-pw144","id":121,"items_count":209,"name":"数码","order":4,"status":0},{"cover_image_url":"http://img01.liwushuo.com/image/160606/yejz60vcy.png","group_id":5,"icon_url":"http://img03.liwushuo.com/image/160401/u4r2a9q72.png-pw144","id":3,"items_count":89,"name":"手工","order":3,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/4wcciftfh.png","group_id":5,"icon_url":"http://img03.liwushuo.com/image/160401/i69bjp6bm.png-pw144","id":119,"items_count":51,"name":"母婴","order":0,"status":0},{"cover_image_url":null,"group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/myl8eb2sk.png-pw144","id":120,"items_count":182,"name":"涨姿势","order":0,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160606/fsjzjhnvu.png","group_id":5,"icon_url":"http://img03.liwushuo.com/image/160401/t9t9hzntc.png-pw144","id":122,"items_count":65,"name":"爱动漫","order":0,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160612/26g3a35ma.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/3ziqypz1f.png-pw144","id":123,"items_count":31,"name":"爱运动","order":0,"status":0},{"cover_image_url":"http://img02.liwushuo.com/image/160606/ad06sqrix.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/6pdxbaqz2.png-pw144","id":124,"items_count":22,"name":"爱读书","order":0,"status":0},{"cover_image_url":"http://img03.liwushuo.com/image/160606/ag9tk2cl5.png","group_id":5,"icon_url":"http://img01.liwushuo.com/image/160401/voku467wc.png-pw144","id":129,"items_count":150,"name":"海淘","order":0,"status":0}]
         * id : 5
         * name : 品类
         * order : 6
         * status : 0
         */

        private List<ChannelGroupsBean> channel_groups;

        public List<ChannelGroupsBean> getChannel_groups() {
            return channel_groups;
        }

        public void setChannel_groups(List<ChannelGroupsBean> channel_groups) {
            this.channel_groups = channel_groups;
        }

        public static class ChannelGroupsBean {
            private int id;
            private String name;
            private int order;
            private int status;
            /**
             * cover_image_url : http://img03.liwushuo.com/image/160613/mm5r87frx.png
             * group_id : 5
             * icon_url : http://img03.liwushuo.com/image/160414/kwzqtscoa.png-pw144
             * id : 111
             * items_count : 1139
             * name : 礼物
             * order : 10
             * status : 0
             */

            private List<ChannelsBean> channels;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
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

            public List<ChannelsBean> getChannels() {
                return channels;
            }

            public void setChannels(List<ChannelsBean> channels) {
                this.channels = channels;
            }

            public static class ChannelsBean {
                private String cover_image_url;
                private int group_id;
                private String icon_url;
                private int id;
                private int items_count;
                private String name;
                private int order;
                private int status;

                public String getCover_image_url() {
                    return cover_image_url;
                }

                public void setCover_image_url(String cover_image_url) {
                    this.cover_image_url = cover_image_url;
                }

                public int getGroup_id() {
                    return group_id;
                }

                public void setGroup_id(int group_id) {
                    this.group_id = group_id;
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

                public int getItems_count() {
                    return items_count;
                }

                public void setItems_count(int items_count) {
                    this.items_count = items_count;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
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
            }
        }
    }

    @Override
    public String toString() {
        return "StratergyGridviewBean{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
