package com.example.jgy.calculator;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main4Activity extends AppCompatActivity {

    TextView  t4, t5, t6;
    EditText e1, e2, e3;
    CheckBox c1;
    RadioGroup rg;
    RadioButton r1, r2;
    Button b1;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);

        t4 = (TextView) findViewById(R.id.textView4);
        t5 = (TextView) findViewById(R.id.textView5);
        t6 = (TextView) findViewById(R.id.textView6);

        c1 = (CheckBox) findViewById(R.id.checkBox1);

        rg = (RadioGroup) findViewById(R.id.radioGroup);

        r1 = (RadioButton) findViewById( R.id.radioButton1);
        r2 = (RadioButton) findViewById( R.id.radioButton2);

        b1 = (Button) findViewById(R.id.button1);

        i1 = (ImageView) findViewById(R.id.imageView1);


        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    i1.setImageResource(R.drawable.h0);
                    String choice = "피클을";
                    t6.setText(choice + " 선택하였습니다. ");
                }
            }
        });

        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    i1.setImageResource(R.drawable.i0);
                    String choice = "소스를";
                    t6.setText(choice + " 선택하였습니다. ");
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double piz = Double.parseDouble(e1.getText().toString());
                double spa = Double.parseDouble(e2.getText().toString());
                double sal = Double.parseDouble(e3.getText().toString());
                double order = piz +spa + sal;

                t4.setText("주문개수 : " + order);

                if (c1.isChecked()) {
                    t5.setText("주문금액 : " + ((piz * 16000) + (spa*11000) + (sal*4000))*0.07);
                }
                else
                {
                    t5.setText("주문금액 : " + ((piz * 16000) + (spa*11000) + (sal*4000)) + "원");
                }

                String choice = "피클을";
                if (r2.isChecked()) choice = "소스를";

                t6.setText(choice + "선택하셨습니다. ");

            }
        });

    }
}
