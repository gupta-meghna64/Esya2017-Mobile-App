package com.example.discrollview;

/**
 * Created by HP on 01-07-2017.
 */
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.astuetz.PagerSlidingTabStrip;

public class CSEMainActivity extends AppCompatActivity {

    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.pagerCse);
        pager.setAdapter(new MyPagerAdapterCSE(getSupportFragmentManager()));

        // Bind the tabs to the ViewPager
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabsCse);
        tabs.setViewPager(pager);


//        Intent i = getIntent();
//        String fragmentName = i.getStringExtra("fragment");
//        String fragmentCSE2 = "FragmentCSE2";
//        Log.e("Test1", "Test1" + fragmentName);
//        if (fragmentName != null && fragmentName.equals(fragmentCSE2)) {
//
//            Fragment fragment2 = new FragmentCSE2();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction fragmentTransaction = fm.beginTransaction();
//            fragmentTransaction.replace(R.id.pagerCse, fragment2);
//            fragmentTransaction.commit();
//
//        }

        int position = 0;
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            position = extras.getInt("viewpager_position");
        }
        pager = (ViewPager) findViewById(R.id.pagerCse);
        MyPagerAdapterCSE myPagerAdapter = new MyPagerAdapterCSE(getSupportFragmentManager());
        if(pager.getAdapter() == null) {
            pager.setAdapter(myPagerAdapter);

        }
        pager.setCurrentItem(position);
    }
}
