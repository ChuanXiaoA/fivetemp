package com.example.lenovo.fivetempdemo.ReMenShiPin.View.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.DetailsBean;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Presenter.MyDetailsPresen;
import com.example.lenovo.fivetempdemo.ReMenShiPin.View.MyDetailsView;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

public class HotVideoActivity extends AppCompatActivity implements MyDetailsView {

    private JCVideoPlayer viewById;
   // private String videoUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_video);

        Intent intent = getIntent();
       // videoUrl = intent.getStringExtra("videoUrl");
        String wid = intent.getStringExtra("wid");
        //详情Presenter层请求
        MyDetailsPresen myDetailsPresen=new MyDetailsPresen(this);
        myDetailsPresen.resetleDetails(wid);
        //获取播放视频控件方法
        StartVideio();

 
    }
public void StartVideio(){
    viewById = findViewById(R.id.videocontroller1);

    //viewById.ivThumb.setThumbInCustomProject("视频/MP3缩略图地址");


}
    @Override
    protected void onPause() {
        super.onPause();
        viewById.release();
    }

    /**
     * \详情页面成功的方法
     * @param detailsBean
     */
    @Override
    public void setSusseccDetails(DetailsBean detailsBean) {

        Log.i("Tag",detailsBean.getMsg()+"视频播放成功");
        DetailsBean.DataBean data = detailsBean.getData();
        String videoUrl = data.getVideoUrl();
       // String nickname = data.getUser().getNickname();
        String workDesc = data.getWorkDesc();
        viewById.setUp(videoUrl,workDesc);
        ImageView imageView=new ImageView(this);
        Glide.with(this).load(data.getCover())
                .into(viewById.ivThumb);

    }

    /**
     * 详情失败的方法
     * @param msg
     */
    @Override
    public void setErrorDetails(String msg) {
        Log.i("Tag",msg+"视频播放错误");
    }
}
