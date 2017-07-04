package com.example.discrollview;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by HP on 01-07-2017.
 */
public class MyPagerAdapterNT extends FragmentPagerAdapter {

    public MyPagerAdapterNT(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0)
            return "Chess";
        else if (position == 1)
            return "HuntIT";
        else if (position == 2)
            return "Quiz";
        else if (position == 3)
            return "FOQS";
        else if (position == 4)
            return "PWNED";
        else if (position == 5)
            return "Faking the Research";
        else if (position == 6)
            return "The Big Bang";
        else if (position == 7)
            return "16 Words to Go";
        else if (position == 8)
            return "Mini Militia";
        else if (position == 9)
            return "Poker";
        else if (position == 10)
            return "SpeedCubing";
        else if (position == 11)
            return "Mockstocks";
        else
            return "Chakravyuha";
    }

    @Override
    public int getCount() {
        return 13;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new FragmentNT1();
        else if (position == 1)
            return new FragmentNT2();
        else if (position == 2)
            return new FragmentNT3();
        else if (position == 3)
            return new FragmentNT4();
        else if (position == 4)
            return new FragmentNT5();
        else if (position == 5)
            return new FragmentNT6();
        else if (position == 6)
            return new FragmentNT7();
        else if (position == 7)
            return new FragmentNT8();
        else if (position == 8)
            return new FragmentNT9();
        else if (position == 9)
            return new FragmentNT10();
        else if (position == 10)
            return new FragmentNT11();
        else if (position == 11)
            return new FragmentNT12();
        else
            return new FragmentNT13();

    }
}