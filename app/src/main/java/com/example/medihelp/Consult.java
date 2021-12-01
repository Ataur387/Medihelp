package com.example.medihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Consult extends AppCompatActivity {


    TextView con1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        con1=(TextView)findViewById(R.id.consult);

        con1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Consult.this,Doctorlist.class);
                startActivity(intent);

            }
        });
    }
}
