package com.google.drinkreciepe.View.View.View.Detail;

import com.google.drinkreciepe.View.Model.CountryId;

import java.util.List;

public interface DetailView {

    void showLoading();
    void hideLoading();
     void setCountry(CountryId.Country countryIds);
     void onErrorLoading(String message);
}
