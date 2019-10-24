package com.google.drinkreciepe.View.View.View.SportId;

import com.google.drinkreciepe.View.Model.Country;
import com.google.drinkreciepe.View.Model.Sport;
import com.google.drinkreciepe.View.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SportPresenter  {

    SportView sportView;

    public SportPresenter(SportView sportView){
        this.sportView=sportView;
    }

    void getAllLengueById(String STR){

        Call<Country> sportIdCall= Utils.getSportApi().getAllSportByCountry(STR);
        sportView.showLoading();
        sportIdCall.enqueue(new Callback<Country>() {
            @Override
            public void onResponse(Call<Country> call, Response<Country> response) {
                  sportView.hideLoading();
                  if (response.isSuccessful() && response.body()!=null){
                      sportView.setSportById(response.body().getCountrys());
                  }
                  else{
                      sportView.onErrorLoading(response.message());
                  }
            }

            @Override
            public void onFailure(Call<Country> call, Throwable t) {
            sportView.hideLoading();
            sportView.onErrorLoading(t.getLocalizedMessage());

            }
        });
    }

    }

