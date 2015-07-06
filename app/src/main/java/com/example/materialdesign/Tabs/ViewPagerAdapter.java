package com.example.materialdesign.Tabs;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) {
            TabOne tabOne=new TabOne();
            return tabOne;
        }
        else if(position==1){
            TabTwo tabTwo=new TabTwo();
            return tabTwo;
        }
        else if(position==3){
            TabOne tabOne=new TabOne();
            return tabOne;
        }
        else if(position==2){
            TabTwo tabTwo=new TabTwo();
            return tabTwo;
        }
        else if(position==4){
            TabTwo tabTwo=new TabTwo();
            return tabTwo;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String str=null;
        if(position==0)
            str="Tab One";
        else if (position==1)
            str="Tab Two";
        else if (position==2)
            str="Tab Three";
        else if (position==3)
            str="Tab Four";
        else if (position==4)
            str="Tab Five";

        return str;
    }
}
