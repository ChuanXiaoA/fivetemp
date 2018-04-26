package com.example.lenovo.fivetempdemo.ReMenShiPin.View;

/**
 * Created by zh on 2018/4/26.
 */

import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.DetailsBean;

/**
 *     热门详情View层
 */
public interface MyDetailsView {
    void setSusseccDetails(DetailsBean detailsBean);
    void setErrorDetails(String msg);
}
