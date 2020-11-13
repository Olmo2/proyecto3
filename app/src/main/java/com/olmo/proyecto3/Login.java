package com.olmo.proyecto3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    Button buttonVolver;
    Button buttonLogin;
    EditText user;
    EditText pass;
    EditText mail;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonVolver = (Button) findViewById(R.id.buttonLogin);
        user = (EditText) findViewById(R.id.editTextName);
        pass = (EditText) findViewById(R.id.editTextPass);
        mail = (EditText) findViewById(R.id.editTextMail);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user !=null && pass!=null &&mail!=null){
                     intent = new Intent(Login.this,
                            LoginSuccess.class);
                    startActivity(intent);
                }else{
                    intent = new Intent(Login.this,
                            Registro.class);
                    intent.putExtra("nombre",user.getText());
                }

                startActivity(intent);
            }
        });

        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }



}
