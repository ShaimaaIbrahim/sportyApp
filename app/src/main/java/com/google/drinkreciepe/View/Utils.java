package com.google.drinkreciepe.View;

import android.app.AlertDialog;
import android.content.Context;

import com.google.drinkreciepe.View.Api.SportClient;
//import com.google.drinkreciepe.View.Model.Margarita;
import com.google.drinkreciepe.View.Api.api;

public class Utils {

    public static  api  getSportApi(){
        return SportClient.getSportApi().create(api.class);
    }

    public static AlertDialog showDialogMessage(Context context, String title, String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).setTitle(title).setMessage(message).show();
        if (alertDialog.isShowing()) {
            alertDialog.cancel();
        }
        return alertDialog; }    }


