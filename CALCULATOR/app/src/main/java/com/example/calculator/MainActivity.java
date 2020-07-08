package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button text1,text2,text3,text4,text6,text7,text9,text10,text11,text13;
    Button add,sub,mult,clr,div,text;
    TextView num;
    int ans;

    float val1,val2;
    boolean add1,mult1,div1,sub1;

    private static boolean resultshown = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (Button) findViewById(R.id.text1);
        text2 = (Button) findViewById(R.id.text2);
        text3 = (Button) findViewById(R.id.text3);
        text4 = (Button) findViewById(R.id.text4);
        text6 = (Button)findViewById(R.id.text6);
        text7 = (Button) findViewById(R.id.text7);
        text9 = (Button) findViewById(R.id.text9);
        text10 = (Button) findViewById(R.id.text10);
        text11 = (Button) findViewById(R.id.text11);
        text = (Button)findViewById(R.id.text);
        text13 = (Button) findViewById(R.id.text13);
        div = (Button)findViewById(R.id.div);
        num = (TextView) findViewById(R.id.num);
        mult = (Button) findViewById(R.id.mult);
        clr = (Button)findViewById(R.id.clr);
        add = (Button)findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(text1.getText().toString());
                num.setText(Integer.toString(num1));
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(text2.getText().toString());
                num.setText(Integer.toString(num1));
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(text3.getText().toString());
                num.setText(Integer.toString(num1));
            }
        });
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(text4.getText().toString());
                num.setText(Integer.toString(num1));
            }
        });
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(text6.getText().toString());
                num.setText(Integer.toString(num1));
            }
        });
        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(text7.getText().toString());
                num.setText(Integer.toString(num1));
            }
        });
        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(text9.getText().toString());
                num.setText(Integer.toString(num1));
            }
        });
        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(text10.getText().toString());
                num.setText(Integer.toString(num1));
            }
        });
        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(text11.getText().toString());
                num.setText(Integer.toString(num1));
            }
        });
        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(text13.getText().toString());
                num.setText(Integer.toString(num1));
            }
        });

       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int val1 = Integer.parseInt(num.getText().toString());
               int val2 = Integer.parseInt(num.getText().toString());
               ans = val1 + val2;
               num.setText(Integer.toString(ans));
           }
       });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(num.getText().toString());
                int val2 = Integer.parseInt(num.getText().toString());
                ans = val1 - val2;
                num.setText(Integer.toString(ans));

            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(num.getText().toString());
                int val2 = Integer.parseInt(num.getText().toString());
                ans = val1 * val2;
                num.setText(Integer.toString(ans));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(num.getText().toString());
                int val2 = Integer.parseInt(num.getText().toString());
                ans = val1 / val2;
                num.setText(Integer.toString(ans));
            }
        });
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Float.parseFloat(num.getText() + "");
                if (add1 == true) {
                    num.setText(val1 + val2 + "");
                    add1 = false;
                }
                if (sub1 == true) {
                    num.setText(val1 - val2 + "");
                    sub1 = false;
                }
                if (mult1 == true) {
                    num.setText(val1 * val2 + "");
                    mult1 = false;
                }
                if (div1 == true) {
                    num.setText(val1 / val2 + "");
                    div1 = false;
                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText("");
//                num.setText(" ");
//                num.setText(" ");
            }
        });

    }
}
