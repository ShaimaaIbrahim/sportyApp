package com.google.drinkreciepe.View.View.View.SportId;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.drinkreciepe.R;
import com.google.drinkreciepe.View.Adapters.SportViewPagerAdapter;
import com.google.drinkreciepe.View.Model.Sport;
import com.google.drinkreciepe.View.View.View.Home.HomeActivity;

import java.io.Serializable;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SportActivity extends AppCompatActivity {

@BindView(R.id.toolbar)
    Toolbar toolbar;
@BindView(R.id.tabLayout)
    TabLayout tabLayout;
@BindView(R.id.viewPager )
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

      ButterKnife.bind(this);
     initActionBar();
     initIntent();

    }
    private void initIntent(){

        Intent intent=getIntent();

        int position=intent.getIntExtra(HomeActivity.EXTRA_POSITION,0);
    List<Sport.Sport_> AllSportRecycle = (List<Sport.Sport_>)  intent.getSerializableExtra(HomeActivity.EXTRA_CATEGORY);

   SportViewPagerAdapter viewPagerAdapter=new SportViewPagerAdapter(getSupportFragmentManager(),AllSportRecycle);
         viewPager.setAdapter(viewPagerAdapter);
         tabLayout.setupWithViewPager(viewPager);
           viewPager.setCurrentItem(position,true);
           viewPagerAdapter.notifyDataSetChanged();
    }
    private void initActionBar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
              onBackPressed();
              break;
        }
        return super.onOptionsItemSelected(item);
    }
}
