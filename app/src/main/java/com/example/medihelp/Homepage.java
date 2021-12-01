package com.example.medihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Homepage extends AppCompatActivity {

    private CardView ambulanceCard,hospitalCard,bmiCard,timerCard,doctorCard,symptomsCard;

    private ImageView ambulanceimg,hospitalimg,bmiimg,timeimg,doctorimg,symptomimg;
    private TextView ambulancetxt,hospitaltxt,bmitxt,timetxt,doctortxt,symptomtxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        ambulanceCard=(CardView)findViewById(R.id.ambulence);
        hospitalCard=(CardView) findViewById(R.id.hospital);
        bmiCard=(CardView) findViewById(R.id.bmi);
        timerCard=(CardView) findViewById(R.id.medialarm);
        doctorCard=(CardView) findViewById(R.id.doctor);
        symptomsCard=(CardView) findViewById(R.id.symptom);
        bmiCard=(CardView)findViewById(R.id.bmi);



        ambulanceimg=(ImageView)findViewById(R.id.ambulanceimg);
        hospitalimg=(ImageView)findViewById(R.id.hospitalimg);
        bmiimg=(ImageView)findViewById(R.id.bmiimg);
        timeimg=(ImageView)findViewById(R.id.medialarmimg);
        doctorimg=(ImageView)findViewById(R.id.doctorimg);
        symptomimg=(ImageView)findViewById(R.id.symptomimg);

        ambulancetxt=(TextView)findViewById(R.id.ambulancetxt);
        hospitaltxt=(TextView)findViewById(R.id.hospitaltxt);
        bmitxt=(TextView)findViewById(R.id.bmitxt);
        timetxt=(TextView)findViewById(R.id.medialarmtxt);
        doctortxt=(TextView)findViewById(R.id.doctortxt);
        symptomtxt=(TextView)findViewById(R.id.symptomtxt);


        ambulanceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Homepage.this,Ambulance.class);
                startActivity(intent);
            }
        });

        hospitalCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Homepage.this,Hospital.class);
                startActivity(intent);
            }
        });
        bmiCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Homepage.this,BMI.class);
                startActivity(intent);
            }
        });



        timerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Homepage.this,MedicalAlarm.class);
                startActivity(intent);
            }
        });
        doctorCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Homepage.this,Consult.class);
                startActivity(intent);
            }
        });


        symptomsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Homepage.this,Symptoms.class);
                startActivity(intent);
            }
        });

    }
}
