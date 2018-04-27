package com.example.lenovo.fivetempdemo.DrawerLayout.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.fivetempdemo.DrawerLayout.Fragmenr.Native_Fragment;
import com.example.lenovo.fivetempdemo.DrawerLayout.Fragmenr.Uploading_Fragment;
import com.example.lenovo.fivetempdemo.R;

import java.util.ArrayList;
import java.util.List;

public class Production_Activity extends AppCompatActivity {

    private TabLayout mZptab;
    private ViewPager mZpviewpager;
    private Native_Fragment native_fragment;
    private Uploading_Fragment uploading_fragment;
    private List<Fragment> fragmentList;
    String[] strings={"本地作品","已上传"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_);
        initView();
        native_fragment = new Native_Fragment();
        uploading_fragment = new Uploading_Fragment();
        fragmentList = new ArrayList<>();
        fragmentList.add(native_fragment);
        fragmentList.add(uploading_fragment);
        mZptab.setTabMode(TabLayout.MODE_FIXED);
        mZptab.setupWithViewPager(mZpviewpager);
        mZpviewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return strings[position];
            }
        });
    }

    private void initView() {
        mZptab =  findViewById(R.id.zptab);
        mZpviewpager =  findViewById(R.id.zpviewpager);
    }
}
