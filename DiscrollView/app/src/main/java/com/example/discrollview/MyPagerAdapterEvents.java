package com.example.discrollview;

/**
 * Created by HP on 01-07-2017.
 */


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by HP on 01-07-2017.
 */
public class MyPagerAdapterEvents extends FragmentPagerAdapter {

    public MyPagerAdapterEvents(FragmentManager fm) {
        super(fm);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        //return (position == 0)? "Procon Junior" : "Tab2" ;
        if(position == 0)
            return "CSE EVENTS";
        else if(position == 1)
            return "ECE EVENTS";
        else
            return "NON-TECH";
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public Fragment getItem(int position) {
        //return (position == 0)? new FragmentA() : new FragmentB() ;
        if(position == 0)
            return new TabOneFragment();
        else if(position == 1)
            return new TabTwoFragment();
        else
            return new TabThreeFragment();
    }
}