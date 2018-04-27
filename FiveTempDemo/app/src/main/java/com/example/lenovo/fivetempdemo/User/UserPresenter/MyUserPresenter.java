package com.example.lenovo.fivetempdemo.User.UserPresenter;

import com.example.lenovo.fivetempdemo.User.UserBean.UserBeans;
import com.example.lenovo.fivetempdemo.User.UserModel.MyUserModel;
import com.example.lenovo.fivetempdemo.User.UserView.MyUserView;

/**
 * Created by zh on 2018/4/27.
 */

public class MyUserPresenter {
    MyUserView myUserView;
    MyUserModel myUserModel;

    public MyUserPresenter(MyUserView myUserView) {
        this.myUserView = myUserView;
        myUserModel=new MyUserModel();
    }
    public void getResetleUser( String uid, String page, String source, String appVersion){
     myUserModel.getUser(uid,page,source,appVersion);
     myUserModel.setOnUserRestultBack(new MyUserModel.setUserOnRetust() {
         @Override
         public void setUserSuccess(UserBeans userBeans) {
             if (userBeans.getCode().equals("0")){
                 myUserView.setUserSuccess(userBeans);
             }else {
                 myUserView.setErrorsUser(userBeans.getMsg());
             }
         }

         @Override
         public void setUserError(String s) {
       myUserView.setErrorsUser(s);
         }
     });
    }
}
