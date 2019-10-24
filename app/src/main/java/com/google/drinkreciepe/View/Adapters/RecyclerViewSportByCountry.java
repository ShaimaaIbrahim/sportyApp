package com.google.drinkreciepe.View.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.drinkreciepe.R;
import com.google.drinkreciepe.View.Model.Country;
import com.google.drinkreciepe.View.View.View.SportId.SportFragment;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class RecyclerViewSportByCountry  extends RecyclerView.Adapter<RecyclerViewSportByCountry.viewHolder> {

    private Context context;
    private List<Country.Country_>country_s;
    private static ClickListener clickListener;

    public RecyclerViewSportByCountry(Context context, List<Country.Country_> getSportById) {
          this.context=context;
          this.country_s=getSportById;

    }


    @NonNull
    @Override
    public RecyclerViewSportByCountry.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view=LayoutInflater.from(context).inflate(R.layout.item_recycler_view_by_country,viewGroup,false);
       return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewSportByCountry.viewHolder viewHolder, int i) {
        String nameCountry=country_s.get(i).getStrLeague();
        String imageCountry=country_s.get(i).getStrBadge();

        viewHolder.textView.setText(nameCountry);
        Picasso.get().load(imageCountry).
                into(viewHolder.imageView);

    }


    @Override
    public int getItemCount() {
     return country_s.size();
    }

public static class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    @BindView(R.id.countryThumb)
    ImageView imageView;
    @BindView(R.id.countryName)
    TextView textView;

    public viewHolder(@NonNull View itemView) {

        super(itemView);
        ButterKnife.bind(this, itemView);
        itemView.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        clickListener.onClick(v, getAdapterPosition());
    }

}

    public void setOnItemClickListener(ClickListener clickListener) {
        RecyclerViewSportByCountry.clickListener = clickListener;
    }


    public interface ClickListener {
        void onClick(View view, int position);
    }
}

