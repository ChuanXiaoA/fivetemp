package com.example.lenovo.fivetempdemo.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.fivetempdemo.R;


public class LoginActivity extends AppCompatActivity {

    private ImageView mWeixin;
    private ImageView mQq;
    /**
     * 其他登陆方式
     */
    private TextView mQitalogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        getData();
    }

    private void initView() {
        mWeixin = findViewById(R.id.weixin);
        mQq = findViewById(R.id.qq);
        mQitalogin = findViewById(R.id.qitalogin);
    }

    public void getData() {

        mQitalogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, LoginRegActivity.class));
            }
        });
    }
}
