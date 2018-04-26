package com.example.lenovo.fivetempdemo.DrawerLayout.Bean;

import java.util.List;

/**
 * Created by lenovo on 2018/4/26.
 */

public class Attention_Info {


    /**
     * msg : 获取关注用户列表成功
     * code : 0
     * data : [{"age":null,"appkey":"bec5e20e91db1fe6","appsecret":"295CBAE52DE2676775082BC55A2C61AD","createtime":"2018-04-26T13:55:49","email":null,"fans":null,"follow":null,"gender":null,"icon":"https://www.zhaoapi.cn/images/1522223095271img.png","latitude":null,"longitude":null,"mobile":"13126990738","money":null,"nickname":"王奎奎","password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"4ACD74F29724EF480ABC16698BA4476B","uid":12575,"userId":null,"username":"13126990738"},{"age":null,"appkey":"58823c52bede86fe","appsecret":"9460B698362F8607E01839A48D647179","createtime":"2018-04-26T14:33:31","email":null,"fans":null,"follow":null,"gender":null,"icon":"https://www.zhaoapi.cn/images/1523418069882aa.jpg","latitude":null,"longitude":null,"mobile":"15141002577","money":null,"nickname":"大航","password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"4A964A2C16823555D737AC1252E795C3","uid":12574,"userId":null,"username":"15141002577"}]
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
         * age : null
         * appkey : bec5e20e91db1fe6
         * appsecret : 295CBAE52DE2676775082BC55A2C61AD
         * createtime : 2018-04-26T13:55:49
         * email : null
         * fans : null
         * follow : null
         * gender : null
         * icon : https://www.zhaoapi.cn/images/1522223095271img.png
         * latitude : null
         * longitude : null
         * mobile : 13126990738
         * money : null
         * nickname : 王奎奎
         * password : 8F669074CAF5513351A2DE5CC22AC04C
         * praiseNum : null
         * token : 4ACD74F29724EF480ABC16698BA4476B
         * uid : 12575
         * userId : null
         * username : 13126990738
         */

        private Object age;
        private String appkey;
        private String appsecret;
        private String createtime;
        private Object email;
        private Object fans;
        private Object follow;
        private Object gender;
        private String icon;
        private Object latitude;
        private Object longitude;
        private String mobile;
        private Object money;
        private String nickname;
        private String password;
        private Object praiseNum;
        private String token;
        private int uid;
        private Object userId;
        private String username;

        public Object getAge() {
            return age;
        }

        public void setAge(Object age) {
            this.age = age;
        }

        public String getAppkey() {
            return appkey;
        }

        public void setAppkey(String appkey) {
            this.appkey = appkey;
        }

        public String getAppsecret() {
            return appsecret;
        }

        public void setAppsecret(String appsecret) {
            this.appsecret = appsecret;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public Object getFans() {
            return fans;
        }

        public void setFans(Object fans) {
            this.fans = fans;
        }

        public Object getFollow() {
            return follow;
        }

        public void setFollow(Object follow) {
            this.follow = follow;
        }

        public Object getGender() {
            return gender;
        }

        public void setGender(Object gender) {
            this.gender = gender;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public Object getLatitude() {
            return latitude;
        }

        public void setLatitude(Object latitude) {
            this.latitude = latitude;
        }

        public Object getLongitude() {
            return longitude;
        }

        public void setLongitude(Object longitude) {
            this.longitude = longitude;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public Object getMoney() {
            return money;
        }

        public void setMoney(Object money) {
            this.money = money;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public Object getUserId() {
            return userId;
        }

        public void setUserId(Object userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
