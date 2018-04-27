package com.example.lenovo.fivetempdemo.FuJinVideo.Nearby_View;

import com.example.lenovo.fivetempdemo.FuJinVideo.Bean.Nearby_Bean;

/**
 * Created by zh on 2018/4/27.
 */

public interface MyNearbyView {
    void setNearbySuccess(Nearby_Bean nearby_bean);
    void setNearbyError(String msg);
}
