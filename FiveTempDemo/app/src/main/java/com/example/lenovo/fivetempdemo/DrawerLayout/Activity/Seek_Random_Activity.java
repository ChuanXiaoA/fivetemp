package com.example.lenovo.fivetempdemo.DrawerLayout.Activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.fivetempdemo.Base.BaseActivity;
import com.example.lenovo.fivetempdemo.DrawerLayout.Adapter.Seek_Random_Adapter;
import com.example.lenovo.fivetempdemo.DrawerLayout.Adapter.SouSuo_Adapter;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Seek_Random_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.SouSuo_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.presenter.DianAttention_Presenter;
import com.example.lenovo.fivetempdemo.DrawerLayout.presenter.Seek_Random_Presenter;
import com.example.lenovo.fivetempdemo.DrawerLayout.presenter.SouSuo_Presenter;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.DianAttention_View;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.Seek_Random_View;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.SouSuo_View;
import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.Utils.SPUtil;

import java.util.List;

public class Seek_Random_Activity extends BaseActivity<Seek_Random_Presenter> implements Seek_Random_View,DianAttention_View ,SouSuo_View{

    /**
     * 返回
     */
    private TextView mFanhui;
    /**
     * 搜索好友
     */
    private TextView mMysousuo;
    private ImageView mSosuoimg;
    /**
     * 清除搜索历史
     */
    private TextView mQingchulishijilu;
    private RecyclerView mRlv;
    /**
     * 换一批
     */
    private TextView mHuanyipi;
    private RecyclerView mRlv2;
    private List<Seek_Random_Info.DataBean> data;
    private DianAttention_Presenter dianAttention_presenter;
    private String uid;
    private String token;
    private EditText editText;
    private List<SouSuo_Info.DataBean> data1;

    @Override
    public int getLayout() {
        return R.layout.activity_seek_;
    }

    @Override
    public Seek_Random_Presenter getPresenter() {
        presenter=new Seek_Random_Presenter(this);
        return presenter;
    }

    @Override
    public void initView() {

        mFanhui =  findViewById(R.id.fanhui);
        mMysousuo =  findViewById(R.id.mysousuo);
        mSosuoimg =  findViewById(R.id.sosuoimg);
        mQingchulishijilu =  findViewById(R.id.qingchulishijilu);
        mRlv =  findViewById(R.id.rlv);
        mHuanyipi =  findViewById(R.id.huanyipi);
        mRlv2 =  findViewById(R.id.rlv2);
        editText = findViewById(R.id.sousuo);
    }

    @Override
    public void getData() {
    presenter.getRandomPresenter("android",101+"");
    mRlv2.setLayoutManager(new LinearLayoutManager(this));
    mHuanyipi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            presenter.getRandomPresenter("android",101+"");
        }
    });

        dianAttention_presenter = new DianAttention_Presenter(this);
        SPUtil spUtil=new SPUtil(this,"SPU");
        uid = spUtil.getString("uid", null);
        token = spUtil.getString("token", null);
        final SouSuo_Presenter souSuo_presenter=new SouSuo_Presenter(this);

        mSosuoimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!editText.getText().toString().equals("")){
                    souSuo_presenter.getSouSuoPresenter("android",101+"",editText.getText().toString());
                }
            }
        });
        mQingchulishijilu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data1.clear();
                mRlv.setAdapter(new SouSuo_Adapter(Seek_Random_Activity.this, data1));
            }
        });
        
    }

    @Override
    public void OnSuccess(Seek_Random_Info random_info) {
        data = random_info.getData();
        Seek_Random_Adapter seek_random_adapter = new Seek_Random_Adapter(this, data);
        mRlv2.setAdapter(seek_random_adapter);
        seek_random_adapter.setOnButtonListener(new Seek_Random_Adapter.OnButtonListener() {
            @Override
            public void OnSuccess(int layoutPosition) {

            dianAttention_presenter.getDianAttentionPresenter(token,uid,"android",101+"",data.get(layoutPosition).getUid()+"");
            }
        });

    }

    @Override
    public void OnSuccess(String mag) {
        Toast.makeText(this, mag, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnErrorr(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnSuccess(SouSuo_Info souSuo_info) {
        data1 = souSuo_info.getData();
        mRlv.setLayoutManager(new LinearLayoutManager(this));
        mRlv.setAdapter(new SouSuo_Adapter(Seek_Random_Activity.this, data1));
    }
}
