package com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Model;

import android.util.Log;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Bean.C_Bean_duanzi;
import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Presenter.C_Presenter_duanzi;
import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Service.C_Service;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_tuijian;
import com.example.lenovo.fivetempdemo.HomePage.Home_Service.H_Service;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by lenovo on 2018/4/27.
 */

public class C_Model_duanzi {
    private final C_P_duanzi c_p_duanzi;

    public C_Model_duanzi(C_P_duanzi c_p_duanzi) {
        this.c_p_duanzi = c_p_duanzi;
    }

    public void getduanzi() {
        RetrofitUtils inData = RetrofitUtils.getInData();
        C_Service retrofit = inData.getRetrofit(Api.URL_, C_Service.class);
        Flowable<C_Bean_duanzi> getduanzi = retrofit.getduanzi("1", "android", "101");
        getduanzi.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<C_Bean_duanzi>() {

                    @Override
                    public void onNext(C_Bean_duanzi c_bean_duanzi) {

                        c_p_duanzi.success(c_bean_duanzi);
                    }
                    @Override
                    public void onError(Throwable t) {
                        c_p_duanzi.failure();
                    }
                    @Override
                    public void onComplete() {
                        //Log.i("xxx","111111114");
                    }
                });
    }

    public interface C_P_duanzi{
        void success(C_Bean_duanzi c_bean_duanzi);
        void failure();
    }


}
