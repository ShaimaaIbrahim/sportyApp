package com.google.drinkreciepe.View.View.View.Home;


import com.google.drinkreciepe.View.Model.Sport;

import java.util.List;

public interface HomeView {
    void showDialoge();
    void HideDialoge();
    void onErrorLoading(String message);
    void setAllSports(List<Sport.Sport_>sports);
    void setAllSportRecycle(List<Sport.Sport_>AllSportRecycle);

}
