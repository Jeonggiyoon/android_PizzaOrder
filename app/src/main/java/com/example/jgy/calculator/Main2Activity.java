package com.example.jgy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.jgy.calculator.R.id.rg1;

public class Main2Activity extends AppCompatActivity {
    LinearLayout  l1;
    CheckBox c1;
    RadioButton r1, r2, r3;
    Button b7;
    ImageView i1;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        l1 = (LinearLayout) findViewById(R.id.Linear1);
        c1 = (CheckBox)findViewById(R.id.checkBox1);
        r1 = (RadioButton)findViewById(R.id.radioButton1);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        b7 = (Button)findViewById(R.id.button7);
        i1 = (ImageView)findViewById(R.id.imageView1);
        rg = (RadioGroup)findViewById(R.id.rg1);

        l1.setVisibility(View.INVISIBLE);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1.setVisibility(View.VISIBLE);
            }
        });
    }
    public void onCheckedChanged(RadioGroup arg0, int arg1) {
        ImageView i1 = (ImageView) this.findViewById(R.id.image);
        switch (arg1) {
            case R.id.radioButton1:
                i1.setImageResource(R.drawable.a0);
                break;
            case R.id.radioButton2:
                i1.setImageResource(R.drawable.b0);
                break;
            case R.id.radioButton3:
                i1.setImageResource(R.drawable.c0);
                break;
        }
    }
}
