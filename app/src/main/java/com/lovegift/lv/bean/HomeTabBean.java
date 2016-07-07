package com.lovegift.lv.bean;

import com.lovegift.lv.BaseApp.MyParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * 首页tabLayout实体类
 * Created by Zane on 2016/6/20.
 */
@HttpResponse(parser= MyParser.class)
public class HomeTabBean {


    /**
     * code : 200
     * data : {"candidates":[{"editable":true,"id":129,"name":"海淘"},{"editable":true,"id":125,"name":"创意生活"},{"editable":true,"id":10,"name":"送女票"},{"editable":true,"id":28,"name":"科技范"},{"editable":true,"id":6,"name":"送爸妈"},{"editable":true,"id":26,"name":"送基友"},{"editable":true,"id":5,"name":"送闺蜜"},{"editable":true,"id":17,"name":"送同事"},{"editable":true,"id":24,"name":"送宝贝"},{"editable":true,"id":127,"name":"设计感"},{"editable":true,"id":14,"name":"小清新"},{"editable":true,"id":126,"name":"奇葩搞怪"},{"editable":true,"id":11,"name":"萌萌哒"}],"channels":[{"editable":false,"id":100,"name":"精选"},{"editable":true,"id":129,"name":"海淘"},{"editable":true,"id":125,"name":"创意生活"},{"editable":true,"id":10,"name":"送女票"},{"editable":true,"id":28,"name":"科技范"},{"editable":true,"id":6,"name":"送爸妈"},{"editable":true,"id":26,"name":"送基友"},{"editable":true,"id":5,"name":"送闺蜜"},{"editable":true,"id":17,"name":"送同事"},{"editable":true,"id":24,"name":"送宝贝"},{"editable":true,"id":127,"name":"设计感"},{"editable":true,"id":14,"name":"小清新"},{"editable":true,"id":126,"name":"奇葩搞怪"},{"editable":true,"id":11,"name":"萌萌哒"}]}
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

    @HttpResponse(parser= MyParser.class)
    public static class DataBean {
        /**
         * editable : true
         * id : 129
         * name : 海淘
         */

        private List<CandidatesBean> candidates;
        /**
         * editable : false
         * id : 100
         * name : 精选
         */

        private List<ChannelsBean> channels;

        public List<CandidatesBean> getCandidates() {
            return candidates;
        }

        public void setCandidates(List<CandidatesBean> candidates) {
            this.candidates = candidates;
        }

        public List<ChannelsBean> getChannels() {
            return channels;
        }

        public void setChannels(List<ChannelsBean> channels) {
            this.channels = channels;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "candidates=" + candidates +
                    ", channels=" + channels +
                    '}';
        }

        @HttpResponse(parser= MyParser.class)
        public static class CandidatesBean {
            private boolean editable;
            private int id;
            private String name;

            public boolean isEditable() {
                return editable;
            }

            public void setEditable(boolean editable) {
                this.editable = editable;
            }

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

            @Override
            public String toString() {
                return "CandidatesBean{" +
                        "editable=" + editable +
                        ", id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        @HttpResponse(parser= MyParser.class)
        public static class ChannelsBean {
            private boolean editable;
            private int id;
            private String name;

            public boolean isEditable() {
                return editable;
            }

            public void setEditable(boolean editable) {
                this.editable = editable;
            }

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

            @Override
            public String toString() {
                return "ChannelsBean{" +
                        "editable=" + editable +
                        ", id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
    }

    @Override
    public String toString() {
        return "HomeTabBean{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
