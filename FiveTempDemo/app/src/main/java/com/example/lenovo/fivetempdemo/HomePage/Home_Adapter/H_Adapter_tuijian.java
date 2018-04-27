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
    //属性动画
    private int a = 0;
    private ObjectAnimator animator;
    private ObjectAnimator fanimator;
    private ObjectAnimator animator1;
    private ObjectAnimator fanimator1;
    private ObjectAnimator animator2;
    private ObjectAnimator fanimator2;
    private ObjectAnimator animator3;
    private ObjectAnimator fanimator3;

    private Context context;
    private List<H_Bean_tuijian.DataBean> data;
    private View inflate;
    private boolean fals = true;

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
//        myViewHolder.img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (fals){
//                    fals = false;
//                    ObjectAnimator animato = ObjectAnimator.ofFloat( myViewHolder.img1, "rotation", 0f, 180f);
//                    animato.setDuration(1000);
//                    animato.start();
////                ObjectAnimator ani = ObjectAnimator.ofFloat( myViewHolder.img1, "alpha", 1f, 0f);
////                ani.setDuration(1000);//时间1s
////                ani.start();
////                ObjectAnimator ani21 = ObjectAnimator.ofFloat( myViewHolder.img1, "alpha", 0f, 1f);
////                ani21.setDuration(1000);//时间1s
////                ani21.start();
//                    ObjectAnimator animator = ObjectAnimator.ofFloat( myViewHolder.img2, "alpha", 1f, 0f, 1f);
//                    animator.setDuration(1000);//时间1s
//                    animator.start();
//                    ObjectAnimator animator2 = ObjectAnimator.ofFloat( myViewHolder.img2, "rotation", 0f, 360f, 0f);
//                    animator2.setDuration(1000);
//                    animator2.start();
//                    ObjectAnimator animator3 = ObjectAnimator.ofFloat( myViewHolder.img2, "translationX", 0f, -90f);
//                    animator3.setDuration(1000);
//                    animator3.start();
//                    ObjectAnimator ani1 = ObjectAnimator.ofFloat( myViewHolder.img3, "alpha", 1f, 0f, 1f);
//                    ani1.setDuration(1000);//时间1s
//                    ani1.start();
//                    ObjectAnimator ani2 = ObjectAnimator.ofFloat(myViewHolder.img3, "rotation", 0f, 360f, 0f);
//                    ani2.setDuration(1000);
//                    ani2.start();
//                    ObjectAnimator ani3 = ObjectAnimator.ofFloat(myViewHolder.img3, "translationX", 0f, -180f);
//                    ani3.setDuration(1000);
//                    ani3.start();
//                    ObjectAnimator anim1 = ObjectAnimator.ofFloat(myViewHolder.img4, "alpha", 1f, 0f, 1f);
//                    anim1.setDuration(1000);//时间1s
//                    anim1.start();
//                    ObjectAnimator anim2 = ObjectAnimator.ofFloat(myViewHolder.img4, "rotation", 0f, 360f, 0f);
//                    anim2.setDuration(1000);
//                    anim2.start();
//                    ObjectAnimator anim3 = ObjectAnimator.ofFloat(myViewHolder.img4, "translationX", 0f, -270f);
//                    anim3.setDuration(1000);
//                    anim3.start();
//                }else {
//                    fals =true;
//                    ObjectAnimator anima = ObjectAnimator.ofFloat(myViewHolder.img1, "rotation", 180f, 0f);
//                    anima.setDuration(1000);
//                    anima.start();
////                ObjectAnimator ani = ObjectAnimator.ofFloat(myViewHolder.img1, "alpha", 0f, 1f);
////                ani.setDuration(1000);//时间1s
////                ani.start();
////                ObjectAnimator ani21 = ObjectAnimator.ofFloat(myViewHolder.img1, "alpha", 1f, 0f);
////                ani21.setDuration(1000);//时间1s
////                ani21.start();
//                    ObjectAnimator animator = ObjectAnimator.ofFloat(myViewHolder.img2, "alpha", 1f, 0f);
//                    animator.setDuration(1000);//时间1s
//                    animator.start();
//                    ObjectAnimator animator2 = ObjectAnimator.ofFloat(myViewHolder.img2, "rotation", 0f, 360f, 0f);
//                    animator2.setDuration(1000);
//                    animator2.start();
//                    ObjectAnimator animator3 = ObjectAnimator.ofFloat(myViewHolder.img2, "translationX", -90f, 0f);
//                    animator3.setDuration(1000);
//                    animator3.start();
//                    ObjectAnimator ani1 = ObjectAnimator.ofFloat(myViewHolder.img3, "alpha", 1f, 0f);
//                    ani1.setDuration(1000);//时间1s
//                    ani1.start();
//                    ObjectAnimator ani2 = ObjectAnimator.ofFloat(myViewHolder.img3, "rotation", 0f, 360f, 0f);
//                    ani2.setDuration(1000);
//                    ani2.start();
//                    ObjectAnimator ani3 = ObjectAnimator.ofFloat(myViewHolder.img3, "translationX", -180f, 0f);
//                    ani3.setDuration(1000);
//                    ani3.start();
//                    ObjectAnimator anim1 = ObjectAnimator.ofFloat(myViewHolder.img4, "alpha", 1f, 0f);
//                    anim1.setDuration(1000);//时间1s
//                    anim1.start();
//                    ObjectAnimator anim2 = ObjectAnimator.ofFloat(myViewHolder.img4, "rotation", 0f, 360f, 0f);
//                    anim2.setDuration(1000);
//                    anim2.start();
//                    ObjectAnimator anim3 = ObjectAnimator.ofFloat(myViewHolder.img4, "translationX", -270f, 0f);
//                    anim3.setDuration(1000);
//                    anim3.start();
//                }
//            }
//        });


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

    }

    @Override
    public int getItemCount() {
        Log.i("zz","--"+data.size());
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private final SimpleDraweeView img;
        private final TextView name;
        private final TextView sj;
        private final TextView ping;
        private final TextView p1;
        private final TextView p2;
        private final JCVideoPlayer vv;
//        private final ImageView img1;
//        private final ImageView img2;
//        private final ImageView img3;
//        private final ImageView img4;
        private final SimpleDraweeView jia,jian,jubao,fuzhi,pingbi;
        private final ImageView sp;

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
            //属性动画
//            img1 = itemView.findViewById(R.id.h_tuijian_img1);
//            img2 = itemView.findViewById(R.id.h_tuijian_img2);
//            img3 = itemView.findViewById(R.id.h_tuijian_img3);
//            img4 = itemView.findViewById(R.id.h_tuijian_img4);
            jia = itemView.findViewById(R.id.h_tuijian_jia);
            jian =  itemView.findViewById(R.id.h_tuijian_jian);
            jubao = itemView.findViewById(R.id.h_tuijian_jubao);
            fuzhi = itemView.findViewById(R.id.h_tuijian_fuzhi);
            pingbi = itemView.findViewById(R.id.h_tuijian_pingbi);
        }
    }

}
