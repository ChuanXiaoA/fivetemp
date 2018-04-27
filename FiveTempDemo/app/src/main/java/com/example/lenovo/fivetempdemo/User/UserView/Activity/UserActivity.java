package com.example.lenovo.fivetempdemo.User.UserView.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.fivetempdemo.R;

public class UserActivity extends AppCompatActivity {

    private String uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Intent intent = getIntent();
        uid = intent.getStringExtra("uid");

    }
}
