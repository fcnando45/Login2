package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainSignUp extends AppCompatActivity {

    private EditText inputUser2;
    private EditText inputPass2;
    private Button BtnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sign_up);
        getSupportActionBar().hide();

       inputUser2 = (EditText) findViewById(R.id.inputUser2);
       inputPass2 = (EditText) findViewById(R.id.inputPass2);
       BtnSignup = findViewById(R.id.BtnSignup);

         BtnSignup.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                     if(inputUser2.getText().length() == 0) {
                         inputUser2.setError("Campo vazio");
                     }
                     if(inputPass2.getText().toString().isEmpty()) {
                         inputPass2.setError("Campo vazio");
                     }


             }
         });
    }
}