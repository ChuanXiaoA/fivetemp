package com.example.lenovo.fivetempdemo.ReMenShiPin.Model;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.HotVideoBean;

import com.example.lenovo.fivetempdemo.ReMenShiPin.api.ApiService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by zh on 2018/4/25.
 */
/*
           获取热门列表Model层
 */
public class MyHotVideoModel {
public interface setHotVideojiekou{
    void setSuccess(HotVideoBean hotVideoBean);
    void setError(String errors);
}
setHotVideojiekou sethotVideojiekou;
public void setHotVideo(setHotVideojiekou sethotVideojiekou){
    this.sethotVideojiekou=sethotVideojiekou;
}

    public void getHotVideoData(int page,String token,String source,String appvesiton){
        RetrofitUtils inData = RetrofitUtils.getInData();
        ApiService retrofit = inData.getRetrofit(Api.URL_, ApiService.class);
        Flowable<HotVideoBean> hotVideo = retrofit.getHotVideo(page, token, source, appvesiton);
          hotVideo.subscribeOn(Schedulers.io())
                  .observeOn(AndroidSchedulers.mainThread())
                  .subscribeWith(new DefaultSubscriber<HotVideoBean>() {
                      @Override
                      public void onNext(HotVideoBean hotVideoBean) {
                       if (sethotVideojiekou!=null){
                           sethotVideojiekou.setSuccess(hotVideoBean);
                       }
                      }

                      @Override
                      public void onError(Throwable t) {

                      }

                      @Override
                      public void onComplete() {

                      }
                  });

    }
}
