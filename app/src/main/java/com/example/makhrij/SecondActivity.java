package com.example.makhrij;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView heading , words, sound;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String BtnName = getIntent().getStringExtra("buttonName");
        if(BtnName.equals("Halqiyah"))
        {
            heading = (TextView) findViewById(R.id.heading);
            heading.setText("HALQIYAH");
            words = (TextView)findViewById(R.id.words);
            words.setText(new StringBuilder().append("       أ ہ").append("\n\n").append("       ع ح").append("\n\n").append("       غ خ").toString());
            sound=(TextView) findViewById(R.id.sound);
            sound.setText("End of Throat \n\nMiddle of Throat \n\nStart of the Throat");
            img = (ImageView) findViewById(R.id.imageView);
            img.setBackgroundResource(R.drawable.halaqiyah);

        }
        else if(BtnName.equals("Lahatiyah"))
        {
            heading = (TextView) findViewById(R.id.heading);
            heading.setText("LAHATIYAH");
            words = (TextView)findViewById(R.id.words);
            words.setText(new StringBuilder().append("         ق").append("\n\n\n").append("\n").append("\n").append("         ک").toString());
            sound=(TextView) findViewById(R.id.sound);
            sound.setText("Base of Tongue which is near Uvula touching the mouth roof \n\nPortion of Tongue near its base touching the roof of mouth");
            img = (ImageView) findViewById(R.id.imageView);
            img.setBackgroundResource(R.drawable.lahatiyah);


        }
        else if(BtnName.equals("Shajariyah"))
        {
            heading = (TextView) findViewById(R.id.heading);
            heading.setText("SHAJARIYAH-HAAFIYAH");
            words = (TextView)findViewById(R.id.words);
            words.setText(new StringBuilder().append("       ج ش ی ").append("\n\n").append("\n").append("         ض").toString());
            sound=(TextView) findViewById(R.id.sound);
            sound.setText("Tongue touching the center of the mouth roof \n\nOne side of the tongue touching the molar teeth");
            img = (ImageView) findViewById(R.id.imageView);
            img.setBackgroundResource(R.drawable.shajariyah);


        }
        else if(BtnName.equals("Tarfiyah"))
        {
            heading = (TextView) findViewById(R.id.heading);
            heading.setText("TARFIYAH");
            words = (TextView)findViewById(R.id.words);
            words.setText(new StringBuilder().append("           ل ").append("\n\n").append("\n").append("\n").append("         ن").append("\n\n\n\n").append("         ر").toString());
            sound=(TextView) findViewById(R.id.sound);
            sound.setText("Rounded tip of the tongue touching the base of the frontal 8 teeth\n\nRounded tip of the tongue touching the base of the frontal 6 teeth\n\nRounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth");
            img = (ImageView) findViewById(R.id.imageView);
            img.setBackgroundResource(R.drawable.tarfiyah);

        }
        else if(BtnName.equals("Niteeyah"))
        {
            heading = (TextView) findViewById(R.id.heading);
            heading.setText("NITEEYAH");
            words = (TextView)findViewById(R.id.words);
            words.setText(new StringBuilder().append("      ت د ط ").toString());
            sound=(TextView) findViewById(R.id.sound);
            sound.setText("Tip of the tongue touching the base of the front 2 teeth");
            img = (ImageView) findViewById(R.id.imageView);
            img.setBackgroundResource(R.drawable.niteeyah);
        }
        else if(BtnName.equals("Lisaveyah"))
        {
            heading = (TextView) findViewById(R.id.heading);
            heading.setText("LISAVEYAH");
            words = (TextView)findViewById(R.id.words);
            words.setText(new StringBuilder().append("    ظ  ذ  ث").append("\n\n").append("\n").append("\n").append("      ص ز س").toString());

            sound=(TextView) findViewById(R.id.sound);
            sound.setText("Tip of the tongue touching the tip of the frontal 2 teeth\n\nTip of the tongue comes between the front top and bottom teeth");
            img = (ImageView) findViewById(R.id.imageView);
            img.setBackgroundResource(R.drawable.lisaveyah);
        }
        else
        {
            heading = (TextView) findViewById(R.id.heading);
            heading.setText("GHUNNA");
            words = (TextView)findViewById(R.id.words);
            words.setText(new StringBuilder().append("          م ن ").toString());
            sound=(TextView) findViewById(R.id.sound);
            sound.setText("While pronouncing the ending sound of  م  or ن , bring the vibration to the nose");
            img = (ImageView) findViewById(R.id.imageView);
            img.setBackgroundResource(R.drawable.ghunna);
        }

    }


}