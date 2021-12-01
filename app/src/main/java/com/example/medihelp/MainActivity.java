package com.example.medihelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.medihelp.R;

public class MainActivity extends AppCompatActivity {

    EditText email,password,not_register;
    Button login,register;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        not_register = findViewById(R.id.notregister);
        db = new DatabaseHelper(this);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = email.getText().toString();
                String pass = password.getText().toString();
                boolean res = db.findpassword(user,pass);
                if(res == true)
                {
                    //Toast.makeText(MainActivity.this,"Ascheeeeeeeeeeeeeeeeeeeeee",Toast.LENGTH_LONG).show();
                    Intent it = new Intent(MainActivity.this, Homepage.class);
                    startActivity(it);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"You have inserted wrong email or password",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}