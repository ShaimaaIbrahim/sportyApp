package com.google.drinkreciepe.View.View.View.Detail;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.drinkreciepe.R;
import com.google.drinkreciepe.View.Model.CountryId;
import com.google.drinkreciepe.View.Utils;
import com.google.drinkreciepe.View.View.View.Home.HomeActivity;
import com.squareup.picasso.Picasso;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailHome extends AppCompatActivity implements DetailView{


    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.appbar)
    AppBarLayout appBarLayout;

    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbarLayout;

    @BindView(R.id.mealThumb)
    ImageView mealThumb;

    @BindView(R.id.category)
    TextView category;

    @BindView(R.id.country)
    TextView country;

    @BindView(R.id.instructions)
    TextView instructions;

    @BindView(R.id.ingredient)
    TextView ingredients;

    @BindView(R.id.measure)
    TextView measures;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    @BindView(R.id.youtube)
    TextView youtube;

    @BindView(R.id.source)
    TextView source;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_home);
        ButterKnife.bind(this);

        setUpActionBar();



Intent intent=getIntent();
String COUNTRY_NAME=intent.getStringExtra("EXTRA_COUNTRY_NAME");


        DetailPresenter presenter=new DetailPresenter(this);
        presenter.setDetailView(COUNTRY_NAME);

    }

    void setUpActionBar(){
setSupportActionBar(toolbar);
        collapsingToolbarLayout.setContentScrimColor(getResources().getColor(R.color.colorWhite));
        collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.colorPrimaryDark));
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.colorWhite));
  if (getSupportActionBar()!=null){
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }
    }

    void setUpColorAction(Drawable favoriteItemColor) {
        appBarLayout.addOnOffsetChangedListener((AppBarLayout appBarLayout, int verticalOffset) -> {
            if ((collapsingToolbarLayout.getHeight() + verticalOffset) < (2 * ViewCompat.getMinimumHeight(collapsingToolbarLayout))) {
                if (toolbar.getNavigationIcon() != null)
                    toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);
                favoriteItemColor.mutate().setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);

            } else {
                if (toolbar.getNavigationIcon() != null)
                    toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_ATOP);
                favoriteItemColor.mutate().setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_ATOP);
            }
        });
    }


    @Override
    public void showLoading() {
 progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
  progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setCountry(CountryId.Country countryIds) {


            Picasso.get().load(countryIds.getStrTrophy()).into(mealThumb);

        category.setText(countryIds.getStrLeague());
        country.setText(countryIds.getStrCountry());
            instructions.setText(countryIds.getStrDescriptionDE());

            setUpActionBar();


        if (!countryIds.getIdLeague().equals("")){
        ingredients.append("Id League : \n\n" );    measures.append(countryIds.getIdLeague()+"\n\n");
        }
        if (!countryIds.getStrSport().equals("")) {
            ingredients.append("Sport Name :\n\n" );  measures.append(countryIds.getStrSport()+"\n\n");
        }
        if (!countryIds.getStrLeagueAlternate().equals("")) {
            ingredients.append("LeagueAlternate :\n\n" );  measures.append(countryIds.getStrLeagueAlternate()+"\n\n");
        }
        if (!countryIds.getStrLeague().equals("")) {
            ingredients.append("League :\n\n" );  measures.append(countryIds.getStrLeague()+"\n\n");
        }
        if (!countryIds.getIntFormedYear().equals("")) {
            ingredients.append("IntFormedYear:\n\n" );  measures.append(countryIds.getIntFormedYear()+"\n\n");
        }
        if (!countryIds.getDateFirstEvent().equals("")) {
            ingredients.append("DataFirstEvent :\n\n" );  measures.append(countryIds.getDateFirstEvent()+"\n\n");
        }
        if (!countryIds.getStrGender().equals("")) {
            ingredients.append("Gender :\n\n" );  measures.append(countryIds.getStrGender()+"\n\n");
        }
        if (!countryIds.getStrLocked().equals("")) {
            ingredients.append("Locked :\n\n" );  measures.append(countryIds.getStrLocked()+"\n\n");
        }
        youtube.setOnClickListener(v -> {
            if (countryIds.getStrYoutube().equals("") || countryIds.getStrYoutube()==null || countryIds.getStrYoutube().isEmpty()) {
                Toast.makeText(DetailHome.this, "This Page is Invalid", Toast.LENGTH_LONG).show();

            } else {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(countryIds.getStrYoutube()));
                startActivity(intent);
            }
        });

        source.setOnClickListener(v -> {
            if (countryIds.getStrWebsite().equals("") || countryIds.getStrWebsite()==null || countryIds.getStrWebsite().isEmpty()) {
                Toast.makeText(DetailHome.this, "This Page is Invalid", Toast.LENGTH_LONG).show();

            } else {
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse(countryIds.getStrWebsite()));
                startActivity(intent1);
            }
        });



    }

    @Override
    public void onErrorLoading(String message) {
        Utils.showDialogMessage(this, "Error", message);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
   getMenuInflater().inflate(R.menu.favorites,menu);
   MenuItem favoriteItem=menu.findItem(R.id.favorite_icon);
   Drawable favoriteIcon=favoriteItem.getIcon();
  setUpColorAction(favoriteIcon);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
