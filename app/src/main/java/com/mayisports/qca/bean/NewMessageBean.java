package com.mayisports.qca.bean;

/**
 * 消息数据bean
 * Created by Zpj on 2017/12/27.
 */

public class NewMessageBean {

    /**
     * status : {"login":1,"errono":0,"errostr":"","id":"200327"}
     * data : {"msg":{"count":0,"show_type":"number"},"feedlist":{"count":1,"show_type":"number"},"new_activity":0}
     */

    public StatusBean status;
    public DataBean data;

    public static class StatusBean {
        /**
         * login : 1
         * errono : 0
         * errostr :
         * id : 200327
         */

        public int login;
        public int errono;
        public String errostr;
        public String id;
    }

    public static class DataBean {
        /**
         * msg : {"count":0,"show_type":"number"}
         * feedlist : {"count":1,"show_type":"number"}
         * new_activity : 0
         */

        public MsgBean msg;
        public FeedlistBean feedlist;
        public int new_activity;

        public static class MsgBean {
            /**
             * count : 0
             * show_type : number
             */

            public int count;
            public String show_type;
        }

        public static class FeedlistBean {
            /**
             * count : 1
             * show_type : number
             */

            public int count;
            public String show_type;
        }
    }
}
