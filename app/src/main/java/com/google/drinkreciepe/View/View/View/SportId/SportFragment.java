package com.google.drinkreciepe.View.View.View.SportId;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.drinkreciepe.R;
import com.google.drinkreciepe.View.Adapters.RecyclerViewSportByCountry;
import com.google.drinkreciepe.View.Model.Country;
import com.google.drinkreciepe.View.Model.Sport;
import com.google.drinkreciepe.View.Utils;
import com.google.drinkreciepe.View.View.View.Detail.DetailHome;
import com.google.drinkreciepe.View.View.View.Detail.DetailView;
import com.squareup.picasso.Picasso;

import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class SportFragment extends Fragment  implements SportView  {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.imageCategory)
    ImageView imageCategory;
    @BindView(R.id.imageCategoryBg)
    ImageView imageCategoryBg;
    @BindView(R.id.textCategory)
    TextView textCategory;

    public String DATA_NAME;
    AlertDialog.Builder descDialog;
    public SportFragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

     View view= inflater.inflate(R.layout.fragment_sport, container, false);
        ButterKnife.bind(this,view);
     return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {

            if (getArguments() != null) {


                textCategory.setText(getArguments().getString("DATA_DESC"));
                Picasso.get()
                        .load(getArguments().getString("DATA_THUMB"))
                        .into(imageCategory);
                Picasso.get()
                        .load(getArguments().getString("DATA_THUMB"))
                        .into(imageCategoryBg);

                descDialog = new android.support.v7.app.AlertDialog.Builder(getActivity())
                        .setTitle(getArguments().getString("DATA_NAME"))
                        .setMessage(getArguments().getString("DATA_DESC"));


             SportPresenter sportPresenter=new SportPresenter(this);
               sportPresenter.getAllLengueById(getArguments().getString("DATA_NAME"));
        }

    }}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        }

    @Override
    public void showLoading() {
   progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
   progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onErrorLoading(String message) {
        Utils.showDialogMessage(getContext(),"title",message);
    }

    @Override
    public void setSportById(List<Country.Country_> getSportById) {
        RecyclerViewSportByCountry adapter =
                new RecyclerViewSportByCountry(getActivity(), getSportById);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setClipToPadding(false);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        adapter.setOnItemClickListener((view, position) -> {
            Intent intent=new Intent(getContext(), DetailHome.class);

            intent.putExtra("EXTRA_COUNTRY_NAME",getSportById.get(position).getStrCountry());


            startActivity(intent);
        });
    }



@OnClick(R.id.cardCategory)
    public void Onclick(){
        descDialog.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                 dialog.dismiss();
            }
        });
        descDialog.show();
}

}
