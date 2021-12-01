package com.example.medihelp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.timessquare.CalendarPickerView;

import java.util.Calendar;
import java.util.Date;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        Date today = new Date();
        Calendar nextDate = Calendar.getInstance();
        String string;
        nextDate.add(Calendar.YEAR, 1);
        // DatePicker datePicker = findViewById(R.id.calendarView);
        CalendarPickerView datePicker =findViewById(R.id.calendarView);
        datePicker.init(today, nextDate.getTime())
                .inMode(CalendarPickerView.SelectionMode.RANGE)
                .withSelectedDate(today);
        datePicker.getSelectedDates();





        datePicker.setOnDateSelectedListener(new CalendarPickerView.OnDateSelectedListener() {
            @Override
            public void onDateSelected(Date date) {
                Calendar calSelected = Calendar.getInstance();
                calSelected.setTime(date);
                String selectedDate = "" + calSelected.get(Calendar.DAY_OF_MONTH)
                        + " " + (calSelected.get(Calendar.MONTH) + 1)
                        + " " + calSelected.get(Calendar.YEAR);
            }

            @Override
            public void onDateUnselected(Date date) {

            }

        });

    }
}

