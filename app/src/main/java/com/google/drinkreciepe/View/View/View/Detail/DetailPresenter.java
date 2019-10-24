package com.google.drinkreciepe.View.View.View.Detail;

import android.net.Uri;

import com.google.drinkreciepe.View.Model.Country;
import com.google.drinkreciepe.View.Model.CountryId;
import com.google.drinkreciepe.View.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailPresenter {

    DetailView detailView;

    DetailPresenter(DetailView detailView) {
        this.detailView=detailView;

    }

    public void setDetailView(String country){
         detailView.showLoading();
        Call<CountryId>countryCall= Utils.getSportApi().getAllDetailsByCountry(country);
        countryCall.enqueue(new Callback<CountryId>() {
            @Override
            public void onResponse(Call<CountryId> call, Response<CountryId> response) {
                if (response.isSuccessful() && response.body()!=null){
                     detailView.hideLoading();
                     detailView.setCountry( response.body().getCountryis().get(0));
                }
                else{
                   detailView.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(Call<CountryId> call, Throwable t) {
                detailView.hideLoading();
                 detailView.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }
}
