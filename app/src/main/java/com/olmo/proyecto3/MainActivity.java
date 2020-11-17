package com.olmo.proyecto3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonLogin;
    Button buttonReg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienvenida);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        buttonReg = (Button) findViewById(R.id.buttonReg);

    }

    public void loginClick(View view) {
        Intent intent = new Intent(MainActivity.this, Login.class
        );
        startActivity(intent);

    }





    public void regClick(View view) {
        Intent intent = new Intent(MainActivity.this, Registro.class
        );
        startActivity(intent);

    }


}