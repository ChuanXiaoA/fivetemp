package com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Service;

import com.example.lenovo.fivetempdemo.Cross_Talk.Cross_Talk_Bean.C_Bean_duanzi;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_lunbo;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_tuijian;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lenovo on 2018/4/25.
 */

public interface C_Service {

    //段子
    @GET("quarter/getJokes")
    Flowable<C_Bean_duanzi> getduanzi(@Query("page") String page, @Query("source") String source, @Query("appVersion") String appVersion);

}
