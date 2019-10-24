package com.google.drinkreciepe.View.Adapters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.google.drinkreciepe.View.Model.Sport;
import com.google.drinkreciepe.View.View.View.SportId.SportFragment;

import java.util.List;
import java.util.Locale;

public class SportViewPagerAdapter extends FragmentPagerAdapter {

   private List<Sport.Sport_>sportS;
    private static final String TAG = "SportViewPagerAdapter";

    public SportViewPagerAdapter(FragmentManager fm ,List<Sport.Sport_>sportS) {
        super(fm);
        this.sportS=sportS;
    }

    @Override
    public Fragment getItem(int i) {
        SportFragment sportFragment=new SportFragment();
        Bundle bundle=new Bundle();
        bundle.putString("DATA_NAME",sportS.get(i).getStrSport());
        bundle.putString("DATA_DESC",sportS.get(i).getStrSportDescription());
        bundle.putString("DATA_THUMB",sportS.get(i).getStrSportThumb());


       sportFragment.setArguments(bundle);

        return sportFragment;
    }

    @Override
    public int getCount() {
   return    sportS.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return sportS.get(position).getStrSport();
    }

}
