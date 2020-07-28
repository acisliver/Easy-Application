package com.example.easy_written;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Image_MainAdpater extends AppCompatActivity {

    private FragmentStatePagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adepter);

        ViewPager viewPager=findViewById(R.id.viewpager);
        fragmentPagerAdapter=new ViewPageAdapter(getSupportFragmentManager());

        TabLayout tableLayout=(TabLayout) findViewById(R.id.tab_layout);
        viewPager.setAdapter(fragmentPagerAdapter);
        tableLayout.setupWithViewPager(viewPager);

    }
}
