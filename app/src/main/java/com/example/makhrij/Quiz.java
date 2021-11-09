package com.example.makhrij;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class Quiz extends AppCompatActivity {

    private Question [] questions;
    private Question [] quiz;
    private ScrollView scrollView;
    private TableLayout tbLayout;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        initialize();
        generateQuiz();
        loadQuiz();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  correctCount = 0;
                for (int i =0; i<5;i++){
                    RadioGroup rg = findViewById(i+103201);
                    RadioButton rb = findViewById(rg.getCheckedRadioButtonId());
//                    Log.d("STATE",rb.getText().toString());
                    Log.d("STATE",quiz[i].correct_option);
                    Log.d("STATE",rb.getText().toString());

                    if (quiz[i].correct_option.equals(rb.getText().toString())) {
                        correctCount++;
                        Log.d("STATE", "rb.getText().toString()");
                    }

                }
                tbLayout.removeAllViews();
                loadResult(correctCount);
            }
        });
    }
    private void loadResult(int count){
        TableRow tbRow = new TableRow(this);


        TextView tv0 = new TextView(this);

        tv0.setText("Corrected : " + String.valueOf(count));
        tv0.setTextSize(25);
        tv0.setTypeface(null, Typeface.BOLD);
        tbRow.addView(tv0);

        tbLayout.addView(tbRow);
        tbRow = new TableRow(this);


        tv0 = new TextView(this);

        tv0.setText("Wrong : " + String.valueOf(5-count));
        tv0.setTextSize(25);
        tv0.setTypeface(null, Typeface.BOLD);
        tbRow.addView(tv0);

        tbLayout.addView(tbRow);
    }
    private void initialize(){
        scrollView = findViewById(R.id.scroll1);
        tbLayout = findViewById(R.id.table1);

        questions = new Question[]{
                new Question("The letters أ is belong from which makharij","Halqiyah",new Options[]
                        {
                                new Options("Lahatiyah"),
                                new Options("Tarfiyah"),
                                new Options("Halqiyah"),

                        }),
                new Question("The letters ق is belong from which makharij","Lahatiyah",new Options[]
                        {
                                new Options("Lahatiyah"),
                                new Options("Tarfiyah"),
                                new Options("Niteeyah"),

                        }),
                new Question("The letters د is belong from which makharij","Niteeyah",new Options[]
                        {
                                new Options("Lahatiyah"),
                                new Options("Tarfiyah"),
                                new Options("Niteeyah"),

                        }),
                new Question("How many Makhārij (مخارج Emission) points\nare require to correctly read Quran?\n","17",new Options[]
                        {
                                new Options("17"),
                                new Options("21"),
                                new Options("19"),
                        }),
                new Question("The letters ل is belong from which makharij","Tarfiyah",new Options[]
                        {
                                new Options("Lahatiyah"),
                                new Options("Tarfiyah"),
                                new Options("Niteeyah"),

                        }),
                new Question("The letters د is belong from which makharij","Niteeyah",new Options[]
                        {
                                new Options("Lahatiyah"),
                                new Options("Tarfiyah"),
                                new Options("Niteeyah"),

                        }),
                new Question("Which letters when pronounced produce\na ‘whistling’ sound?\n","ز",new Options[]
                        {
                                new Options("ط"),
                                new Options("ز"),
                                new Options("ب"),
                        }),
        };
    }

    private void generateQuiz(){
        quiz = new Question[5];
        for(int i=0;i<5;i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 6 + 1);
            quiz[i] = questions[randomNum];
        }
    }
    private void createRadioButton(TableLayout tb, @NonNull Options[] options ,int id) {
        RadioButton[] rb = new RadioButton[options.length];
        RadioGroup rg = new RadioGroup(this);
        rg.setId(id+103201);
        TableRow tbRow = new TableRow(this);

        for(int i=0; i<options.length; i++){
            rb[i]  = new RadioButton(this);
            rb[i].setText(options[i].value);
            rb[i].setId(id+i*100 + 100);
            rg.addView(rb[i]);
            if (i==1) {
                tbRow.addView(rg);
                tb.addView(tbRow);
                tbRow = new TableRow(this);
            }

        }
        tb.addView(tbRow);

    }
    @SuppressLint("ResourceType")
    private void loadQuiz(){
        TextView tv;
        Button bt;
        TableRow tbRow;
        for(int i=0;i<5;i++) {
            tbRow = new TableRow(this);


            TextView tv0 = new TextView(this);
            int num = i+1;
            tv0.setText("Question # "+num);
            tv0.setTextSize(17);
            tv0.setTypeface(null, Typeface.BOLD);

            tbRow.addView(tv0);
            tbLayout.addView(tbRow);
            tbRow = new TableRow(this);


            TextView tv2 = new TextView(this);
            tv2.setText(quiz[i].statement);
            tv2.setTypeface(null, Typeface.BOLD);
            tv2.setTextSize(17);
            tbRow.addView(tv2);
            tbLayout.addView(tbRow);

            tbRow = new TableRow(this);
            createRadioButton(tbLayout ,quiz[i].options ,i );


            tbLayout.addView(tbRow);

        }

        submit = new Button(this);
        submit.setText("Submit");

        tbRow = new TableRow(this);
        tbRow.addView(submit);
        tbLayout.addView(tbRow);

    }





    class Options{
        public String value;

        Options ()
        {
        }
        Options(String val)
        {
            this.value=val;
        }


    }
    class Question {
        String statement;
        String correct_option;
        Boolean correct;
        Options[] options;

        Question(String st, String correct_option,Options[] options)
        {
            this.statement=st;
            this.correct_option=correct_option;
            this.options=options;
        }
    }
}