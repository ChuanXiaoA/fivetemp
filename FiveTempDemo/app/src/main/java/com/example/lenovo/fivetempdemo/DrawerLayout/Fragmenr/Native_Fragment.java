package com.example.lenovo.fivetempdemo.DrawerLayout.Fragmenr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.fivetempdemo.R;

/**
 * Created by lenovo on 2018/4/27.
 */

public class Native_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.native_fragment, container, false);
        return view;
    }
}