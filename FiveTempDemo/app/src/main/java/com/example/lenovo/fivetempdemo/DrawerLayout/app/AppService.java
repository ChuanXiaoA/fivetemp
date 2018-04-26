package com.example.lenovo.fivetempdemo.DrawerLayout.app;


import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Attention_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Login_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Reg_Info;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lenovo on 2018/4/25.
 */

public interface AppService {

@GET("quarter/register")
    Flowable<Reg_Info> getRegInfo(@Query("regtype") String regtype, @Query("mobile") String mobile, @Query("password") String passwprd);
@GET("user/login")
    Flowable<Login_Info> getLoginInfo(@Query("mobile") String mobile, @Query("password") String passwprd);
@GET("quarter/getFollowUsers")
    Flowable<Attention_Info> getAttentionInfo(@Query("token") String token,@Query("uid") String uid,@Query("source") String source,@Query("appVersion") String appVersion);
}
