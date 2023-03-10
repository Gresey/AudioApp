package com.example.countingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    public void onClickButton(View view) {
        Button button1 = (Button) view;
        /*short way is - give the tag name as the name from which the audio files are saved in raw
          like button 1 -tag="englishh......and then in main acitivity

          //method of mam//
         public void onClickButton(View view) {
        Button button1=(Button)view;
        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(button1.getTag().toString(),
                "raw", getPackageName()));
        mediaPlayer.start();
       }
    public void stop(View view) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }*/


        int buttonTapped = Integer.parseInt(button1.getTag().toString());
        switch (buttonTapped) {
            case 0:
                mediaPlayer = MediaPlayer.create(this, R.raw.englishh);
                mediaPlayer.start();
                break;
            case 1:
                mediaPlayer = MediaPlayer.create(this, R.raw.spanish);
                mediaPlayer.start();
                break;
            case 2:
                mediaPlayer = MediaPlayer.create(this, R.raw.french);
                mediaPlayer.start();
                break;
            case 3:
                mediaPlayer = MediaPlayer.create(this, R.raw.russian);
                mediaPlayer.start();
                break;
            case 4:
                mediaPlayer = MediaPlayer.create(this, R.raw.german);
                mediaPlayer.start();
                break;
            case 5:
                mediaPlayer = MediaPlayer.create(this, R.raw.chinese);
                mediaPlayer.start();
                break;

        }

    }
    public void stop(View view) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}