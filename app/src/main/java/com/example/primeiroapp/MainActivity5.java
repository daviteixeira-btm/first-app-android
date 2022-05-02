package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    Button bt_ir5_4;
    private static final String[] ESTADOS = new String[]{
            "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará",
            "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso",
            "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba",
            "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro",
            "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia",
            "Roraima", "Santa Catarina", "São Paulo", "Sergipe",
            "Tocantins", "Distrito Federal"
    };

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

        String[] estados = getResources().getStringArray(R.array.estados);

        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, estados);
        editText.setAdapter(adapter);
    }

}