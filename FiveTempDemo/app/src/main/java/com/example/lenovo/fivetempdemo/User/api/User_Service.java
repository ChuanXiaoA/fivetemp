package com.example.lenovo.fivetempdemo.User.api;

import com.example.lenovo.fivetempdemo.User.UserBean.UserBeans;

import java.util.HashMap;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by zh on 2018/4/27.
 */

public interface User_Service {
    @GET("quarter/getUserVideos")
    Flowable<UserBeans> getUserBeans(@QueryMap HashMap<String,String> map);
}
