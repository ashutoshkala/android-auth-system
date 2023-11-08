package com.example.authenticationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class success extends AppCompatActivity {
    private Button logout_btn ;
    private Button cpass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        logout_btn = findViewById(R.id.logout);
        logout_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent launchActivity1 = new Intent(success.this, MainActivity.class);
                startActivity(launchActivity1);


            }
        });
        cpass = findViewById(R.id.pass);
        cpass.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent launchActivity1 = new Intent(success.this, change_pass.class);
                startActivity(launchActivity1);


            }
        });
    }
}