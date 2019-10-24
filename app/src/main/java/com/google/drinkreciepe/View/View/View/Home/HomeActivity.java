package com.google.drinkreciepe.View.View.View.Home;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.drinkreciepe.R;
import com.google.drinkreciepe.View.Adapters.RecyclerViewHomeAdapter;
import com.google.drinkreciepe.View.Adapters.ViewPagerHeaderAdapter;
import com.google.drinkreciepe.View.Model.Sport;

import com.google.drinkreciepe.View.Utils;
import com.google.drinkreciepe.View.View.View.Detail.DetailHome;
import com.google.drinkreciepe.View.View.View.SportId.SportActivity;

import java.io.Serializable;
import java.util.List;


public class HomeActivity extends AppCompatActivity implements HomeView {
    private static final String TAG = "HomeActivity";

    public static final String  EXTRA_CATEGORY="sportId";
    public static final String EXTRA_POSITION="position";

    private HomePresenter presenter;
    private ViewPager viewPager;
  String ID=null;
    private ShimmerFrameLayout shimmerFrameLayout;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewPager = findViewById(R.id.viewPagerHeader);
        recyclerView = findViewById(R.id.recyclerCategory);


        presenter = new HomePresenter(this);
        presenter.getAllSports();
        presenter.getAllLengue();

    }



    @Override
    public void showDialoge() {
        findViewById(R.id.shimmerDrink).setVisibility(View.VISIBLE);
        findViewById(R.id.shimmerCategory).setVisibility(View.VISIBLE);
    }

    @Override
    public void HideDialoge() {
        findViewById(R.id.shimmerDrink).setVisibility(View.GONE);
        findViewById(R.id.shimmerCategory).setVisibility(View.GONE);

    }

    @Override
    public void onErrorLoading(String message) {
        Utils.showDialogMessage(this, "title", message);

    }

    @Override
    public void setAllSports(List<Sport.Sport_> sports) {

        ViewPagerHeaderAdapter viewPagerHeaderAdapter = new ViewPagerHeaderAdapter(sports, this);
        viewPager.setAdapter(viewPagerHeaderAdapter);
        viewPager.setPadding(20, 0, 150, 0);
        viewPagerHeaderAdapter.notifyDataSetChanged();
        viewPagerHeaderAdapter.setOnItemClickListener(new ViewPagerHeaderAdapter.setOnClickListener() {
            @Override
            public void onClick(View v, int position) {

            }
        });

    }

    @Override
    public void setAllSportRecycle(List<Sport.Sport_> AllSportRecycle) {
        RecyclerViewHomeAdapter recyclerViewLengueAdapter=new RecyclerViewHomeAdapter(AllSportRecycle, this);
        recyclerView.setAdapter(recyclerViewLengueAdapter);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3,
                GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(true);
        recyclerViewLengueAdapter.notifyDataSetChanged();

        recyclerViewLengueAdapter.setOnItemClickListener((view, position) -> {
       Intent intent = new Intent(HomeActivity.this, SportActivity.class);
            intent.putExtra(EXTRA_CATEGORY, (Serializable) AllSportRecycle);
            intent.putExtra(EXTRA_POSITION, position);
            startActivity(intent);
        });

    }
}
