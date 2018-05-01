package com.example.lenovo.fivetempdemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class VideoActivity extends AppCompatActivity {

    private ImageView goToPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        goToPhoto = (ImageView) findViewById(R.id.goToPhoto);

        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById(R.id.simple);
        // getData();
        DraweeController mDraweeController = Fresco.newDraweeControllerBuilder()
                .setAutoPlayAnimations(true)
                //设置uri,加载本地的gif资源
                //设置uri
                .setUri(Uri.parse("res://"+getPackageName()+"/"+R.mipmap.video_backgroud))
                .build();
        //设置Controller
        simpleDraweeView.setController(mDraweeController);

        goToPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(VideoActivity.this)
                        .setTitle("选择您想要实现的功能")
                        .setMessage("相机")
                        .setPositiveButton("拍照", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(VideoActivity.this, "点击拍照成功", Toast.LENGTH_SHORT).show();
//                                调取系统相机进行拍照
                                Intent intent = new Intent(VideoActivity.this, CameraActivity.class);
                                startActivity(intent);

                            }
                        }).setNegativeButton("录像", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(VideoActivity.this, "点击录像成功！", Toast.LENGTH_SHORT).show();
//                                调取系统摄像机进行录制视频
                        //Intent intent = new Intent(VideoActivity.this, RecordingActivity.class);
                        //startActivity(intent);

                    }
                }).create().show();
            }
        });
    }
}
