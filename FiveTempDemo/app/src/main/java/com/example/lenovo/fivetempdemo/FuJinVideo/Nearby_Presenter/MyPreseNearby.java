package com.example.lenovo.fivetempdemo.FuJinVideo.Nearby_Presenter;

import com.example.lenovo.fivetempdemo.FuJinVideo.Bean.Nearby_Bean;
import com.example.lenovo.fivetempdemo.FuJinVideo.Nearby_Model.MyNerby_Model;
import com.example.lenovo.fivetempdemo.FuJinVideo.Nearby_View.MyNearbyView;

/**
 * Created by zh on 2018/4/27.
 */

public class MyPreseNearby {
    MyNearbyView myNearbyView;
    MyNerby_Model myNerby_model;

    public MyPreseNearby(MyNearbyView myNearbyView) {
        this.myNearbyView = myNearbyView;
        myNerby_model=new MyNerby_Model();
    }
    public void resterNearby(String s,String s1,String s2){
         myNerby_model.getNerby(s,s1,s2);
         myNerby_model.setNerbyOnStart(new MyNerby_Model.setNerbyRetulst() {
             @Override
             public void setNerbySuccess(Nearby_Bean nearby_bean) {
                 if (nearby_bean.getCode().equals("0")){
                     myNearbyView.setNearbySuccess(nearby_bean);
                 }else {
                     myNearbyView.setNearbyError(nearby_bean.getMsg());
                 }
             }

             @Override
             public void setNerbyError(String s) {
                myNearbyView.setNearbyError(s);
             }
         });
    }
}
