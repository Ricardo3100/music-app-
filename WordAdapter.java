package com.example.ricardo.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter <Word> {


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param words   A List of AndroidFlavor objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList <Word> words) {

        super(context, 0, words);
    }

    /**
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentword = getItem(position);

        TextView MartistTextView = (TextView) listItemView.findViewById(R.id.martist);
        MartistTextView.setText(currentword.getartist());

        TextView mMusicTextView = (TextView) listItemView.findViewById(R.id.mmusic);
        mMusicTextView.setText(currentword.getmusic());


        return listItemView;
    }

}