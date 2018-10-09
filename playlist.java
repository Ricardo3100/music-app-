package com.example.ricardo.musicapp;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
public class playlist extends AppCompatActivity  {
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.playlist);
            ArrayList<Word> words = new ArrayList<>();
            for (int index = 0; index < words.size(); index++)
                words.add(new Word("Lotus Juice", "Burn My Dread"));
            words.add(new Word("Green Day", "Boulevard of Broken Dreams"));
            words.add(new Word("Selena", "Bamam"));
            words.add(new Word("Blue", "Feeling Blue"));
            words.add(new Word("Evan Esance", "Jazz"));
            words.add(new Word("Flow", "Colors"));
            WordAdapter Adapter = new WordAdapter(this, words);
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(Adapter);
        }

}