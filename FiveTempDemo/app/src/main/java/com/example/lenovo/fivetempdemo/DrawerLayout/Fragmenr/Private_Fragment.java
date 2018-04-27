package com.example.lenovo.fivetempdemo.DrawerLayout.Fragmenr;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lenovo.fivetempdemo.R;

/**
 * Created by lenovo on 2018/4/27.
 */

public class Private_Fragment extends Fragment {

    private View view;
    private ImageView mPrivateimg;
    String gou="http://img.mp.itc.cn/upload/20170603/f18c02241a9c454a801596448f6ffd45.gif";
    String qqq = "http://img.pconline.com.cn/images/upload/upc/tx/pcdlc/1705/16/c14/47148141_1494934718813.gif";
    String img = "http://wanzao2.b0.upaiyun.com/14564913318181456057965_320x255.gif-460.gif";

    private ImageView mImageView5;
    private ImageView mImageView6;
    private ImageView mImageView7;
    private ImageView mImageView8;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.private_fragment, container, false);
        initView(view);
        Glide.with(this).load(img).into(mPrivateimg);
        Glide.with(this).load(gou).into(mImageView8);
        Glide.with(this).load(qqq).into(mImageView6);
        Glide.with(this).load(R.mipmap.shanliang).into(mImageView5);
        Glide.with(this).load(R.mipmap.sd).into(mImageView7);
        return view;
    }

    private void initView(View view) {
        mPrivateimg = view.findViewById(R.id.privateimg);
        mImageView5 =  view.findViewById(R.id.imageView5);
        mImageView6 =  view.findViewById(R.id.imageView6);
        mImageView7 =  view.findViewById(R.id.imageView7);
        mImageView8 =  view.findViewById(R.id.imageView8);
    }
}
