package com.olmo.proyecto3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button buttonVolver;
    Button buttonLogin;
    EditText user;
    EditText pass;
    EditText mail;
    String userName="";
    String emilio;
    String password;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);

        buttonVolver = (Button) findViewById(R.id.buttonVolver);
        buttonVolver.setOnClickListener(this);
        user = (EditText) findViewById(R.id.editTextName);
        pass = (EditText) findViewById(R.id.editTextPass);
        mail = (EditText) findViewById(R.id.editTextMail);



    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.buttonLogin:
                if(user.getText().toString().equals("olmo") && pass.getText().toString().equals("1234") && mail.getText().toString().equals("mail@mail.com")){
                    intent = new Intent(Login.this,
                            LoginSuccess.class);
                    intent.putExtra("nombre",user.getText().toString());

                }else{

                    intent = new Intent(Login.this,
                            Registro.class);

                }
                startActivity(intent);
                break;

            case R.id.buttonVolver:
                finish();
            break;
        }
    }







}
