package com.example.lenovo.fivetempdemo.DrawerLayout.model;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Attention_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.app.AppService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;


/**
 * Created by lenovo on 2018/4/26.
 */

public class Attention_Model {

    public interface setOnListener{
        void OnSuccess(Attention_Info attention_info);

    }
    setOnListener setOnListener;
    public void getSetOnListener(setOnListener setOnListener){
        this.setOnListener=setOnListener;
    }

    public void getAttentionModel(String token, String uid, String source,String appVersion){
        RetrofitUtils inData = RetrofitUtils.getInData();
        AppService retrofit = inData.getRetrofit(Api.URL_, AppService.class);
        Flowable<Attention_Info> attentionInfo = retrofit.getAttentionInfo(token, uid, source, appVersion);
        attentionInfo.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<Attention_Info>() {
                    @Override
                    public void onNext(Attention_Info attention_info) {
                        if(setOnListener!=null){
                            setOnListener.OnSuccess(attention_info);
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
