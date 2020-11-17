package com.olmo.proyecto3;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity implements View.OnClickListener{
    EditText user;
    Button buttonVolver;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        buttonLogin = (Button) findViewById(R.id.button);
        buttonVolver = (Button) findViewById(R.id.button2);

         user= (EditText) findViewById(R.id.editTextPersonName);

        buttonVolver.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.button:
            Intent intent = new Intent(Registro.this,
                    LoginSuccess.class);
            System.out.println(user.getText().toString());
            intent.putExtra("nombre",user.getText().toString());
            startActivity(intent);

            break;
        case R.id.button2:
            finish();
            break;
    }
    }
}
