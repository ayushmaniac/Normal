package com.norm.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setupNetworkCall(email, password);
            }
        });


    }

    private void setupNetworkCall(EditText email, EditText password) {

        String emailString = email.getText().toString().trim();
        String passwrdString = password.getText().toString().trim();
        Toast.makeText(this, passwrdString, Toast.LENGTH_SHORT).show();
    }

}