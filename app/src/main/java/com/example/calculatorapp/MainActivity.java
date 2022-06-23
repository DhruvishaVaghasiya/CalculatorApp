package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1Num,btn2Num,btnPluse,btnAns,btnDiv,btnMulti,btnMin;
   Button btn3Num,btn4Num,btn5Num,btn6Num,btn7Num,btn8Num,btn9Num,btn0Num,btnPoint,getBtn0Num;
    EditText edtView;

    int num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    public void initview()
    {
        btn1Num=findViewById(R.id.btn1Num);
        btn2Num=findViewById(R.id.btn2Num);
        btnAns=findViewById(R.id.btnAns);
        btnPluse=findViewById(R.id.btnPluse);
        btnDiv=findViewById(R.id.btnDiv);
        btnMulti=findViewById(R.id.btnMulti);
        btnMin=findViewById(R.id.btnMin);

        edtView=findViewById(R.id.edtView);


       btn3Num=findViewById(R.id.btn3Num);
        btn4Num=findViewById(R.id.btn4Num);
        btn5Num=findViewById(R.id.btn5Num);
        btn6Num=findViewById(R.id.btn6Num);
        btn7Num=findViewById(R.id.btn7Num);
        btn8Num=findViewById(R.id.btn8Num);
        btn9Num=findViewById(R.id.btn9Num);
        btn0Num=findViewById(R.id.btn0Num);
       btnPoint=findViewById(R.id.btnPoint);


        btn1Num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtView.setText("1");
            }
        });

        btnPluse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  num1= Integer.parseInt(edtView.getText().toString());
              //  edtView.setText("");
            }
        });
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  num1= Integer.parseInt(edtView.getText().toString());
               //  edtView.setText("");
            }
        });
        btn2Num.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            edtView.setText("2");
        }
        });
        btnAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2= Integer.parseInt(edtView.getText().toString());
                edtView.setText("");
                result=num1/num2;
                Log.e("RelativeAnser", "onClick:RESULT="+result);
                //Toast.makeText(MainActivity.this, "THIS IS RESULT="+result, Toast.LENGTH_SHORT).show();
            }
        });










        btn3Num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num3=3;

            }
        });

        btn4Num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num4=4;

            }
        });

        btn5Num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num5=5;

            }
        });

        btn6Num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    num6=6;

            }
        });

        btn7Num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num7=7;

            }
        });

        btn8Num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num8=8;

            }
        });

        btn9Num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num9=9;

            }
        });

        btn0Num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num0=0;

            }
        });





        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // num1= Integer.parseInt(edtView.getText().toString());
                // edtView.setText("");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= Integer.parseInt(edtView.getText().toString());
                edtView.setText("");
            }
        });


    }
}