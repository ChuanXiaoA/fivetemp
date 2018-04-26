package com.example.lenovo.fivetempdemo.ReMenShiPin.Presenter;

/**
 * Created by zh on 2018/4/26.
 */

import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.DetailsBean;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Model.MydetailsModel;
import com.example.lenovo.fivetempdemo.ReMenShiPin.View.MyDetailsView;

/**
 *     热门详情Presenter
 */
public class MyDetailsPresen {
    MyDetailsView myDetailsView;
    MydetailsModel mydetailsModel;

    public MyDetailsPresen(MyDetailsView myDetailsView) {
        this.myDetailsView = myDetailsView;
        mydetailsModel=new MydetailsModel();
    }
    public void resetleDetails(String wid){
      mydetailsModel.getDetails(wid);
      mydetailsModel.setDetailsOnstart(new MydetailsModel.setDetailsRestult() {
          @Override
          public void setSuccessDatails(DetailsBean detailsBean) {
            if (detailsBean.getCode().equals("0")){
                myDetailsView.setSusseccDetails(detailsBean);
            }else {
                myDetailsView.setErrorDetails(detailsBean.getMsg());
            }
          }

          @Override
          public void setErrorDetails(String msg) {
               myDetailsView.setErrorDetails(msg);
          }
      });
    }
}
