package com.example.lenovo.fivetempdemo.ReMenShiPin.Presenter;


import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.HotVideoBean;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Model.MyHotVideoModel;
import com.example.lenovo.fivetempdemo.ReMenShiPin.View.MyViewHot;

/**
 * Created by zh on 2018/4/25.
 */
/*
    获取热门列表Presenter层
 */
public class MyHotPresenter {
    MyViewHot myViewHot;
    MyHotVideoModel myHotVideoModel;

    public MyHotPresenter(MyViewHot myViewHot) {
        this.myViewHot = myViewHot;
        myHotVideoModel=new MyHotVideoModel();
    }
    public void reteleHotVideo(int page,String token,String source,String appvesiton){
    myHotVideoModel.getHotVideoData(page,token,source,appvesiton);
    myHotVideoModel.setHotVideo(new MyHotVideoModel.setHotVideojiekou() {
        @Override
        public void setSuccess(HotVideoBean hotVideoBean) {
            if (hotVideoBean.getCode().equals("0")){
                myViewHot.setSuccess(hotVideoBean);
            }else {
                myViewHot.setError(hotVideoBean.getMsg());
            }
        }

        @Override
        public void setError(String errors) {
             myViewHot.setError(errors);
        }
    });
    }
}
