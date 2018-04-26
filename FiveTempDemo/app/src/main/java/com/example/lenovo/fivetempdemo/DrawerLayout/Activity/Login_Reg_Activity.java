package com.example.lenovo.fivetempdemo.DrawerLayout.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.fivetempdemo.DrawerLayout.Bean.Login_Info;
import com.example.lenovo.fivetempdemo.DrawerLayout.presenter.Login_Presenter;
import com.example.lenovo.fivetempdemo.DrawerLayout.view.Login_View;
import com.example.lenovo.fivetempdemo.MainActivity;
import com.example.lenovo.fivetempdemo.R;
import com.example.lenovo.fivetempdemo.Utils.SPUtil;


public class Login_Reg_Activity extends AppCompatActivity implements Login_View {

    private ImageView mHuitui;
    /**
     * 注册账号
     */
    private TextView mZhucezhanghao;
    /**
     * 账号
     */
    private EditText mName;
    /**
     * 密码
     */
    private EditText mPwd;
    /**
     * 登录
     */
    private Button mLoginbtn;
    /**
     * 忘记密码
     */
    private TextView mWangjimima;
    /**
     * 游客登录
     */
    private TextView mYoukedenglu;
    private Login_Presenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_reg);
        initView();
        loginPresenter = new Login_Presenter(this);
        getData();
    }

    private void initView() {
        mHuitui = findViewById(R.id.huitui);
        mZhucezhanghao = findViewById(R.id.zhucezhanghao);
        mName = findViewById(R.id.name);
        mPwd = findViewById(R.id.pwd);
        mLoginbtn = findViewById(R.id.loginbtn);
        mWangjimima = findViewById(R.id.wangjimima);
        mYoukedenglu = findViewById(R.id.youkedenglu);
    }


    public void getData() {
        mZhucezhanghao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_Reg_Activity.this, Reg_Activity.class));

            }
        });

        //点击登录按钮
        mLoginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mName.getText().toString();
                String pwd = mPwd.getText().toString();
                loginPresenter.getLoginPresenter(name,pwd);
                Log.d("AAA",name);
                Log.d("AAA",pwd);
            }
        });
        //点击游客登录跳转到主页面
        mYoukedenglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_Reg_Activity.this, MainActivity.class));

            }
        });
        //点击忘记密码跳转
        mWangjimima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            startActivity(new Intent(Login_Reg_Activity.this,Forget_Pwd_Activity.class));

            }
        });
    }

    //成功方法返回成功直接跳转到主页面
    @Override
    public void OnSuccess(Login_Info loginInfo) {
        if(loginInfo.getCode().equals("0")){
            Login_Info.DataBean data = loginInfo.getData();
            int uid = data.getUid();
            String token = data.getToken();
            SPUtil spu = new SPUtil(Login_Reg_Activity.this, "SPU");
            spu.putString("uid",uid+"");
            spu.putString("token",token);
            Toast.makeText(this, loginInfo.getMsg(), Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Login_Reg_Activity.this, MainActivity.class));
        }else {
            Toast.makeText(this, loginInfo.getMsg(), Toast.LENGTH_SHORT).show();

        }



    }


}
