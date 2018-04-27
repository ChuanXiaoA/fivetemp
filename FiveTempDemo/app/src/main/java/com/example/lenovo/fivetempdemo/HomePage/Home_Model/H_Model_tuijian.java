package com.example.lenovo.fivetempdemo.HomePage.Home_Model;

import android.util.Log;

import com.example.lenovo.fivetempdemo.Api.Api;

import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_tuijian;
import com.example.lenovo.fivetempdemo.HomePage.Home_Service.H_Service;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by lenovo on 2018/4/26.
 */

public class H_Model_tuijian {
    private final H_P_tuijian h_p_tuijian;

    public H_Model_tuijian(H_P_tuijian h_p_tuijian) {
        this.h_p_tuijian = h_p_tuijian;
    }

    public void gettuijian() {

        RetrofitUtils inData = RetrofitUtils.getInData();
        H_Service retrofit = inData.getRetrofit(Api.URL_, H_Service.class);
        Flowable<H_Bean_tuijian> gettuijian = retrofit.gettuijian("1","android","101");
        gettuijian.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<H_Bean_tuijian>() {

                    @Override
                    public void onNext(H_Bean_tuijian h_bean_tuijian) {
                        Log.i("xxx","--0"+h_bean_tuijian);
                        h_p_tuijian.success(h_bean_tuijian);
                    }
                    @Override
                    public void onError(Throwable t) {
                       h_p_tuijian.failure();
                    }
                    @Override
                    public void onComplete() {
                        //Log.i("xxx","111111114");
                    }
                });
    }

    public interface H_P_tuijian{
        void success(H_Bean_tuijian h_bean_tuijian);
        void failure();
    }

}
