package com.example.lenovo.fivetempdemo.ReMenShiPin.View.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Bean.DetailsBean;
import com.example.lenovo.fivetempdemo.ReMenShiPin.Presenter.MyDetailsPresen;
import com.example.lenovo.fivetempdemo.ReMenShiPin.View.MyDetailsView;
import com.example.lenovo.fivetempdemo.Utils.GlideCircleTransform;
import com.facebook.drawee.controller.AbstractDraweeController;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

public class HotVideoActivity extends AppCompatActivity implements MyDetailsView,View.OnClickListener {

    private JCVideoPlayer viewById;
    private ImageView back_imag;
    private ImageView color_bian;
    // private String videoUrl;
      boolean flg=true;
    private ImageView color_no;
    private ImageView user_id;
    private String icon;
    private Uri uri;
    private AbstractDraweeController build;

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
        //视频上方  点心 分享 返回 展示
        getDataBack();
 
    }
public void StartVideio(){
    viewById = findViewById(R.id.videocontroller1);
    //viewById.ivThumb.setThumbInCustomProject("视频/MP3缩略图地址");
}
//当Acyivity失去焦点时  释放资源
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
        icon = data.getUser().getIcon();
        String workDesc = data.getWorkDesc();
        viewById.setUp(videoUrl,workDesc);
        ImageView imageView=new ImageView(this);
        Glide.with(this).load(data.getCover())
                .into(viewById.ivThumb);
        Log.i("ggg",icon+"Sddddddddddddddddd");

    }

    /**
     * 详情失败的方法
     * @param msg
     */
    @Override
    public void setErrorDetails(String msg) {
        Log.i("Tag",msg+"视频播放错误");
    }
    //获取视频上方 返回 点心  分享  ID
    public void getDataBack(){
        //返回上一层
        back_imag = findViewById(R.id.back_imag);
        //点心
        color_bian = findViewById(R.id.color_id);
        //取消点心
        color_no = findViewById(R.id.color_no);
        //头像
        user_id = findViewById(R.id.user_id);
//        Uri parse = Uri.parse(icon);
//        user_id.setImageURI(parse);
        back_imag.setOnClickListener(this);
        color_bian.setOnClickListener(this);
        color_no.setOnClickListener(this);
        Glide.with(this)
                .load(icon)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .transform(new GlideCircleTransform(this))
                .crossFade()
                .into(user_id);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back_imag:
                finish();
                break;
            case R.id.color_id:
                if (flg==true){
                    flg=false;
                    color_bian.setImageResource(R.drawable.xin1);
                }else {
                    flg=true;
                    color_bian.setImageResource(R.drawable.xin);
                }
                break;
            case R.id.color_no:
                if (flg==true){
                    flg=false;
                    color_no.setImageResource(R.drawable.no1);
                }else {
                    flg=true;
                    color_no.setImageResource(R.drawable.no);
                }
                break;
        }
    }
}
