package com.example.lenovo.fivetempdemo.HomePage.Home_Presenter;

import com.example.lenovo.fivetempdemo.HomePage.H_I_View.H_I_lunbo;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_lunbo;
import com.example.lenovo.fivetempdemo.HomePage.Home_Model.H_Model_lunbo;

/**
 * Created by lenovo on 2018/4/25.
 */

public class H_Presenter_lunbo implements H_Model_lunbo.H_P_lunbo{

    private final H_Model_lunbo h_model_lunbo;
    private final H_I_lunbo h_i_lunbo;

    public H_Presenter_lunbo(H_I_lunbo h_i_lunbo) {
        this.h_i_lunbo = h_i_lunbo;

        h_model_lunbo = new H_Model_lunbo(this);
    }


    public void getlunbo() {
        h_model_lunbo.getlunbo();

    }

    @Override
    public void success(H_Bean_lunbo h_bean_lunbo) {
        h_i_lunbo.success(h_bean_lunbo);
    }

    @Override
    public void failure() {

    }
}
