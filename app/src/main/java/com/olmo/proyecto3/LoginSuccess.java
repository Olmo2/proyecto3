package com.olmo.proyecto3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginSuccess extends AppCompatActivity {

  // TextView text;

    Intent intent=getIntent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_success);
      //  String nombre= intent.getStringExtra("nombre");
       // System.out.println(nombre);
       // text= (TextView) findViewById(R.id.textWelcome);
        //text.setText("Bienvenid@: " + nombre );




    }


}
