package com.google.drinkreciepe.View.Adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.drinkreciepe.View.Model.Sport;
import com.google.drinkreciepe.View.View.View.Home.HomeActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

import com.google.drinkreciepe.R;

public class ViewPagerHeaderAdapter extends PagerAdapter {

    private List<Sport.Sport_> sportS;
    private Context context;
    private static setOnClickListener clickListener;

    public ViewPagerHeaderAdapter(List<Sport.Sport_> sportS, Context context) {

        this.sportS=sportS;
        this.context = context;
    }

    public void setOnItemClickListener(setOnClickListener clickListener) {
        ViewPagerHeaderAdapter.clickListener = clickListener;
    }





    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @Override
    public int getCount() {
        return sportS.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_view_pager_header,
                container,
                false
        );

        ImageView mealThumb = view.findViewById(R.id.drinkThumb);
        TextView mealName = view.findViewById(R.id.mealName);

        String strMealThumb = sportS.get(position).getStrSportThumb();
        Picasso.get().load(strMealThumb).into(mealThumb);

        String strMealName = sportS.get(position).getStrSport();
        mealName.setText(strMealName);


        view.setOnClickListener(v -> clickListener.onClick(v, position));

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    public interface setOnClickListener {
        void onClick(View v, int position);
    }
}
