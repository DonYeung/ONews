package com.don.onews.bean;

import java.util.List;

/**
 * Created by drcom on 2017/3/24.
 */

public class Video {

    /**
     * success : true
     * error_code : 0
     * message : 数据加载完毕
     * data : [{"id":"3903","cateid":"146","name":"测量滑动摩擦力","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d371b63e539.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d371b63e539.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3728fbeef7.mp4","view_count":"19","remark":"测量滑动摩擦力","time":"2017-03-23 15:12:03"},{"id":"3902","cateid":"146","name":"固体融化时温度的变化规律","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3701f0f78e.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d3701f0f78e.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d370dc87f6b.mp4","view_count":"7","remark":"固体融化时温度的变化规律","time":"2017-03-23 14:56:21"},{"id":"3901","cateid":"146","name":"研究通电螺线管内部的磁场分布","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d361aaf0d6b.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d361aaf0d6b.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3626ff0245.mp4","view_count":"17","remark":"研究通电螺线管内部的磁场分布","time":"2017-03-23 13:52:38"},{"id":"3900","cateid":"146","name":"测量物体运动的平均速度（光电门传感器）","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d362cecee1c.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d362cecee1c.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d363e7e2baa.mp4","view_count":"9","remark":"测量物体运动的平均速度（光电门传感器）","time":"2017-03-23 13:47:26"},{"id":"3899","cateid":"146","name":"测量物体运动的平均速度（一体式位移传感器）","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3476a61eaf.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d3476a61eaf.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3484d9de0e.mp4","view_count":"13","remark":"测量物体运动的平均速度（一体式位移传感器）","time":"2017-03-23 12:00:59"},{"id":"3898","cateid":"146","name":"安培力测量","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d345fe854f0.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d345fe854f0.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d346e4e2605.mp4","view_count":"14","remark":"安培力测量","time":"2017-03-23 11:54:41"},{"id":"3897","cateid":"146","name":"变力作用下的动量定理","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3453782fa2.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d3453782fa2.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3459004d7e.mp4","view_count":"7","remark":"变力作用下的动量定理","time":"2017-03-23 11:49:53"},{"id":"3896","cateid":"146","name":"法拉第电磁感应定律研究（二）","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d344d699978.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d344d699978.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3450db9739.mp4","view_count":"7","remark":"法拉第电磁感应定律研究（二）","time":"2017-03-23 11:46:36"},{"id":"3895","cateid":"146","name":"法拉第电磁感应定律研究（一）","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d343d62fd16.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d343d62fd16.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3449747889.mp4","view_count":"8","remark":"法拉第电磁感应定律研究（一）","time":"2017-03-23 11:45:05"},{"id":"3894","cateid":"146","name":"测定电池的电动势和内阻","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d343552cd53.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d343552cd53.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d343abcd83b.mp4","view_count":"6","remark":"测定电池的电动势和内阻","time":"2017-03-23 11:40:43"},{"id":"3893","cateid":"146","name":"描绘小灯泡的伏安特性曲线","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d34205ac216.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d34205ac216.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3423e58f3a.mp4","view_count":"6","remark":"描绘小灯泡的伏安特性曲线","time":"2017-03-23 11:36:47"},{"id":"3892","cateid":"146","name":"力的合成与分解","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3417350905.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d3417350905.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d341d2f18ad.mp4","view_count":"6","remark":"力的合成与分解","time":"2017-03-23 11:33:05"},{"id":"3891","cateid":"146","name":"修坯","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3129280eba.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d3129280eba.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d316ede6dd1.mp4","view_count":"14","remark":"修坯","time":"2017-03-23 08:29:45"},{"id":"3890","cateid":"146","name":"揉泥","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d22dae1ed83.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/thumb_58d22dae1ed83.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d23028ca67d.mp4","view_count":"22","remark":"揉泥","time":"2017-03-22 16:05:28"},{"id":"3889","cateid":"146","name":"花瓶 ","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d227254e139.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/thumb_58d227254e139.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d22d6c7957f.mp4","view_count":"32","remark":"花瓶 ","time":"2017-03-22 15:53:37"},{"id":"3888","cateid":"146","name":"长颈鹿","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d1f2ee16bc2.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/thumb_58d1f2ee16bc2.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d1f43121cfa.mp4","view_count":"58","remark":"长颈鹿","time":"2017-03-22 11:51:13"},{"id":"3887","cateid":"146","name":"遥控器安装","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d1da476cb36.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/thumb_58d1da476cb36.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d1dac3887d0.mp4","view_count":"22","remark":"遥控器安装","time":"2017-03-22 10:00:46"},{"id":"3886","cateid":"146","name":"系统结构和详解","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d1d960679f0.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/thumb_58d1d960679f0.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d1da2be9e26.mp4","view_count":"33","remark":"系统结构和详解","time":"2017-03-22 09:58:10"},{"id":"3885","cateid":"146","name":"无人机组成部分","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d1d8eb95463.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/thumb_58d1d8eb95463.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d33e63ad325.mp4","view_count":"24","remark":"无人机组成部分","time":"2017-03-22 09:54:19"},{"id":"3884","cateid":"146","name":"无人机遥控器的讲解","img_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/58d1d7dec14cb.jpg","img_url_s":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170322/thumb_58d1d7dec14cb.jpg","video_url":"http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d33f167695f.mp4","view_count":"18","remark":"无人机遥控器的讲解","time":"2017-03-22 09:51:28"}]
     */

    private boolean success;
    private int error_code;
    private String message;
    private List<DataBean> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 3903
         * cateid : 146
         * name : 测量滑动摩擦力
         * img_url : http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d371b63e539.jpg
         * img_url_s : http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/thumb_58d371b63e539.jpg
         * video_url : http://www.shiyan360.cn/Public/Uploads/Chuangke/20170323/58d3728fbeef7.mp4
         * view_count : 19
         * remark : 测量滑动摩擦力
         * time : 2017-03-23 15:12:03
         */

        private String id;
        private String cateid;
        private String name;
        private String img_url;
        private String img_url_s;
        private String video_url;
        private String view_count;
        private String remark;
        private String time;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCateid() {
            return cateid;
        }

        public void setCateid(String cateid) {
            this.cateid = cateid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public String getImg_url_s() {
            return img_url_s;
        }

        public void setImg_url_s(String img_url_s) {
            this.img_url_s = img_url_s;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {
            this.video_url = video_url;
        }

        public String getView_count() {
            return view_count;
        }

        public void setView_count(String view_count) {
            this.view_count = view_count;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
