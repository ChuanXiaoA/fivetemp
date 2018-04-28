package com.example.lenovo.fivetempdemo.HomePage.Home_Adapter;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.lenovo.fivetempdemo.HomePage.Home_Bean.H_Bean_tuijian;
import com.example.lenovo.fivetempdemo.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

/**
 * Created by lenovo on 2018/4/26.
 */



public class H_Adapter_tuijian extends RecyclerView.Adapter {
    private Context context;
    private List<H_Bean_tuijian.DataBean> data;
    private View inflate;

    public H_Adapter_tuijian(Context context, List<H_Bean_tuijian.DataBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        inflate = LayoutInflater.from(context).inflate(R.layout.h_adapter_tuijian_item, parent, false);
        MyViewHolder myViewHolder=new MyViewHolder(inflate);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final MyViewHolder myViewHolder = (MyViewHolder) holder;
        //name
        if (data.get(position).getUser().getNickname()!=null){
            myViewHolder.name.setText(data.get(position).getUser().getNickname());
        }
        //时间
        myViewHolder.sj.setText(data.get(position).getCreateTime());
        //评论
        if (data.get(position).getWorkDesc()!=null){
            myViewHolder.ping.setText(data.get(position).getWorkDesc()+"");
        }
        //头像
        Uri uri = Uri.parse(data.get(position).getUser().getIcon());
        AbstractDraweeController build = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setTapToRetryEnabled(true)
                .build();
        myViewHolder.img.setController(build);

//        Glide.with(context)
//                .load(data.get(position).getUser().getIcon())
//                .into(myViewHolder.img);
        //视频
        myViewHolder.vv.setUp(data.get(position).getVideoUrl()+"",data.get(position).getWid()+"");

        //属性动画
        myViewHolder.jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewHolder.jia.setVisibility(View.GONE);
                myViewHolder.jian.setVisibility(View.VISIBLE);
                //加号
                ObjectAnimator ra = ObjectAnimator.ofFloat( myViewHolder.jia,"rotation", 0f, 360f);
                ra.setDuration(1000);
                ra.start();
                //举报
                ObjectAnimator translationX = new ObjectAnimator().ofFloat( myViewHolder.jubao,"translationX",0,-70f);
                ObjectAnimator translationY = new ObjectAnimator().ofFloat(myViewHolder.jubao,"translationY",0,0);
                ObjectAnimator animator1 = ObjectAnimator.ofFloat(myViewHolder.jubao, "alpha", 1f, 0f, 1f);
                animator1.setDuration(1000);//时间1s
                animator1.start();
                AnimatorSet animatorSet = new AnimatorSet();  //组合动画
                animatorSet.playTogether(translationX,translationY); //设置动画
                animatorSet.setDuration(1000);  //设置动画时间
                animatorSet.start(); //启动
                ObjectAnimator ra_jubao = ObjectAnimator.ofFloat(myViewHolder.jubao,"rotation", 0f, 360f);
                ra_jubao.setDuration(1000);
                ra_jubao.start();
                //复制链接
                ObjectAnimator translationX2 = new ObjectAnimator().ofFloat(myViewHolder.fuzhi,"translationX",0,-140f);
                ObjectAnimator translationY2 = new ObjectAnimator().ofFloat(myViewHolder.fuzhi,"translationY",0,0);
                ObjectAnimator animator = ObjectAnimator.ofFloat(myViewHolder.fuzhi, "alpha", 1f, 0f, 1f);
                animator.setDuration(1000);//时间1s
                animator.start();
                AnimatorSet animatorSet2 = new AnimatorSet();  //组合动画
                animatorSet2.playTogether(translationX2,translationY2); //设置动画
                animatorSet2.setDuration(1000);  //设置动画时间
                animatorSet2.start(); //启动
                ObjectAnimator ra_fuzhi = ObjectAnimator.ofFloat(myViewHolder.fuzhi,"rotation", 0f, 360f);
                ra_fuzhi.setDuration(1000);
                ra_fuzhi.start();
                //屏蔽
                ObjectAnimator translationX3 = new ObjectAnimator().ofFloat(myViewHolder.pingbi,"translationX",0,-210f);
                ObjectAnimator translationY3 = new ObjectAnimator().ofFloat(myViewHolder.pingbi,"translationY",0,0);
                ObjectAnimator animator2 = ObjectAnimator.ofFloat(myViewHolder.pingbi, "alpha", 1f, 0f, 1f);
                animator2.setDuration(1000);//时间1s
                animator2.start();
                AnimatorSet animatorSet3 = new AnimatorSet();  //组合动画
                animatorSet3.playTogether(translationX3,translationY3); //设置动画
                animatorSet3.setDuration(1000);  //设置动画时间
                animatorSet3.start(); //启动
                ObjectAnimator ra_ping = ObjectAnimator.ofFloat(myViewHolder.pingbi,"rotation", 0f, 360f);
                ra_ping.setDuration(1000);
                ra_ping.start();
            }
        });
        //关闭
        myViewHolder.jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewHolder.jia.setVisibility(View.VISIBLE);
                myViewHolder.jian.setVisibility(View.GONE);
                //屏蔽
                ObjectAnimator translationX3 = new ObjectAnimator().ofFloat(myViewHolder.pingbi,"translationX",-70f,0f);
                ObjectAnimator translationY3 = new ObjectAnimator().ofFloat(myViewHolder.pingbi,"translationY",0,0);
                ObjectAnimator animator = ObjectAnimator.ofFloat(myViewHolder.pingbi, "alpha", 1f, 0f);
                animator.setDuration(1000);//时间1s
                animator.start();
                AnimatorSet animatorSet3 = new AnimatorSet();  //组合动画
                animatorSet3.playTogether(translationX3,translationY3); //设置动画
                animatorSet3.setDuration(1000);  //设置动画时间
                animatorSet3.start(); //启动
                ObjectAnimator ra_ping = ObjectAnimator.ofFloat(myViewHolder.pingbi,"rotation", 0f, 360f);
                ra_ping.setDuration(1000);
                ra_ping.start();
                //复制链接
                ObjectAnimator translationX2 = new ObjectAnimator().ofFloat(myViewHolder.fuzhi,"translationX",-140,0f);
                ObjectAnimator translationY2 = new ObjectAnimator().ofFloat(myViewHolder.fuzhi,"translationY",0,0);
                ObjectAnimator animator3 = ObjectAnimator.ofFloat(myViewHolder.fuzhi, "alpha", 1f, 0f);
                animator3.setDuration(1000);//时间1s
                animator3.start();
                AnimatorSet animatorSet2 = new AnimatorSet();  //组合动画
                animatorSet2.playTogether(translationX2,translationY2); //设置动画
                animatorSet2.setDuration(1000);  //设置动画时间
                animatorSet2.start(); //启动
                ObjectAnimator ra_fuzhi = ObjectAnimator.ofFloat(myViewHolder.fuzhi,"rotation", 0f, 360f);
                ra_fuzhi.setDuration(1000);
                ra_fuzhi.start();
                //举报
                ObjectAnimator translationX = new ObjectAnimator().ofFloat(myViewHolder.jubao,"translationX",-210,0f);
                ObjectAnimator translationY = new ObjectAnimator().ofFloat(myViewHolder.jubao,"translationY",0,0);
                ObjectAnimator animator4 = ObjectAnimator.ofFloat(myViewHolder.jubao, "alpha", 1f, 0f);
                animator4.setDuration(1000);//时间1s
                animator4.start();
                AnimatorSet animatorSet = new AnimatorSet();  //组合动画
                animatorSet.playTogether(translationX,translationY); //设置动画
                animatorSet.setDuration(1000);  //设置动画时间
                animatorSet.start(); //启动
                ObjectAnimator ra_jubao = ObjectAnimator.ofFloat(myViewHolder.jubao,"rotation", 0f, 360f);
                ra_jubao.setDuration(1000);
                ra_jubao.start();
            }
        });

        //点击心加一
        myViewHolder.xin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    myViewHolder.xin2_1.setVisibility(View.VISIBLE);
                    myViewHolder.xin2.setVisibility(View.INVISIBLE);
                    String num = myViewHolder.xin1.getText().toString();
                    int i = Integer.parseInt(num);
                    i++;
                    myViewHolder.xin1.setText(i+"");
            }
        });
        //点击❤减一
        myViewHolder.xin2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    myViewHolder.xin2.setVisibility(View.VISIBLE);
                    myViewHolder.xin2_1.setVisibility(View.INVISIBLE);
                    String num = myViewHolder.xin1.getText().toString();
                    int i = Integer.parseInt(num);
                    i--;
                    myViewHolder.xin1.setText(i+"");
            }
        });

        //点击星星加一
        myViewHolder.xing2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myViewHolder.xing2_1.setVisibility(View.VISIBLE);
                myViewHolder.xing2.setVisibility(View.INVISIBLE);
                String num = myViewHolder.xing1.getText().toString();
                int i = Integer.parseInt(num);
                i++;
                myViewHolder.xing1.setText(i+"");
            }
        });
        myViewHolder.xing2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myViewHolder.xing2.setVisibility(View.VISIBLE);
                myViewHolder.xing2_1.setVisibility(View.INVISIBLE);
                String num = myViewHolder.xing1.getText().toString();
                int i = Integer.parseInt(num);
                i--;
                myViewHolder.xing1.setText(i+"");
            }
        });
    }
    @Override
    public int getItemCount() {
        Log.i("zz","--"+data.size());
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView name,sj,ping,p1,p2,xin1,xing1,zhuan1,ping1;
        private final JCVideoPlayer vv;
        private final SimpleDraweeView jia,jian,jubao,fuzhi,pingbi,img;
        private final ImageView sp,xin2,xing2,zhuan2,ping2,xin2_1,xing2_1;
        public MyViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.h_tuijian_img);
            sp = itemView.findViewById(R.id.h_tuijian_sp);
            //昵称
            name = itemView.findViewById(R.id.h_tuijian_tv_name);
            //时间
            sj = itemView.findViewById(R.id.h_tuijian_tv_sj);
            //视频
            vv = itemView.findViewById(R.id.h_tuijian_vv);
            //标题
            ping = itemView.findViewById(R.id.h_tuijian_tv_ping);
            //评论
            p1 = itemView.findViewById(R.id.h_tuijian_tv_p1);
            p2 = itemView.findViewById(R.id.h_tuijian_tv_p2);
            jia = itemView.findViewById(R.id.h_tuijian_jia);
            jian =  itemView.findViewById(R.id.h_tuijian_jian);
            jubao = itemView.findViewById(R.id.h_tuijian_jubao);
            fuzhi = itemView.findViewById(R.id.h_tuijian_fuzhi);
            pingbi = itemView.findViewById(R.id.h_tuijian_pingbi);

            xin1 = itemView.findViewById(R.id.h_tuijian_xin1);
            xing1 = itemView.findViewById(R.id.h_tuijian_xing1);
            zhuan1 = itemView.findViewById(R.id.h_tuijian_zhuan1);
            ping1 = itemView.findViewById(R.id.h_tuijian_ping1);

            xin2 = itemView.findViewById(R.id.imageView15);
            xin2_1 = itemView.findViewById(R.id.imageView15_1);
            xing2 = itemView.findViewById(R.id.imageView16);
            xing2_1 = itemView.findViewById(R.id.imageView16_1);
            zhuan2 = itemView.findViewById(R.id.imageView17);
            ping2 = itemView.findViewById(R.id.imageView18);

        }
    }
}
