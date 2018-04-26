package com.example.lenovo.fivetempdemo.HomePage.Home_Service;

import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_lunbo;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_tuijian;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lenovo on 2018/4/25.
 */

public interface H_Service {

    //轮播
    @GET("quarter/getAd")
    Flowable<H_Bean_lunbo> getluobo();

    //推荐
    @GET("quarter/getVideos")
    Flowable<H_Bean_tuijian> gettuijian(@Query("page") String page ,@Query("source") String source ,@Query("appVersion") String appVersion  );

}
