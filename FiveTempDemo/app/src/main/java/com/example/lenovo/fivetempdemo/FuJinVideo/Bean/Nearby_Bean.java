package com.example.lenovo.fivetempdemo.FuJinVideo.Bean;

import java.util.List;

/**
 * Created by zh on 2018/4/27.
 */

public class Nearby_Bean {

    /**
     * msg : 获取附近作品列表成功
     * code : 0
     * data : [{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1517629997784aaaa.jpg","createTime":"2018-02-03T11:53:17","favoriteNum":1,"latitude":"1","localUri":null,"longitude":"1","playNum":3,"praiseNum":1,"uid":106,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1517630148095head.jpg","nickname":"刘浩","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1517629997784mm.mp4","wid":275,"workDesc":"第一次上传视频"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1517630026971aaaa.jpg","createTime":"2018-02-03T11:53:46","favoriteNum":1,"latitude":"1","localUri":null,"longitude":"1","playNum":0,"praiseNum":1,"uid":106,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1517630148095head.jpg","nickname":"刘浩","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1517630026971mm.mp4","wid":276,"workDesc":"第一次上传视频"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1517630188173aaaa.jpg","createTime":"2018-02-03T11:56:28","favoriteNum":0,"latitude":"1","localUri":null,"longitude":"1","playNum":2,"praiseNum":1,"uid":106,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1517630148095head.jpg","nickname":"刘浩","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1517630188173mm.mp4","wid":277,"workDesc":"第一次上传视频"}]
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
         * commentNum : 0
         * comments : []
         * cover : https://www.zhaoapi.cn/images/quarter/1517629997784aaaa.jpg
         * createTime : 2018-02-03T11:53:17
         * favoriteNum : 1
         * latitude : 1
         * localUri : null
         * longitude : 1
         * playNum : 3
         * praiseNum : 1
         * uid : 106
         * user : {"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1517630148095head.jpg","nickname":"刘浩","praiseNum":"null"}
         * videoUrl : https://www.zhaoapi.cn/images/quarter/1517629997784mm.mp4
         * wid : 275
         * workDesc : 第一次上传视频
         */

        private int commentNum;
        private String cover;
        private String createTime;
        private int favoriteNum;
        private String latitude;
        private Object localUri;
        private String longitude;
        private int playNum;
        private int praiseNum;
        private int uid;
        private UserBean user;
        private String videoUrl;
        private int wid;
        private String workDesc;
        private List<?> comments;

        public int getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(int commentNum) {
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

        public int getFavoriteNum() {
            return favoriteNum;
        }

        public void setFavoriteNum(int favoriteNum) {
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

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public int getPlayNum() {
            return playNum;
        }

        public void setPlayNum(int playNum) {
            this.playNum = playNum;
        }

        public int getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(int praiseNum) {
            this.praiseNum = praiseNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
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

        public List<?> getComments() {
            return comments;
        }

        public void setComments(List<?> comments) {
            this.comments = comments;
        }

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : https://www.zhaoapi.cn/images/1517630148095head.jpg
             * nickname : 刘浩
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private String icon;
            private String nickname;
            private String praiseNum;

            public Object getAge() {
                return age;
            }

            public void setAge(Object age) {
                this.age = age;
            }

            public String getFans() {
                return fans;
            }

            public void setFans(String fans) {
                this.fans = fans;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(String praiseNum) {
                this.praiseNum = praiseNum;
            }
        }
    }
}