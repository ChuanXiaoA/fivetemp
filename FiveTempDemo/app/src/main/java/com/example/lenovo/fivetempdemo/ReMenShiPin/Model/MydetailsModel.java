package com.example.lenovo.fivetempdemo.ReMenShiPin.Model;


import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.DetailsBean;

import com.example.lenovo.fivetempdemo.ReMenShiPin.api.ApiService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by zh on 2018/4/26.
 */
/*
          获取视频详情 Model层
 */
public class MydetailsModel {
    public interface setDetailsRestult{
        void setSuccessDatails(DetailsBean detailsBean);
        void setErrorDetails(String msg);
    }
    setDetailsRestult detailsRestult;
    public void setDetailsOnstart(setDetailsRestult detailsRestult){
         this.detailsRestult=detailsRestult;
    }
      public void getDetails(String wid){
          RetrofitUtils.getInData().getRetrofit(Api.URL_, ApiService.class)
                  .getDetailsBean(wid).subscribeOn(Schedulers.io())
                  .observeOn(AndroidSchedulers.mainThread())
                  .subscribeWith(new DefaultSubscriber<DetailsBean>() {
                      @Override
                      public void onNext(DetailsBean detailsBean) {
                          if (detailsRestult!=null){
                              detailsRestult.setSuccessDatails(detailsBean);
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
