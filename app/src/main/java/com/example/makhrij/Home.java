package com.example.makhrij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button repo,practice,quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        repo = (Button)findViewById(R.id.repo);
        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/noorxhk/makhrijNew");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });


        practice=(Button) findViewById(R.id.practice);
        practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent= new Intent(Home.this, MainActivity.class);
                startActivity(newIntent);
            }
        });
        quiz=(Button)  findViewById(R.id.quiz);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent= new Intent(Home.this, Quiz.class);
                startActivity(newIntent);
            }
        });
    }
}