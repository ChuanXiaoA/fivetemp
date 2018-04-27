package com.example.lenovo.fivetempdemo.DrawerLayout.model;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.DianAttention_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.app.AppService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by lenovo on 2018/4/27.
 */

public class DianAttention_Model {
    public interface SetOnListener{
        void OnSuccess(String mag);
        void OnErrorr(String msg);
    }
    SetOnListener setOnListener;
    public void getSetOnListener(SetOnListener setOnListener){
        this.setOnListener=setOnListener;
    }
    public void getDianAttentionModel(String token, String uid, String source, String appVersion,String followId){
        RetrofitUtils.getInData().getRetrofit(Api.URL_, AppService.class).getDianAttentiionInfo(token, uid, source, appVersion,followId).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DefaultSubscriber<DianAttention_Info>() {
            @Override
            public void onNext(DianAttention_Info dianAttention_info) {
                String code = dianAttention_info.getCode();
                String msg = dianAttention_info.getMsg();
                if(code.equals("0")){
                    if(setOnListener!=null){
                        setOnListener.OnSuccess(msg);
                    }
                }else{
                    if(setOnListener!=null){
                        setOnListener.OnErrorr(msg);
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
