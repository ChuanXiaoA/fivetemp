package com.example.lenovo.fivetempdemo.HomePage.Home_Model;

import android.util.Log;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_lunbo;
import com.example.lenovo.fivetempdemo.HomePage.Home_Service.H_Service;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by lenovo on 2018/4/25.
 */

public class H_Model_lunbo {
    private final H_P_lunbo h_p_lunbo;

    public H_Model_lunbo(H_P_lunbo h_p_lunbo) {
        this.h_p_lunbo = h_p_lunbo;
    }

    public void getlunbo() {
        Log.i("xxx","11111111jin");
        RetrofitUtils inData = RetrofitUtils.getInData();
        H_Service retrofit = inData.getRetrofit(Api.URL_, H_Service.class);
        Flowable<H_Bean_lunbo> getluobo = retrofit.getluobo();
        getluobo.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<H_Bean_lunbo>() {

                    @Override
                    public void onNext(H_Bean_lunbo h_bean_lunbo) {
                        Log.i("xxx","111111112");
                        h_p_lunbo.success(h_bean_lunbo);
                    }
                    @Override
                    public void onError(Throwable t) {
                       h_p_lunbo.failure();
                    }
                    @Override
                    public void onComplete() {
                        //Log.i("xxx","111111114");
                    }
                });
    }


    public interface H_P_lunbo{
        void success(H_Bean_lunbo h_bean_lunbo);
        void failure();
    }


}
