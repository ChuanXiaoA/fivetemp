package com.example.lenovo.fivetempdemo.DrawerLayout.presenter;


import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.LoginInfo;
import com.example.lenovo.fivetempdemo.DrawerLayout.model.LoginModel;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.LoginView;

/**
 * Created by lenovo on 2018/4/25.
 */

public class LoginPresenter {
    LoginModel loginModel;
    LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        loginModel=new LoginModel();
    }
    public void getLoginPresenter(String mobile,String password){
        loginModel.getLoginModel(mobile,password);
        loginModel.getSetOnLogin(new LoginModel.setOnLogin() {
            @Override
            public void OnSuccess(LoginInfo loginInfo) {
                loginView.OnSuccess(loginInfo);
            }


        });

    }
}
