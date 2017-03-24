package com.don.onews.bean;

import java.util.List;

/**
 * Created by drcom on 2017/3/23.
 */

public class GankVideoData {

    /**
     * error : false
     * results : [{"_id":"58d0a5bf421aa90efc4fb700","createdAt":"2017-03-21T12:02:07.706Z","desc":"护送美国总统，简直是美国特勤人员每天重复的噩梦。","publishedAt":"2017-03-22T11:47:09.555Z","source":"chrome","type":"休息视频","url":"http://www.miaopai.com/show/I-DpJqf6~PbTKlSq04Hofw__.htm","used":true,"who":"lxxself"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 58d0a5bf421aa90efc4fb700
         * createdAt : 2017-03-21T12:02:07.706Z
         * desc : 护送美国总统，简直是美国特勤人员每天重复的噩梦。
         * publishedAt : 2017-03-22T11:47:09.555Z
         * source : chrome
         * type : 休息视频
         * url : http://www.miaopai.com/show/I-DpJqf6~PbTKlSq04Hofw__.htm
         * used : true
         * who : lxxself
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
