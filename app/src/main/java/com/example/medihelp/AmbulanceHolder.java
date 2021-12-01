package com.example.medihelp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AmbulanceHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView abmimg;
    TextView areaname;

    ItemClickListener itemClickListener;


    AmbulanceHolder(@NonNull View itemView) {
        super(itemView);

        this.abmimg= itemView.findViewById(R.id.ambimg);
        this.areaname= itemView.findViewById(R.id.ambarea);

    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClickListener(itemView,getLayoutPosition());

    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener=ic;
    }
}
