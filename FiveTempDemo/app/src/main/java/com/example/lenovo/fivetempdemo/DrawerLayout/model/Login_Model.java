package com.example.lenovo.fivetempdemo.DrawerLayout.model;


import android.util.Log;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Login_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Reg_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.app.AppService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;


/**
 * Created by lenovo on 2018/4/25.
 */

public class Login_Model {

    public interface setOnLogin{
        void OnSuccess(Login_Info loginInfo);
    }
    setOnLogin setOnLogin;
    public void getSetOnLogin(setOnLogin setOnLogin){
        this.setOnLogin=setOnLogin;
    }

    public void getLoginModel(String mobile,String password){

            RetrofitUtils inData = RetrofitUtils.getInData();
        AppService retrofit = inData.getRetrofit(Api.URL_, AppService.class);
        Flowable<Login_Info> loginInfo = retrofit.getLoginInfo(mobile,password);
        loginInfo.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<Login_Info>() {
                    @Override
                    public void onNext(Login_Info loginInfo) {
                        Log.d("AAA","onNext");
                        if (setOnLogin!=null) {
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
