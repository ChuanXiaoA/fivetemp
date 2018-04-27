package com.example.lenovo.fivetempdemo.FuJinVideo.api_Service;

import com.example.lenovo.fivetempdemo.FuJinVideo.Bean.Nearby_Bean;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zh on 2018/4/27.
 */

public interface NearbyService {
    @GET("quarter/getNearVideos")
    Flowable<Nearby_Bean> getNearby_Bean(@Query("token") String token,
                                         @Query("source") String source,
                                         @Query("appVersion") String appVersion);
}
