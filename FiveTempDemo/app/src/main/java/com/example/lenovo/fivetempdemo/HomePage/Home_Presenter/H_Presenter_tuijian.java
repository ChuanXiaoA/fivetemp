package com.example.lenovo.fivetempdemo.HomePage.Home_Presenter;

import com.example.lenovo.fivetempdemo.HomePage.Home_I_View.H_I_tuijian;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_tuijian;
import com.example.lenovo.fivetempdemo.HomePage.Home_Model.H_Model_tuijian;

/**
 * Created by lenovo on 2018/4/26.
 */

public class H_Presenter_tuijian implements H_Model_tuijian.H_P_tuijian{


    private final H_Model_tuijian h_model_tuijian;
    private final H_I_tuijian h_i_tuijian;

    public H_Presenter_tuijian(H_I_tuijian h_i_tuijian) {
        this.h_i_tuijian = h_i_tuijian;
        h_model_tuijian = new H_Model_tuijian(this);
    }

    public void gettuijian() {
        h_model_tuijian.gettuijian();
    }

    @Override
    public void success(H_Bean_tuijian h_bean_tuijian) {
        h_i_tuijian.success(h_bean_tuijian);
    }

    @Override
    public void failure() {
        h_i_tuijian.failure1();
    }
}
