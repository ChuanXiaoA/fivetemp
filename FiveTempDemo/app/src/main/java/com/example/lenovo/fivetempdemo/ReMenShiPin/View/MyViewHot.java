package com.example.lenovo.fivetempdemo.ReMenShiPin.View;


import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.HotVideoBean;

/**
 * Created by zh on 2018/4/25.
 */
/*
      获取热门列表View层
 */
public interface MyViewHot {
    void setSuccess(HotVideoBean hotVideoBean);
    void setError(String msg);
}
