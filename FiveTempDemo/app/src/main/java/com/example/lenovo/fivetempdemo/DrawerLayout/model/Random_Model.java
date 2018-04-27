package com.example.lenovo.fivetempdemo.DrawerLayout.model;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Seek_Random_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.app.AppService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by lenovo on 2018/4/27.
 */

public class Random_Model {

    public interface setOnListener{

        void OnSuccess(Seek_Random_Info random_info);
    }
    setOnListener setOnListener;
    public void getSetOnListener(setOnListener setOnListener){
        this.setOnListener=setOnListener;
    }

    public void getRandomModel(String source,String appVersion){

        RetrofitUtils.getInData().getRetrofit(Api.URL_, AppService.class).getRandomInfo(source, appVersion).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DefaultSubscriber<Seek_Random_Info>() {
            @Override
            public void onNext(Seek_Random_Info random_info) {
                if(setOnListener!=null){
                    setOnListener.OnSuccess(random_info);
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
