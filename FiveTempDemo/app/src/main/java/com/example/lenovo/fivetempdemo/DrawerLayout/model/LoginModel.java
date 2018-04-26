package com.example.lenovo.fivetempdemo.DrawerLayout.model;


import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.LoginInfo;
import com.example.lenovo.fivetempdemo.DrawerLayout.app.AppService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by lenovo on 2018/4/25.
 */

public class LoginModel {

    public interface setOnLogin{
        void OnSuccess(LoginInfo loginInfo);

    }
    setOnLogin setOnLogin;
    public void getSetOnLogin(setOnLogin setOnLogin){

        this.setOnLogin=setOnLogin;
    }

    public void getLoginModel(String mobile,String password){
        RetrofitUtils inData = RetrofitUtils.getInData();
        AppService retrofit = inData.getRetrofit(Api.URL_, AppService.class);
        Flowable<LoginInfo> loginInfo = retrofit.getLoginInfo(mobile, password);
        loginInfo.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<LoginInfo>() {
                    @Override
                    public void onNext(LoginInfo loginInfo) {
                        if (setOnLogin != null) {
                            setOnLogin.OnSuccess(loginInfo);
                        }

                    }
                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
