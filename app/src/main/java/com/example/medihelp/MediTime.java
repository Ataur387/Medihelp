package com.example.medihelp;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;

import static android.icu.util.Calendar.getInstance;

public class MediTime extends MedicalAlarm {
    CalendarActivity calendarActivity;

    public AlarmManager alarmManager;

    private Button save;
    private Button cancel;
    EditText alarmTime;
    TimePickerDialog timePickerDialog;
    private Object MediTime;
    DatePickerDialog datePickerDialog;
    DatePicker datePicker;
    Calendar calendar;
    int year;
    int month;
    int dayOfMonth;
    EditText pickdate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm);
        Toolbar toolbar = findViewById(R.id.toolbar);
        Toolbar alarmTitle =findViewById(R.id.alarmTitle);
        setSupportActionBar(alarmTitle);
        save= findViewById(R.id.savealarm);
        alarmTime= findViewById(R.id.alarmtime);
        EditText alarmName= findViewById(R.id.alarmName);
        String medicineName;
        medicineName= alarmName.getText().toString(); //getting the name of the medicine
        alarmName.setText(medicineName);

        pickdate= findViewById(R.id.pickdate);
        pickdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MediTime.this,CalendarActivity.class);
                startActivity(intent);
            }
        });










        alarmTime.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {

                //timepicker activity ,setting date

                Calendar calendar= getInstance();
                currentHour = calendar.get(Calendar.HOUR_OF_DAY);
                currentMinute= calendar.get(Calendar.MINUTE);
                final String[] amPm = {" "};



                timePickerDialog = new TimePickerDialog(MediTime.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {


                        if(hourOfDay>=12)
                        {
                            amPm[0] ="PM";
                            alarmTime.setText(String.format("%02d:%02d", hourOfDay-12, minutes) + " " + amPm[0]);


                        }
                        else {
                            amPm[0] = "AM";
                            alarmTime.setText(String.format("%02d:%02d", hourOfDay, minutes) + amPm[0]);

                        }

                    }
                },currentHour, currentMinute, false);
                timePickerDialog.show();








            }

        });






    }

    public void setSupportActionBar(Toolbar toolbar) {
    }

    private void saveAlarm()
    {



    }

}

