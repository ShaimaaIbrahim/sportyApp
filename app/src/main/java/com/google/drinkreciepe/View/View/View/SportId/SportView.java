package com.google.drinkreciepe.View.View.View.SportId;

import com.google.drinkreciepe.View.Model.Country;
import com.google.drinkreciepe.View.Model.Sport;


import java.util.List;

public interface SportView  {

    void showLoading();
    void hideLoading();
    void onErrorLoading(String  message);
    void setSportById(List<Country.Country_>getSportById);

}
