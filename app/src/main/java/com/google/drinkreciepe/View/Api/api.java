package com.google.drinkreciepe.View.Api;

import com.google.drinkreciepe.View.Model.*;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface api {

    @GET("all_sports.php")
    Call<Sport>getAllSport ();

    @GET("search_all_leagues.php")
   Call<Country>getAllSportByCountry(@Query("s") String STR);

    @GET("search_all_leagues.php")
    Call<CountryId>getAllDetailsByCountry(@Query("c") String Country);

}
