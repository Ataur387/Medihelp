package com.example.medihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MedicalAlarm extends AppCompatActivity {


    MediTime mediTime;
    int currentHour;
    int currentMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meditime);
        //setContentView(R.layout.calendarview);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        EditText alarm;
        alarm=findViewById(R.id.alarm1);

        //ListView listView = findViewById(R.id.listview);

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MedicalAlarm.this,MediTime.class);//definign intent here this is from source activity to destination activity
                startActivity(intent);




            }
            /*public void onEditTextClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,MediTime.class); //definign intent here this is from source activity to destination activity
                startActivity(intent);
            }*/
        });


    }


    public void entryAlarm(){

    }
}
