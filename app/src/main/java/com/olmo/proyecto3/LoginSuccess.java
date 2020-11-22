package com.olmo.proyecto3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginSuccess extends AppCompatActivity{

  TextView text;
    String nombre;
   // Intent intent=getIntent();
    Bundle extras;
    Button boton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_success);

        boton = (Button) findViewById(R.id.buttonVolverInicio);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Muerte");
                Intent i=new Intent(LoginSuccess.this, MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });
                text= (TextView) findViewById(R.id.textWelcome);
        if (savedInstanceState == null) {
             extras = getIntent().getExtras();
            if(extras == null) {
                nombre= null;
            } else {
                nombre= extras.getString("nombre");
            }
        } else {
            nombre= (String) savedInstanceState.getSerializable("nombre");
        }

        text.setText("Bienvenid@: " + nombre );
    }




}
