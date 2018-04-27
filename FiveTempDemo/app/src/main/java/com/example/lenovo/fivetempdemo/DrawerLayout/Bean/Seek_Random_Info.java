package com.example.lenovo.fivetempdemo.DrawerLayout.Bean;

import java.util.List;

/**
 * Created by lenovo on 2018/4/27.
 */

public class Seek_Random_Info {


    /**
     * msg : 请求成功
     * code : 1
     * data : [{"age":null,"appkey":"8728489ab3949b77","appsecret":"D09E7BAE957882B8F6BD7D29828F16FE","createtime":"2018-04-23T13:29:20","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"18699077777","money":null,"nickname":null,"password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":null,"uid":14033,"userId":null,"username":"18699077777"},{"age":null,"appkey":"02edf0b81837b1d3","appsecret":"42E0F63862C612842D36EC6AB1B1AF78","createtime":"2018-04-23T13:50:22","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"18699077079","money":null,"nickname":null,"password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"C48BB05CAE53935D1925232312FEEC78","uid":14034,"userId":null,"username":"18699077079"},{"age":null,"appkey":"88fcd29fead92651","appsecret":"DDCA15F1CCDAC9C8073580F0E0014B97","createtime":"2018-04-23T13:59:52","email":null,"fans":null,"follow":null,"gender":null,"icon":"https://www.zhaoapi.cn/images/1524463293293305675-uvUtwj.jpg","latitude":null,"longitude":null,"mobile":"13671153241","money":null,"nickname":null,"password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"BFC8BC06BA1F1B266D29800805B2D871","uid":14035,"userId":null,"username":"13671153241"},{"age":null,"appkey":"3860de7db35a9954","appsecret":"D2959A44B77F48E683875F3E02FEAAFF","createtime":"2018-04-23T13:59:02","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"15201171055","money":null,"nickname":null,"password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"F315B8855EA175D18564A18CCA5C60AB","uid":14036,"userId":null,"username":"15201171055"},{"age":null,"appkey":"a19829c2ba10cc1e","appsecret":"51C4401017134350ABE31908484C7912","createtime":"2018-04-23T14:00:50","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"18506137258","money":null,"nickname":null,"password":"7792A1F7048ECB10FE716CE6FD38E884","praiseNum":null,"token":"A2283C2F3D0074A50D2CCA919446D9BC","uid":14037,"userId":null,"username":"18506137258"},{"age":null,"appkey":"432365f7affe596a","appsecret":"0C8060556A4B80BA928F0D548ED9DC2A","createtime":"2018-04-23T14:04:02","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"13521812899","money":null,"nickname":null,"password":"6CDD924650CE3AC5D36323D5FBEACB22","praiseNum":null,"token":null,"uid":14038,"userId":null,"username":"13521812899"},{"age":null,"appkey":"e37cf9128e1d9589","appsecret":"B7ED1866D5AD2FDFA865C650DEE12A60","createtime":"2018-04-23T14:11:28","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"13773929671","money":null,"nickname":null,"password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":null,"uid":14039,"userId":null,"username":"13773929671"},{"age":null,"appkey":"a88618f09747e117","appsecret":"788940A25144ACA6D777E501737B475B","createtime":"2018-04-23T14:12:31","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"13592077644","money":null,"nickname":null,"password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":null,"uid":14040,"userId":null,"username":"13592077644"},{"age":null,"appkey":"ae0a618f4ff46d34","appsecret":"4457CA5974957D69DAB07064A7419776","createtime":"2018-04-23T14:26:19","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"13461624926","money":null,"nickname":null,"password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"943F1F29A079649E4CD411EB8DC6826B","uid":14041,"userId":null,"username":"13461624926"},{"age":null,"appkey":"f6111a5e410641c6","appsecret":"E7C0C146D6873D38148C9F7CF4FFCBA3","createtime":"2018-04-23T14:26:38","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"13546712541","money":null,"nickname":null,"password":"7F14BAAF818358E25E2D9C5259AA47DD","praiseNum":null,"token":null,"uid":14042,"userId":null,"username":"13546712541"}]
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
         * appkey : 8728489ab3949b77
         * appsecret : D09E7BAE957882B8F6BD7D29828F16FE
         * createtime : 2018-04-23T13:29:20
         * email : null
         * fans : null
         * follow : null
         * gender : null
         * icon : null
         * latitude : null
         * longitude : null
         * mobile : 18699077777
         * money : null
         * nickname : null
         * password : 8F669074CAF5513351A2DE5CC22AC04C
         * praiseNum : null
         * token : null
         * uid : 14033
         * userId : null
         * username : 18699077777
         */

        private Object age;
        private String appkey;
        private String appsecret;
        private String createtime;
        private Object email;
        private Object fans;
        private Object follow;
        private Object gender;
        private Object icon;
        private Object latitude;
        private Object longitude;
        private String mobile;
        private Object money;
        private Object nickname;
        private String password;
        private Object praiseNum;
        private Object token;
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

        public Object getIcon() {
            return icon;
        }

        public void setIcon(Object icon) {
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

        public Object getNickname() {
            return nickname;
        }

        public void setNickname(Object nickname) {
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

        public Object getToken() {
            return token;
        }

        public void setToken(Object token) {
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
