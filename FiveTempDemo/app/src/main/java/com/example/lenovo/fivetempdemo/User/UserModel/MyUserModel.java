package com.example.lenovo.fivetempdemo.User.UserModel;

import com.example.lenovo.fivetempdemo.Api.Api;
import com.example.lenovo.fivetempdemo.User.UserBean.UserBeans;
import com.example.lenovo.fivetempdemo.User.api.User_Service;
import com.example.lenovo.fivetempdemo.Utils.RetrofitUtils;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by zh on 2018/4/27.
 */

public class MyUserModel {
   public interface setUserOnRetust{
       void setUserSuccess(UserBeans userBeans);
       void setUserError(String s);
   }
   setUserOnRetust userOnRetust;
   public void setOnUserRestultBack(setUserOnRetust userOnRetust){
       this.userOnRetust=userOnRetust;
   }
    public void getUser(final String uid, String page, String source, String appVersion){
        HashMap<String,String> hasMap=new HashMap<>();
        hasMap.put("uid",uid);
        hasMap.put("page",page);
        hasMap.put("source",source);
        hasMap.put("appVersion",appVersion);
        RetrofitUtils.getInData()
                .getRetrofit(Api.URL_, User_Service.class)
                .getUserBeans(hasMap)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<UserBeans>() {
                    @Override
                    public void onNext(UserBeans userBeans) {
                          if (userOnRetust!=null){
                              userOnRetust.setUserSuccess(userBeans);
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
