package com.example.lenovo.fivetempdemo.FuJinVideo.Nearby_Model;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.FuJinVideo.Bean.Nearby_Bean;
import com.example.lenovo.fivetempdemo.FuJinVideo.api_Service.NearbyService;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by zh on 2018/4/27.
 */

public class MyNerby_Model {
    public interface setNerbyRetulst{
        void setNerbySuccess(Nearby_Bean nearby_bean);
        void setNerbyError(String s);
    }
    setNerbyRetulst nerbyRetulst;
    public void setNerbyOnStart(setNerbyRetulst nerbyRetulst){
         this.nerbyRetulst=nerbyRetulst;
    }

    public void getNerby(String s,String s1,String s2){
        RetrofitUtils.getInData().getRetrofit(Api.URL_, NearbyService.class)
                .getNearby_Bean(s,s1,s2)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<Nearby_Bean>() {
                    @Override
                    public void onNext(Nearby_Bean nearby_bean) {
                        if (nerbyRetulst!=null){
                            nerbyRetulst.setNerbySuccess(nearby_bean);
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
