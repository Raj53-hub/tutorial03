package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class welcome extends AppCompatActivity {

    TextView txtWelcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        txtWelcomeMessage = findViewById(R.id.txtWelcomeMessage);

        Intent intent = getIntent();
        String userdatavalue = intent.getStringExtra("userdata");
        txtWelcomeMessage.setText("Welcome " + userdatavalue);

        //Toast.makeText(this, userdatavalue, Toast.LENGTH_SHORT).show();

    }
}