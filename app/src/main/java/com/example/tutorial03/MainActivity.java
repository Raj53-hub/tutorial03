package com.example.tutorial03;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername;
    EditText edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valUsername = edtUsername.getText().toString();
                String valPassword = edtPassword.getText().toString();
                Log.i("LoginScreen","In onClick");

                if(Patterns.EMAIL_ADDRESS.matcher(valUsername).matches()){
                    Toast.makeText(MainActivity.this, "Email format is not proper", Toast.LENGTH_SHORT).show();

                }

                if(valUsername.equals("admin@gmail.com") && valPassword.equals("123456")){
                    Log.i("LoginScreen", "In onClick If");

                    Intent intent = new Intent(MainActivity.this, welcome.class);
                    intent.putExtra("userdata",valUsername);
                    startActivity(intent);
                    finish();

                    Toast.makeText(MainActivity.this, "Login Successfully ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Wrong Username or Password", Toast.LENGTH_SHORT).show();
                    Log.i("LoginScreen","In onClick else");
                }

            }
        });

    }

}