package com.example.medihelp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HospitalHolder extends RecyclerView.ViewHolder {


    ImageView hosimg;
    TextView hospitalname;
    public HospitalHolder(@NonNull View itemView) {
        super(itemView);

        this.hosimg= itemView.findViewById(R.id.ambimg);
        this.hospitalname= itemView.findViewById(R.id.ambarea);
    }
}