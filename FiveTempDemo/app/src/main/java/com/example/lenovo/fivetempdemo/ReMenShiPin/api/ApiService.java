package com.example.lenovo.fivetempdemo.ReMenShiPin.api;

import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.HotVideoBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zh on 2018/4/25.
 */

public interface ApiService {
    @GET("quarter/getHotVideos")
    Flowable<HotVideoBean> getHotVideo(@Query("page") String page,
                                       @Query("token") String token,
                                       @Query("source") String source,
                                       @Query("appVersion") String appVersion);
}
