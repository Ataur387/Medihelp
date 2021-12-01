package com.example.medihelp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BMI extends AppCompatActivity {

    //BMI bmi=new BMI();

    EditText weight,height,age;
    CheckBox male,female;
    Button bmibtn;
    TextView bmival,verdict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);


        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        age = findViewById(R.id.age);
        bmibtn = findViewById(R.id.bmibtn);
        bmival = findViewById(R.id.bmival);
        verdict = findViewById(R.id.verdict);
        female = findViewById(R.id.female);
        male = findViewById(R.id.male);

        bmibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(weight.getText().toString().equals("")|height.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"No Valid Values",Toast.LENGTH_LONG);
                }
                else{
                    Double w, h, b;
                    String msg;
                    w = Double.parseDouble(weight.getText().toString());
                    h = Double.parseDouble(height.getText().toString());
                    h = h / 100;
                    b = w / (h * h);
                    bmival.setText(String.valueOf(b));
                    if (b < 18.5) msg = "Underweight";
                    else if (b >= 18.5 & b <= 25) msg = "Normal";
                    else msg = "Overweight";
                    verdict.setText(msg);
                }
            }
        });

    }
}
