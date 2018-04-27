package com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Bean;

import java.util.List;

/**
 * Created by lenovo on 2018/4/27.
 */

public class C_Bean_duanzi {


    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"把","createTime":"2018-04-27T14:31:17","imgUrls":null,"jid":2366,"praiseNum":null,"shareNum":null,"uid":4885,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524706757003crop_photo.jpg","nickname":"改名字","praiseNum":"null"}},{"commentNum":null,"content":"哈哈哈哈哈哈哈哈哈哈哈哈","createTime":"2018-04-27T13:54:56","imgUrls":null,"jid":2365,"praiseNum":null,"shareNum":null,"uid":13983,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"发帖违法噶事","createTime":"2018-04-27T13:53:41","imgUrls":null,"jid":2364,"praiseNum":null,"shareNum":null,"uid":13983,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"平头哥，烫头王","createTime":"2018-04-27T13:29:15","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524806955739IMG_20180427_132607.jpg|https://www.zhaoapi.cn/images/quarter/1524806955739IMG_20180427_132556.jpg","jid":2363,"praiseNum":null,"shareNum":null,"uid":12575,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1522223095271img.png","nickname":"王奎奎","praiseNum":"null"}},{"commentNum":null,"content":"平头哥，烫头王","createTime":"2018-04-27T13:29:12","imgUrls":"https://www.zhaoapi.cn/images/quarter/1524806952521IMG_20180427_132607.jpg|https://www.zhaoapi.cn/images/quarter/1524806952521IMG_20180427_132556.jpg","jid":2362,"praiseNum":null,"shareNum":null,"uid":12575,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1522223095271img.png","nickname":"王奎奎","praiseNum":"null"}},{"commentNum":null,"content":"明","createTime":"2018-04-27T11:37:05","imgUrls":null,"jid":2361,"praiseNum":null,"shareNum":null,"uid":11439,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15248001718611524800170407.png","nickname":"！","praiseNum":"null"}},{"commentNum":null,"content":"明","createTime":"2018-04-27T11:36:35","imgUrls":null,"jid":2360,"praiseNum":null,"shareNum":null,"uid":11439,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15248001718611524800170407.png","nickname":"！","praiseNum":"null"}},{"commentNum":null,"content":"枪","createTime":"2018-04-27T11:34:38","imgUrls":null,"jid":2359,"praiseNum":null,"shareNum":null,"uid":4885,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524706757003crop_photo.jpg","nickname":"改名字","praiseNum":"null"}},{"commentNum":null,"content":"枪","createTime":"2018-04-27T11:02:45","imgUrls":null,"jid":2358,"praiseNum":null,"shareNum":null,"uid":4885,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524706757003crop_photo.jpg","nickname":"改名字","praiseNum":"null"}},{"commentNum":null,"content":"坑爹啊","createTime":"2018-04-27T11:02:25","imgUrls":null,"jid":2357,"praiseNum":null,"shareNum":null,"uid":4885,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524706757003crop_photo.jpg","nickname":"改名字","praiseNum":"null"}}]
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
         * content : 把
         * createTime : 2018-04-27T14:31:17
         * imgUrls : null
         * jid : 2366
         * praiseNum : null
         * shareNum : null
         * uid : 4885
         * user : {"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524706757003crop_photo.jpg","nickname":"改名字","praiseNum":"null"}
         */

        private Object commentNum;
        private String content;
        private String createTime;
        private Object imgUrls;
        private int jid;
        private Object praiseNum;
        private Object shareNum;
        private int uid;
        private UserBean user;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getImgUrls() {
            return imgUrls;
        }

        public void setImgUrls(Object imgUrls) {
            this.imgUrls = imgUrls;
        }

        public int getJid() {
            return jid;
        }

        public void setJid(int jid) {
            this.jid = jid;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public Object getShareNum() {
            return shareNum;
        }

        public void setShareNum(Object shareNum) {
            this.shareNum = shareNum;
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

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : https://www.zhaoapi.cn/images/1524706757003crop_photo.jpg
             * nickname : 改名字
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
