package com.example.lenovo.fivetempdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.example.lenovo.fivetempdemo.Creation.CreationActivity;
import com.example.lenovo.fivetempdemo.DrawerLayout.Activity.Attention_Activity;
import com.example.lenovo.fivetempdemo.DrawerLayout.Adapter.Drawer_Adapter;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Drawer_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Activity.Login_Activity;
import com.example.lenovo.fivetempdemo.Fragment.Fragment1;
import com.example.lenovo.fivetempdemo.Fragment.Fragment2;
import com.example.lenovo.fivetempdemo.Fragment.Fragment3;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.hjm.bottomtabbar.BottomTabBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btnbar)
    BottomTabBar mBtnbar;
    @BindView(R.id.imageView)
    SimpleDraweeView mImageView;
    @BindView(R.id.textView)
    TextView mTextView;
    @BindView(R.id.imageView2)
    ImageView mImageView2;
    @BindView(R.id.touxiang)
    SimpleDraweeView mTouxiang;
    @BindView(R.id.naicha)
    TextView mNaicha;
    @BindView(R.id.rlv)
    RecyclerView mRlv;
    @BindView(R.id.yueliang)
    ImageView mYueliang;
    @BindView(R.id.yejianmoshi)
    TextView mYejianmoshi;
    @BindView(R.id.imageView3)
    ImageView mImageView3;
    @BindView(R.id.imageView4)
    ImageView mImageView4;
    @BindView(R.id.left)
    LinearLayout mLeft;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    private DrawerLayout mDrawerLayout1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getData();


    }
    @OnClick({R.id.btnbar, R.id.imageView, R.id.textView, R.id.imageView2, R.id.touxiang, R.id.naicha, R.id.rlv, R.id.yueliang, R.id.yejianmoshi, R.id.imageView3, R.id.imageView4, R.id.left, R.id.drawer_layout})
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btnbar:
                break;
            case R.id.imageView:
                //点击头像打开侧拉框
                mDrawerLayout.openDrawer(Gravity.LEFT);
                break;
            case R.id.textView:
                break;
            case R.id.imageView2:
                //点击图片跳转到创作页面
                startActivity(new Intent(MainActivity.this, CreationActivity.class));
                break;
            case R.id.touxiang:
                //点击头像跳到登录页面
                startActivity(new Intent(MainActivity.this, Login_Activity.class));
                break;
            case R.id.naicha:
                //点击昵称跳到登录页面
                startActivity(new Intent(MainActivity.this, Login_Activity.class));
                break;
            case R.id.rlv:
                break;
            case R.id.yueliang:
                break;
            case R.id.yejianmoshi:
                break;
            case R.id.imageView3:
                break;
            case R.id.imageView4:
                break;
            case R.id.left:
                break;
            case R.id.drawer_layout:
                break;
        }
    }

    public void getData(){

        mDrawerLayout1 = new DrawerLayout(this);
        mBtnbar.init(getSupportFragmentManager())
                .setFontSize(0)
                .addTabItem("", R.drawable.tuijian2, R.drawable.tuijian1, Fragment1.class)
                .addTabItem("", R.drawable.duanzi2, R.drawable.duanzi1, Fragment2.class)
                .addTabItem("", R.drawable.shipin2, R.drawable.shipin1, Fragment3.class)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {
                        switch (position){
                            case 0:
                                mTextView.setText("推荐");
                                break;
                            case 1:
                                mTextView.setText("段子");
                                break;
                            case 2:
                                mTextView.setText("视频");
                                break;
                        }
                    }
                })
                .isShowDivider(false);
        List<Drawer_Info> list=new ArrayList<>();
        list.add(new Drawer_Info(R.mipmap.raw_1499933216,"我的关注"));
        list.add(new Drawer_Info(R.mipmap.raw_1499947358,"我的收藏"));
        list.add(new Drawer_Info(R.mipmap.raw_1499946865,"搜索好友"));
        list.add(new Drawer_Info(R.mipmap.raw_1499947389,"消息通知"));
        Uri uri = Uri.parse("res:///" + R.mipmap.touxiang);
        AbstractDraweeController build = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setTapToRetryEnabled(true)
                .build();
        mImageView.setController(build);
        AbstractDraweeController build1 = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setTapToRetryEnabled(true)
                .build();
        mTouxiang.setController(build1);
        mRlv.setLayoutManager(new LinearLayoutManager(this));
        Drawer_Adapter drawerAdapter = new Drawer_Adapter(this, list);
        mRlv.setAdapter(drawerAdapter);
        drawerAdapter.getsetOnItemListener(new Drawer_Adapter.setOnItemListener() {
            @Override
            public void OnSuccess(String name) {
                if(name.equals("我的关注")){
                    Toast.makeText(MainActivity.this, "哒哒哒", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, Attention_Activity.class));
                }
            }
        });

    }

}