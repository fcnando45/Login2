package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TextSignup;
    private EditText inputUser;
    private EditText inputPass;
    private Button BtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        inputUser = (EditText) findViewById(R.id.InputUser);
        inputPass = (EditText) findViewById(R.id.InputPass);
        BtnLogin = findViewById(R.id.BtnLogin);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(inputUser.getText().length() == 0) {
                        inputUser.setError("Campo vazio");
                    }
                    if(inputPass.getText().toString().isEmpty()) {
                        inputPass.setError("Campo vazio");
                    }

            }
        });

        TextSignup = findViewById(R.id.TextSignup);
        TextSignup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent = new Intent(MainActivity.this, MainSignUp.class);
               startActivity(intent);

           }


       });

    }

}
