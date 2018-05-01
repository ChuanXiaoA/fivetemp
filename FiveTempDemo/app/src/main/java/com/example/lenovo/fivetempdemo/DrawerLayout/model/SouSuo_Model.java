package com.example.lenovo.fivetempdemo.DrawerLayout.model;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Collect_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.SouSuo_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.app.AppService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by lenovo on 2018/5/1.
 */

public class SouSuo_Model {

    public interface setOnListener {
        void OnSuccess(SouSuo_Info souSuo_info);
    }

        setOnListener setOnListener;

    public void getSetOnListener(setOnListener setOnListener) {
        this.setOnListener = setOnListener;
    }
    public void getSouSuoModel(String source, String appVersion, String name) {
        RetrofitUtils inData = RetrofitUtils.getInData();
        AppService retrofit = inData.getRetrofit(Api.URL_, AppService.class);
        Flowable<SouSuo_Info> souSuoInfo = retrofit.getSouSuoInfo(source, appVersion, name);
        souSuoInfo.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<SouSuo_Info>() {
                    @Override
                    public void onNext(SouSuo_Info souSuo_info) {
                        setOnListener.OnSuccess(souSuo_info);
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
