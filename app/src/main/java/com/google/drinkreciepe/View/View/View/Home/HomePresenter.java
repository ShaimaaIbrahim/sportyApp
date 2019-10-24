package com.google.drinkreciepe.View.View.View.Home;

import com.google.drinkreciepe.View.Model.Sport;
import com.google.drinkreciepe.View.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePresenter {

    private HomeView view;
    private static final String TAG = "HomePresenter";

    public HomePresenter(HomeView view) {
        this.view = view;
    }

    public void getAllSports() {
        view.showDialoge();

        Call<Sport> magraitsCall = Utils.getSportApi().getAllSport();
        magraitsCall.enqueue(new Callback<Sport>() {
            @Override
            public void onResponse(Call<Sport> call, Response<Sport> response) {
                view.HideDialoge();

                if (response.isSuccessful() && response.body() != null) {

                    view.setAllSports(response.body().getSports());

                } else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(Call<Sport> call, Throwable t) {
                view.HideDialoge();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }

    public void getAllLengue() {
        view.showDialoge();
        Call<Sport> lengueCall = Utils.getSportApi().getAllSport();
        lengueCall.enqueue(new Callback<Sport>() {
            @Override
            public void onResponse(Call<Sport> call, Response<Sport> response) {
                view.HideDialoge();
                if (response.isSuccessful() && response.body() != null) {
                    view.setAllSportRecycle(response.body().getSports());

                } else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(Call<Sport> call, Throwable t) {
                view.HideDialoge();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });

    }}


