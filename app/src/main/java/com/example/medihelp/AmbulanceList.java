package com.example.medihelp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class AmbulanceList extends AppCompatActivity {



    ImageView ambulancelistimg,ambulancelistimg2;
    TextView ambname,ambaddress,ambphone;
    TextView  ambname2,ambaddress2,ambphone2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance_list);


        ambulancelistimg=(ImageView) findViewById(R.id.ambimg);
        ambulancelistimg2=(ImageView) findViewById(R.id.ambimg2);
        ambname=(TextView)findViewById(R.id.ambname);
        ambname2=(TextView)findViewById(R.id.ambname2);
        ambaddress=(TextView)findViewById(R.id.ambaddress);
        ambaddress2=(TextView)findViewById(R.id.ambaddress2);
        ambphone=(TextView)findViewById(R.id.ambphone);
        ambphone2=(TextView)findViewById(R.id.ambphone2);




        ActionBar actionBar=getSupportActionBar();


        Intent intent=getIntent();
        String ambareaname=intent.getStringExtra("Khaled Ambulance");
        actionBar.setTitle(ambareaname);

    }
}
