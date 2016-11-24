package com.example.jgy.calculator;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button b1, b2, b3, b4, b5, b6;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        t1 = (TextView) findViewById(R.id.textView1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Op('+');
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Op('-');
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Op('*');
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Op('/');
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Op('%');
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        Main2Activity.class); // 다음 넘어갈 클래스 지정
                startActivity(i);
            }
        });

    }



    void Op(char Op) {
        double num1 = Double.parseDouble(e1.getText().toString());
        double num2 = Double.parseDouble(e2.getText().toString());
        double result = 0;

        if (e1.getText().equals("") || e2.getText().equals("")) {
            Toast.makeText(getApplicationContext(), "값을 입력하여 주십시요", Toast.LENGTH_SHORT).show();
            return;

        } else {
            if (Op == '+') {
                result = num1 + num2;
            }
            if (Op == '-') {
                result = num1 - num2;
            }
            if (Op == '*') {
                result = num1 * num2;
            }
            if (Op == '/') {
                if (num2 == 0) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌수 없습니다.", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    result = num1 / num2;
                }
            }
            if (Op == '%') {
                result = num1 % num2;
            }

        }
        t1.setText("계산 결과 : " + result);
    }
}

