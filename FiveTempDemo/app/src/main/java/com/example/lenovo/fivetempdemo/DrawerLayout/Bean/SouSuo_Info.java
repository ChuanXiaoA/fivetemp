package com.example.lenovo.fivetempdemo.DrawerLayout.Bean;

import java.util.List;

/**
 * Created by lenovo on 2018/5/1.
 */

public class SouSuo_Info {


    /**
     * msg : 查询成功
     * code : 0
     * data : [{"age":null,"appkey":null,"appsecret":"B3F4F02FA7852C16B27E0FDA9A65886A","createtime":"2018-04-12T16:28:32","email":null,"fans":null,"follow":null,"gender":0,"icon":"https://www.zhaoapi.cn/images/15248971774111524897177007.png","latitude":null,"longitude":null,"mobile":"18612991023","money":0,"nickname":"王宇航","password":"016AD198F61ADB3CEFA4E5ECD78604FA","praiseNum":null,"token":"5A4143DE8859115F3B4C510056C9B4A7","uid":71,"userId":null,"username":"18612991023"},{"age":null,"appkey":"0171d3195c879d11","appsecret":"547CE3190EF9E16DC078636B68838F28","createtime":"2017-11-19T14:57:25","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"17611455662","money":null,"nickname":"王奎","password":"7F14BAAF818358E25E2D9C5259AA47DD","praiseNum":null,"token":null,"uid":2575,"userId":null,"username":"17611455662"},{"age":null,"appkey":"226c39b6aa4634f8","appsecret":"9D3F67CA4781CBBCD3F1FAE659BC71CC","createtime":"2018-05-01T10:30:02","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"18839758333","money":null,"nickname":"王奎","password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"63EEA35975840ED338A46C0DC9F3D5D1","uid":3252,"userId":null,"username":"18839758333"},{"age":null,"appkey":"259ea27fa49e2303","appsecret":"1A102C664CCA4F35FFFCCB42283EF23B","createtime":"2017-12-14T23:58:38","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"13877887788","money":null,"nickname":"王世飞","password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"EF410CB59940AA4626364694E89D4E04","uid":4746,"userId":null,"username":"13877887788"},{"age":null,"appkey":"bec5e20e91db1fe6","appsecret":"295CBAE52DE2676775082BC55A2C61AD","createtime":"2018-05-01T10:02:26","email":null,"fans":null,"follow":null,"gender":null,"icon":"https://www.zhaoapi.cn/images/1522223095271img.png","latitude":null,"longitude":null,"mobile":"13126990738","money":null,"nickname":"王奎奎","password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"4ACD74F29724EF480ABC16698BA4476B","uid":12575,"userId":null,"username":"13126990738"},{"age":null,"appkey":"0f82792e08c9ffb0","appsecret":"F1ADBFFD4C08D87C9A53E3540DFAE103","createtime":"2018-04-18T19:35:27","email":null,"fans":null,"follow":null,"gender":null,"icon":"https://www.zhaoapi.cn/images/1524031366864a.jpg","latitude":null,"longitude":null,"mobile":"13562625255","money":null,"nickname":"王昊吃屁","password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"19D79AC431691842D622B30EB79FAD03","uid":13521,"userId":null,"username":"13562625255"}]
     * page : -1
     */

    private String msg;
    private String code;
    private int page;
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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
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
         * appkey : null
         * appsecret : B3F4F02FA7852C16B27E0FDA9A65886A
         * createtime : 2018-04-12T16:28:32
         * email : null
         * fans : null
         * follow : null
         * gender : 0
         * icon : https://www.zhaoapi.cn/images/15248971774111524897177007.png
         * latitude : null
         * longitude : null
         * mobile : 18612991023
         * money : 0
         * nickname : 王宇航
         * password : 016AD198F61ADB3CEFA4E5ECD78604FA
         * praiseNum : null
         * token : 5A4143DE8859115F3B4C510056C9B4A7
         * uid : 71
         * userId : null
         * username : 18612991023
         */

        private Object age;
        private Object appkey;
        private String appsecret;
        private String createtime;
        private Object email;
        private Object fans;
        private Object follow;
        private int gender;
        private String icon;
        private Object latitude;
        private Object longitude;
        private String mobile;
        private int money;
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

        public Object getAppkey() {
            return appkey;
        }

        public void setAppkey(Object appkey) {
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

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
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

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
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
