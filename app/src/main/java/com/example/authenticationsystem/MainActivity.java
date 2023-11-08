package com.example.authenticationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button login_btn ;
    private Button signup_btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_btn = findViewById(R.id.login);
        signup_btn=findViewById(R.id.signup);

        login_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent launchActivity1 = new Intent(MainActivity.this, LogIn.class);
                startActivity(launchActivity1);


            }
        });
        signup_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent launchActivity1 = new Intent(MainActivity.this, signup.class);
                startActivity(launchActivity1);


            }
        });
    }

}