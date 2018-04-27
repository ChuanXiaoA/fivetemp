package com.example.lenovo.fivetempdemo.DrawerLayout.model;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Collect_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.app.AppService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by lenovo on 2018/4/27.
 */

public class Collect_Model {

    public interface setOnListener {
        void OnSuccess(Collect_Info collect_info);
    }

    setOnListener setOnListener;

    public void getSetOnListener(setOnListener setOnListener) {
        this.setOnListener = setOnListener;
    }

    public void getCollectModel(String token, String uid, String source, String appVersion) {
        RetrofitUtils.getInData().getRetrofit(Api.URL_, AppService.class).getCollectInfo(token, uid, source, appVersion).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DefaultSubscriber<Collect_Info>() {
            @Override
            public void onNext(Collect_Info collect_info) {
                if (setOnListener != null) {
                    setOnListener.OnSuccess(collect_info);

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
