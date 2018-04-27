package com.example.lenovo.fivetempdemo.User.UserView;

import com.example.lenovo.fivetempdemo.User.UserBean.UserBeans;

/**
 * Created by zh on 2018/4/27.
 */

public interface MyUserView {
    void setUserSuccess(UserBeans userBeans);
    void setErrorsUser(String msg);
}
