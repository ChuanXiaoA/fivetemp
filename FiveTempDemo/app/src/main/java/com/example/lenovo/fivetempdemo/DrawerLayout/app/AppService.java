package com.example.lenovo.fivetempdemo.DrawerLayout.app;


import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.DianAttention_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.MyAttention_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Collect_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Login_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Seek_Random_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Reg_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.SouSuo_Info;

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
    Flowable<MyAttention_Info> getAttentionInfo(@Query("token") String token, @Query("uid") String uid, @Query("source") String source, @Query("appVersion") String appVersion);
@GET("quarter/getFavorites")
    Flowable<Collect_Info> getCollectInfo(@Query("token") String token,@Query("uid") String uid,@Query("source") String source,@Query("appVersion") String appVersion);
@GET("quarter/randomFriends")
    Flowable<Seek_Random_Info> getRandomInfo(@Query("source") String source, @Query("appVersion") String appVersion);
@GET("quarter/follow")
    Flowable<DianAttention_Info> getDianAttentiionInfo(@Query("token") String token,@Query("uid") String uid,@Query("source") String source,@Query("appVersion") String appVersion,@Query("followId") String followId);
@GET("quarter/searchFriends")
    Flowable<SouSuo_Info> getSouSuoInfo(@Query("source") String source,@Query("appVersion") String appVersion,@Query("keywords") String name);

}
