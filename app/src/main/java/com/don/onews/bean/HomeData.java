package com.don.onews.bean;

import java.util.List;

/**
 * Created by drcom on 2017/3/17.
 */

public class HomeData {

    public static class ResultBean {

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : b4b38b2f87bbc42c48cba1a95ff6c90f
             * title : 为这事，北京市委召开全会闭门学习 郭金龙严令：不容七嘴八舌
             * date : 2017-03-17 14:16
             * category : 头条
             * author_name : 北京日报
             * url : http://mini.eastday.com/mobile/170317141606697.html
             * thumbnail_pic_s : http://00.imgmini.eastday.com/mobile/20170317/20170317141606_1a72e6f0b7a84dd863430f1b8e9b5906_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://00.imgmini.eastday.com/mobile/20170317/20170317141606_1a72e6f0b7a84dd863430f1b8e9b5906_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://00.imgmini.eastday.com/mobile/20170317/20170317141606_876811bd6f1912e692615058e8f46f80_3_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
