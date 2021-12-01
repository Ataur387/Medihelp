package com.example.medihelp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class AmbulanceAdapter extends RecyclerView.Adapter<AmbulanceHolder> {

    Context context;

    //AmbulanceHolder ambulanceHolder;
    ArrayList<ModelAmbulance> modelAmbulances;

    public AmbulanceAdapter(Context context, ArrayList<ModelAmbulance> modelAmbulances) {
        this.context = context;
        this.modelAmbulances = modelAmbulances;
    }

    public AmbulanceAdapter(@NonNull Context context) {
    }

    @NonNull
    @Override
    public AmbulanceHolder onCreateViewHolder(@NonNull ViewGroup parentHolder, int viewType) {

        View view = LayoutInflater.from(parentHolder.getContext()).inflate(R.layout.row,null);
        return new AmbulanceHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AmbulanceHolder ambulanceHolder, int position) {

        ambulanceHolder.areaname.setText(modelAmbulances.get(position).getAreaname());
        ambulanceHolder.abmimg.setImageResource(modelAmbulances.get(position).getImg());

        ambulanceHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View view, int position) {
                String ambarename=modelAmbulances.get(position).getAreaname();

                ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();

                Intent intent=new Intent(context,AmbulanceList.class);
                intent.putExtra("Khaled Ambulance",ambarename);
                context.startActivity(intent);
            }
        });






    }

    @Override
    public int getItemCount() {
        return modelAmbulances.size();
    }
}
