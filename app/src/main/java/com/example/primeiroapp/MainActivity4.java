package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity4 extends AppCompatActivity {

    Button bt_ir4_3;
    Button bt_ir4_5;

    ToggleButton toogleButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        toogleButton = findViewById(R.id.toggle);
        imageView = findViewById(R.id.imageView);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));

        toogleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toogleButton.isChecked()){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_on));
                }else{
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
                }
            }
        });

        bt_ir4_3 = findViewById(R.id.bt_ir4_3);

        bt_ir4_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(i);
            }
        });

        bt_ir4_5 = findViewById(R.id.bt_ir4_5);

        bt_ir4_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(i);
            }
        });
    }
}