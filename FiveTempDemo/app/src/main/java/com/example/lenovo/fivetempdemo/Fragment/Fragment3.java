package com.example.lenovo.fivetempdemo.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.lenovo.fivetempdemo.Fragment.f1.F31;
import com.example.lenovo.fivetempdemo.Fragment.f1.F32;
import com.example.lenovo.fivetempdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/4/24.
 */


public class Fragment3 extends Fragment {
    private F31 f31;
    private F32 f32;
    private List<Fragment> list;
    String[] name = {"热门", "附近"};
    private TabLayout mTablayout;
    private ViewPager mViewpager;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);
        initView(view);
        f31 = new F31();
        f32 = new F32();
        list = new ArrayList<>();
        list.add(f31);
        list.add(f32);
        mTablayout.setupWithViewPager(mViewpager);

        mTablayout.setTabMode(TabLayout.MODE_FIXED);
        mViewpager.setAdapter(new FragmentPagerAdapter(getActivity().getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return name[position];
            }
        });

        return view;
    }

    private void initView(View view) {
        mTablayout = (TabLayout) view.findViewById(R.id.tablayout3);
        mViewpager = (ViewPager) view.findViewById(R.id.viewpager3);
    }
}
