package com.example.android.touristguide;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context  mContext;


    public SimpleFragmentPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new HistoricSitesFragment();
        } else if(position == 1){
            return new ParksFragment();
        }else  if (position == 2){
            return  new LakesFragment();
        }else {
            return new MuseumsFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Historic_sites);
        } else {
            if (position == 1) {
                return mContext.getString(R.string.parks);
            } else if (position == 2) {
                return mContext.getString(R.string.lakes);
            } else {
                return mContext.getString(R.string.Museums);
            }
        }
    }

}
