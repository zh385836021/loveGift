package com.lovegift.lv.bean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/6/22.
 */
public class Comments {
    public DataEntity data;

    public static class DataEntity {

        public PagingEntity paging;

        public ArrayList<CommentsEntity> comments;

        public static class PagingEntity {
            public String next_url;//下一页url
        }

        public static class CommentsEntity {
            public String content;//评论内容
            public int created_at;//评论时间
            public RepliedUserEntity replied_user;//被回复人信息类
            public int reply_to_id;//被回复人id(用于区分评论是否是回复评论)
            public UserEntity user;//评论人信息类

            public static class RepliedUserEntity {
                public String nickname;//被评人姓名
            }

            public static class UserEntity {
                public String avatar_url;//评论人头像url
                public String nickname;//评论人姓名
            }
        }
    }
}
