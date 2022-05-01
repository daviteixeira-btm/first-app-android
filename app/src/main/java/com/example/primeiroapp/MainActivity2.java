package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    MediaPlayer music;

    Button bt_ir2_1;
    Button bt_ir2_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        music = MediaPlayer.create(this, R.raw.music);

        bt_ir2_1 = findViewById(R.id.bt_ir2_1);
        bt_ir2_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });

        bt_ir2_3 = findViewById(R.id.bt_ir2_3);
        bt_ir2_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(i);
            }
        });
    }

    // Plaing the music
    public void musicplay(View v){
        music.start();
    }

    // Pausing the music
    public void musicpause(View v){
        music.pause();
    }

    // Stoping the music
    public void musicstop(View v){
        music.stop();
        music = MediaPlayer.create(this, R.raw.music);
    }


}