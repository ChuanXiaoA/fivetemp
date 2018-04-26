package com.example.lenovo.fivetempdemo.DrawerLayout.presenter;


import android.util.Log;

import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Login_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.model.Login_Model;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.Login_View;

/**
 * Created by lenovo on 2018/4/25.
 */

public class Login_Presenter {
    Login_Model loginModel;
    Login_View loginView;

    public Login_Presenter(Login_View loginView) {
        this.loginView = loginView;
        loginModel=new Login_Model();
    }
    public void getLoginPresenter(String mobile,String password){

        loginModel.getLoginModel(mobile,password);
        loginModel.getSetOnLogin(new Login_Model.setOnLogin() {
            @Override
            public void OnSuccess(Login_Info loginInfo) {

                loginView.OnSuccess(loginInfo);
            }
        });
    }
}
