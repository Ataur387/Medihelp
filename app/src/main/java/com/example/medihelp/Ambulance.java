package com.example.medihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Ambulance extends AppCompatActivity {
        RecyclerView recyclerViewambulance;
        AmbulanceAdapter ambulanceAdapter;

        ImageView ambmain;
        TextView ambmainname;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ambulance);



            recyclerViewambulance= (RecyclerView)findViewById(R.id.ambulancerecycler);
            recyclerViewambulance.setLayoutManager(new LinearLayoutManager(this));

            ambulanceAdapter =new AmbulanceAdapter(this,getMyList());

            recyclerViewambulance.setAdapter(ambulanceAdapter);
            ambmain=(ImageView)findViewById(R.id.ambimg);
            ambmainname=(TextView)findViewById(R.id.consult);


            ambmainname.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Ambulance.this,AmbulanceList.class);
                    startActivity(intent);

                }
            });








        }
        public ArrayList<ModelAmbulance> getMyList()
        {
            ArrayList<ModelAmbulance> modelAmbulances=new ArrayList<>();
            ModelAmbulance m1=new ModelAmbulance();
            m1.setAreaname("GAJIPUR");
            m1.setImg(R.drawable.ambulence);
            modelAmbulances.add(m1);

            ModelAmbulance m2=new ModelAmbulance();
            m2.setAreaname("MIRPUR");
            m2.setImg(R.drawable.ambulence);
            modelAmbulances.add(m2);

            ModelAmbulance m3=new ModelAmbulance();
            m3.setAreaname("BANANI");
            m3.setImg(R.drawable.ambulence);
            modelAmbulances.add(m3);


            ModelAmbulance m4=new ModelAmbulance();
            m4.setAreaname("GULSHAN");
            m4.setImg(R.drawable.ambulence);
            modelAmbulances.add(m4);

            ModelAmbulance m5=new ModelAmbulance();
            m5.setAreaname("DHANMONDI");
            m5.setImg(R.drawable.ambulence);
            modelAmbulances.add(m5);

            ModelAmbulance m6=new ModelAmbulance();
            m6.setAreaname("SAVAR");
            m6.setImg(R.drawable.ambulence);
            modelAmbulances.add(m6);

            ModelAmbulance m7=new ModelAmbulance();
            m7.setAreaname("KOLABAGAN");
            m7.setImg(R.drawable.ambulence);
            modelAmbulances.add(m7);

            ModelAmbulance m8=new ModelAmbulance();
            m8.setAreaname("ADABOR");
            m8.setImg(R.drawable.ambulence);
            modelAmbulances.add(m8);

            ModelAmbulance m9=new ModelAmbulance();
            m9.setAreaname("GABTOLI");
            m9.setImg(R.drawable.ambulence);
            modelAmbulances.add(m9);

            return modelAmbulances;

        }
    }
