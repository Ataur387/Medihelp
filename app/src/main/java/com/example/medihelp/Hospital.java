package com.example.medihelp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Hospital extends AppCompatActivity {

    RecyclerView recyclerViewhospital;
    AmbulanceAdapter hospitalAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);


        recyclerViewhospital= (RecyclerView)findViewById(R.id.hospitalrecycler);
        recyclerViewhospital.setLayoutManager(new LinearLayoutManager(this));

        hospitalAdapter =new AmbulanceAdapter(this,getMyList());

        recyclerViewhospital.setAdapter(hospitalAdapter);
    }

    private ArrayList<ModelAmbulance> getMyList()
    {
        ArrayList<ModelAmbulance> modelAmbulances=new ArrayList<>();
        ModelAmbulance m1=new ModelAmbulance();
        m1.setAreaname("MOHAMMADPUR");
        m1.setImg(R.drawable.cover3);
        modelAmbulances.add(m1);

        ModelAmbulance m2=new ModelAmbulance();
        m2.setAreaname("MIRPUR");
        m2.setImg(R.drawable.cover3);
        modelAmbulances.add(m2);

        ModelAmbulance m3=new ModelAmbulance();
        m3.setAreaname("BANANI");
        m3.setImg(R.drawable.cover3);
        modelAmbulances.add(m3);


        ModelAmbulance m4=new ModelAmbulance();
        m4.setAreaname("GULSHAN");
        m4.setImg(R.drawable.cover3);
        modelAmbulances.add(m4);

        ModelAmbulance m5=new ModelAmbulance();
        m5.setAreaname("DHANMONDI");
        m5.setImg(R.drawable.cover3);
        modelAmbulances.add(m5);

        ModelAmbulance m6=new ModelAmbulance();
        m6.setAreaname("SAVAR");
        m6.setImg(R.drawable.cover3);
        modelAmbulances.add(m6);

        ModelAmbulance m7=new ModelAmbulance();
        m7.setAreaname("KOLABAGAN");
        m7.setImg(R.drawable.cover3);
        modelAmbulances.add(m7);

        ModelAmbulance m8=new ModelAmbulance();
        m8.setAreaname("ADABOR");
        m8.setImg(R.drawable.cover3);
        modelAmbulances.add(m8);

        ModelAmbulance m9=new ModelAmbulance();
        m9.setAreaname("GABTOLI");
        m9.setImg(R.drawable.cover3);
        modelAmbulances.add(m9);

        return modelAmbulances;

    }
}
