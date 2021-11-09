package com.example.makhrij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Halqiyah ,Lahatiyah,Shajariyah,Tarfiyah,Niteeyah,Lisaveyah,Ghunna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Halqiyah = (Button) findViewById(R.id.Halqiyah);
        Halqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent= new Intent(MainActivity.this, SecondActivity.class);
                newIntent.putExtra("buttonName","Halqiyah");
                startActivity(newIntent);
            }
        });
        Lahatiyah =(Button) findViewById(R.id.Lahatiyah);
        Lahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent= new Intent(MainActivity.this, SecondActivity.class);
                newIntent.putExtra("buttonName","Lahatiyah");
                startActivity(newIntent);

            }
        });
        Shajariyah =(Button) findViewById(R.id.Shajariyah);
        Shajariyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent= new Intent(MainActivity.this, SecondActivity.class);
                newIntent.putExtra("buttonName","Shajariyah");
                startActivity(newIntent);

            }
        });
        Tarfiyah =(Button) findViewById(R.id.Tarfiyah);
        Tarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent= new Intent(MainActivity.this, SecondActivity.class);
                newIntent.putExtra("buttonName","Tarfiyah");
                startActivity(newIntent);

            }
        });
        Niteeyah =(Button) findViewById(R.id.Niteeyah);
        Niteeyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent= new Intent(MainActivity.this, SecondActivity.class);
                newIntent.putExtra("buttonName","Niteeyah");
                startActivity(newIntent);

            }
        });
        Lisaveyah =(Button) findViewById(R.id.Lisaveyah);
        Lisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent= new Intent(MainActivity.this, SecondActivity.class);
                newIntent.putExtra("buttonName","Lisaveyah");
                startActivity(newIntent);

            }
        });
        Ghunna =(Button) findViewById(R.id.Ghunna);
        Ghunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent= new Intent(MainActivity.this, SecondActivity.class);
                newIntent.putExtra("buttonName","Ghunna");
                startActivity(newIntent);

            }
        });


    }
}