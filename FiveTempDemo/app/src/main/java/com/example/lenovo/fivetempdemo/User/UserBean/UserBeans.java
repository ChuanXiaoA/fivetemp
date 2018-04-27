package com.example.lenovo.fivetempdemo.User.UserBean;

import java.util.List;

/**
 * Created by zh on 2018/4/27.
 */

public class UserBeans {

    /**
     * msg : 获取作品列表成功
     * code : 0
     * data : [{"commentNum":null,"cover":"https://www.zhaoapi.cn/images/quarter/15229020044972018-04-04_20-38-21.jpg","createTime":"2018-04-05T12:20:04","favoriteNum":null,"latitude":"40","localUri":null,"longitude":null,"playNum":0,"praiseNum":null,"uid":10792,"videoUrl":"https://www.zhaoapi.cn/images/quarter/1522902004497recording933773202.mp4","wid":308,"workDesc":"李欣阳 是大神"},{"commentNum":null,"cover":"https://www.zhaoapi.cn/images/quarter/15229141571452018-04-04_20-38-21.jpg","createTime":"2018-04-05T15:42:37","favoriteNum":null,"latitude":"40","localUri":null,"longitude":null,"playNum":0,"praiseNum":null,"uid":10792,"videoUrl":"https://www.zhaoapi.cn/images/quarter/1522914157145recording-1552338331.mp4","wid":309,"workDesc":"请问李强在干嘛！！！"}]
     */

    private String msg;
    private String code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * commentNum : null
         * cover : https://www.zhaoapi.cn/images/quarter/15229020044972018-04-04_20-38-21.jpg
         * createTime : 2018-04-05T12:20:04
         * favoriteNum : null
         * latitude : 40
         * localUri : null
         * longitude : null
         * playNum : 0
         * praiseNum : null
         * uid : 10792
         * videoUrl : https://www.zhaoapi.cn/images/quarter/1522902004497recording933773202.mp4
         * wid : 308
         * workDesc : 李欣阳 是大神
         */

        private Object commentNum;
        private String cover;
        private String createTime;
        private Object favoriteNum;
        private String latitude;
        private Object localUri;
        private Object longitude;
        private int playNum;
        private Object praiseNum;
        private int uid;
        private String videoUrl;
        private int wid;
        private String workDesc;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getFavoriteNum() {
            return favoriteNum;
        }

        public void setFavoriteNum(Object favoriteNum) {
            this.favoriteNum = favoriteNum;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public Object getLocalUri() {
            return localUri;
        }

        public void setLocalUri(Object localUri) {
            this.localUri = localUri;
        }

        public Object getLongitude() {
            return longitude;
        }

        public void setLongitude(Object longitude) {
            this.longitude = longitude;
        }

        public int getPlayNum() {
            return playNum;
        }

        public void setPlayNum(int playNum) {
            this.playNum = playNum;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public int getWid() {
            return wid;
        }

        public void setWid(int wid) {
            this.wid = wid;
        }

        public String getWorkDesc() {
            return workDesc;
        }

        public void setWorkDesc(String workDesc) {
            this.workDesc = workDesc;
        }
    }
}
