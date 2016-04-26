package com.example.sung.a5longestenglishwords;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by sung on 4/25/16.
 */
public class ant_Frag extends Fragment {
    FragmentManager fragment;
    MediaPlayer media = null;
    ImageButton sound=null;
    public ant_Frag() {


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.antfraglayout, container, false);;
        media=MediaPlayer.create(inflater.getContext(),R.raw.ant);
        sound=(ImageButton)view.findViewById(R.id.sound_btn);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media.start();
            }
        });

        return view;
    }

}
