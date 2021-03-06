package com.example.jgy.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.jgy.calculator.R.id.imageView;
import static com.example.jgy.calculator.R.id.rg1;

public class Main2Activity extends AppCompatActivity {
    LinearLayout l1;
    CheckBox c1;
    RadioButton r1, r2, r3;
    Button b7, b8;
    ImageView i1;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        l1 = (LinearLayout) findViewById(R.id.Linear1);
        c1 = (CheckBox) findViewById(R.id.checkBox1);
        r1 = (RadioButton) findViewById(R.id.radioButton1);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        i1 = (ImageView) findViewById(R.id.imageView1);
        rg = (RadioGroup) findViewById(R.id.rg1);

        l1.setVisibility(View.INVISIBLE);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1.setVisibility(View.VISIBLE);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        Main3Activity.class); // 다음 넘어갈 클래스 지정
                startActivity(i);
            }
        });

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) i1.setImageResource(R.drawable.a0);
            }
        });

        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) i1.setImageResource(R.drawable.b0);
            }
        });

        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) i1.setImageResource(R.drawable.c0);
            }
        });
    }
}
