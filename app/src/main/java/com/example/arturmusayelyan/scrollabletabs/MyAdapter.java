package com.example.arturmusayelyan.scrollabletabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by artur.musayelyan on 26/12/2017.
 */

public class MyAdapter extends FragmentPagerAdapter {
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        //Log.d("Art","getItem worked");
        Fragment fragment = null;
        if (position == 0) {
            fragment = new FragmentA();
        } else if (position == 1) {
            fragment = new FragmentB();
        } else if (position == 2) {
            fragment = new FragmentC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
       // Log.d("Art","getCount worked");
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String titile=new String();
        if(position==0){
            return "Tab 1";
        }
        else if (position==1){
            return "Tab 2";
        }
        else if(position==2){
            return "Tab 3";
        }
        return null;
    }
}
