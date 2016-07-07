package com.lovegift.lv.bean;

import com.lovegift.lv.BaseApp.MyParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * Created by lin-pc on 2016/6/24.
 */
public class SearchEvery {

    public  DataBean data;
    /**
     * code : 200
     * data : {"hot_words":["手机壳","双肩包","凉鞋","情侣","钱包","手表","连衣裙","杯子","泳衣","手链","项链","耳机"],"placeholder":"快选一份礼物，送给亲爱的Ta吧"}
     * message : OK
     */

    private int code;
    /**
     * hot_words : ["手机壳","双肩包","凉鞋","情侣","钱包","手表","连衣裙","杯子","泳衣","手链","项链","耳机"]
     * placeholder : 快选一份礼物，送给亲爱的Ta吧
     */

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public  DataBean getData() {
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
        private String placeholder;
        private List<String> hot_words;

        public String getPlaceholder() {
            return placeholder;
        }

        public void setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
        }

        public List<String> getHot_words() {
            return hot_words;
        }

        public void setHot_words(List<String> hot_words) {
            this.hot_words = hot_words;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "placeholder='" + placeholder + '\'' +
                    ", hot_words=" + hot_words +
                    '}';
        }
    }
}
