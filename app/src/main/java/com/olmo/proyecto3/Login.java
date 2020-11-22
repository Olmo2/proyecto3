package com.olmo.proyecto3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button buttonVolver;
    Button buttonLogin;
    EditText user;
    EditText pass;
    EditText mail;
    String userName="";
    Intent intent;

    Context context;
    CharSequence text;
    int duration;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);

        buttonVolver = (Button) findViewById(R.id.buttonVolverInicio);
        buttonVolver.setOnClickListener(this);
        user = (EditText) findViewById(R.id.editTextName);
        pass = (EditText) findViewById(R.id.editTextPass);
        mail = (EditText) findViewById(R.id.editTextMail);

        context = getApplicationContext();
        text = "Rellena todos los campos";
        duration = Toast.LENGTH_SHORT;


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.buttonLogin:
                if(user.getText().toString().equals("")||pass.getText().toString().equals("")||mail.getText().toString().equals("")){
                    text = "Rellena todos los campos";
                     toast = Toast.makeText(context, text, duration);
                    toast.show();

                    if(user.getText().toString().equals("")){
                        text="Nombre vacío";
                        toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    if(pass.getText().toString().equals("")){
                        text="Contraseña vacía";
                        toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    if(mail.getText().toString().equals("")){
                        text="E-mail vacío";
                        toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }else {
                    if (user.getText().toString().equals("olmo") && pass.getText().toString().equals("1234") && mail.getText().toString().equals("mail@mail.com")) {
                        intent = new Intent(Login.this,
                                LoginSuccess.class);
                        userName = user.getText().toString();
                        intent.putExtra("nombre", userName);

                    } else {

                        text = "Usuario incorrecto, redirección a registro";
                        toast = Toast.makeText(context, text, duration);
                        toast.show();
                        intent = new Intent(Login.this,
                                Registro.class);

                    }
                    startActivity(intent);
                }
                break;

            case R.id.buttonVolverInicio:
                finish();
            break;
        }
    }







}
