package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    Button bt_ir5_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        bt_ir5_4 = findViewById(R.id.bt_ir5_4);

        bt_ir5_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(i);
            }
        });

        final Button b1 = (Button) findViewById(R.id.btnOk);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                final TextView lbl = (TextView) findViewById(R.id.lblResultado);
                final EditText txtNome = (EditText) findViewById(R.id.txtNome);
                String nome = txtNome.getText().toString();

                lbl.setText("Olá " + nome + " tudo bem?");
            }
        });


    }


}