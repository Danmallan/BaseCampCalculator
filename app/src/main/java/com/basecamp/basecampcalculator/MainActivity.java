package com.basecamp.basecampcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button0,button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonMul, buttonDiv,
            buttonClear, buttonDot, buttonEqual;


    private TextView tvResult;

    private boolean Addition, Subtraction, Multiplication,Division, decimal;

    private double input1 = 0, input2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.btnZero);
        button1 = findViewById(R.id.btnOne);
        button2 = findViewById(R.id.btnTwo);
        button3 = findViewById(R.id.btnThree);
        button4 = findViewById(R.id.btnFour);
        button5 = findViewById(R.id.btnFive);
        button6 = findViewById(R.id.btnSix);
        button7 = findViewById(R.id.btnSeven);
        button8 = findViewById(R.id.btnEight);
        button9 = findViewById(R.id.btnNine);
        buttonDot = findViewById(R.id.btnDot);
        buttonAdd = findViewById(R.id.btnPlus);
        buttonSub = findViewById(R.id.btnMinus);
        buttonMul = findViewById(R.id.btnMultiply);
        buttonDiv = findViewById(R.id.btnDivide);
        buttonClear = findViewById(R.id.btnClear);
        buttonEqual = findViewById(R.id.btnEqual);

        tvResult = findViewById(R.id.tvResult);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText().length() != 0){
                    input1 = Float.parseFloat(tvResult.getText() + "");
                    Addition = true;
                    decimal = false;
                    tvResult.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText().length() != 0){
                    input1 = Float.parseFloat(tvResult.getText() + "");
                    Subtraction = true;
                    decimal = false;
                    tvResult.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText().length() != 0){
                    input1 = Float.parseFloat(tvResult.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    tvResult.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText().length() != 0){
                    input1 = Float.parseFloat(tvResult.getText() + "");
                    Division = true;
                    decimal = false;
                    tvResult.setText(null);
                }
            }
        });


        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Addition || Subtraction || Multiplication || Division) {
                    input2 = Float.parseFloat(tvResult.getText() + "");
                }

                if(Addition) {
                    tvResult.setText(String.valueOf(input1 + input2));
                    Addition = false;
                }

                if(Subtraction) {
                    tvResult.setText(String.valueOf(input1 - input2));
                    Subtraction = false;
                }
                if(Multiplication) {
                    tvResult.setText(String.valueOf(input1 * input2 + ""));
                    Multiplication = false;
                }
                if(Division) {
                    tvResult.setText(String.valueOf(input1 / input2 + ""));
                    Division = false;
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });


        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decimal){
                    // do nothing or you can show the error
                }else{
                    tvResult.setText(tvResult.getText() + ".");
                    decimal = true;
                }
            }
        });

    }
}