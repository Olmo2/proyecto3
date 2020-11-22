package com.olmo.proyecto3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity implements View.OnClickListener {
    EditText user;
    EditText dir;
    EditText pass;
    EditText mail;
    EditText cp;

    Button buttonVolver;
    Button buttonLogin;

    String userName;

    Context context;
    CharSequence text;
    int duration;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonVolver = (Button) findViewById(R.id.buttonVolverInicio);

        user = (EditText) findViewById(R.id.editTextPersonName);
        pass = (EditText) findViewById(R.id.editTextPassword);
        mail = (EditText) findViewById(R.id.editTextEmailAddress);
        dir = (EditText) findViewById(R.id.editTextDir);
        cp = (EditText) findViewById(R.id.editTextCp);

        buttonVolver.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);


        context = getApplicationContext();
        text = "Rellena todos los campos";
        duration = Toast.LENGTH_SHORT;


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLogin:
                if (user.getText().toString().equals("") || pass.getText().toString().equals("") || mail.getText().toString().equals("") || dir.getText().toString().equals("") || cp.getText().toString().equals("")) {
                    text = "Rellena todos los campos";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                    if (user.getText().toString().equals("")) {
                        text = "Nombre vacío";
                        toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    if (pass.getText().toString().equals("")) {
                        text = "Contraseña vacía";
                        toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    if (mail.getText().toString().equals("")) {
                        text = "E-mail vacío";
                        toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    if (dir.getText().toString().equals("")) {
                        text = "Dirección vacía";
                        toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    if (cp.getText().toString().equals("")) {
                        text = "Código Postal vacío";
                        toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                } else {
                    Intent intent = new Intent(Registro.this,
                            LoginSuccess.class);
                    //
                    // System.out.println(user.getText().toString());
                    userName = user.getText().toString();
                    intent.putExtra("nombre", userName);
                    startActivity(intent);
                }
                break;
            case R.id.buttonVolverInicio:
                finish();
                break;
        }
    }
}
