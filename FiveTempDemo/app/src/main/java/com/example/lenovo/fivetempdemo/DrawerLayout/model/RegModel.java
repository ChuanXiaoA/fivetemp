package com.example.lenovo.fivetempdemo.DrawerLayout.model;



import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.RegInfo;
import com.example.lenovo.fivetempdemo.DrawerLayout.app.AppService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;


/**
 * Created by lenovo on 2018/4/25.
 */

public class RegModel {

    public interface setOnReg{
        void OnSuccess(String msg);
        void OnErorr(String msg);
    }
    setOnReg setOnReg;
    public void getSetOnReg(setOnReg setOnReg){

        this.setOnReg=setOnReg;
    }

    public void getRegModel(String type,String mobile,String password){
        RetrofitUtils inData = RetrofitUtils.getInData();
        AppService retrofit = inData.getRetrofit(Api.URL_, AppService.class);
        Flowable<RegInfo> regInfo = retrofit.getRegInfo(type, mobile, password);
        regInfo.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<RegInfo>() {
                    @Override
                    public void onNext(RegInfo regInfo) {
                        String code = regInfo.getCode();
                        String msg = regInfo.getMsg();
                        if(code.equals("0")){
                            if(setOnReg!=null){
                                setOnReg.OnSuccess(msg);
                            }
                        }else {
                            if(setOnReg!=null){
                                setOnReg.OnErorr(msg);
                            }
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
