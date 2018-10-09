package com.example.ricardo.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button playsong = (Button) findViewById(R.id.playlist);
        playsong.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, playlist.class);
        startActivity(intent);

    }

}

