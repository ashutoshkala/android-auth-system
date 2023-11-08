package com.example.authenticationsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class change_pass extends AppCompatActivity {
//    private FirebaseAuth auth;
    private FirebaseUser user;
    private EditText  signupPassword,signupPassword2;
    private Button signupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pass);
        signupPassword = findViewById(R.id.signup_password);
        signupPassword2 = findViewById(R.id.signup_password2);
        signupButton = findViewById(R.id.signup_btn);

        user = FirebaseAuth.getInstance().getCurrentUser();
        final String email = user.getEmail();
        signupButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String pass = signupPassword.getText().toString();
                String pass2 = signupPassword2.getText().toString();
                user.updatePassword(String.valueOf(pass));
                if(!pass.equals(pass2)){
                    signupPassword.setError("Password doesn't match");
                }
                Intent launchActivity1 = new Intent(change_pass.this, LogIn.class);
                startActivity(launchActivity1);


            }
        });

    }
}