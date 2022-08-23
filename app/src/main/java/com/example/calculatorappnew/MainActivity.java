package com.example.calculatorappnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Double inputOne;
    private Double inputTwo;
    private Double output;
    private String execute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zero(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + "0");
    }
    public void one(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + "1");
    }
    public void two(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + "2");
    }
    public void three(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + "3");
    }
    public void four(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + "4");
    }
    public void five(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + "5");
    }
    public void six(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + "6");
    }
    public void seven(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + "7");
    }
    public void eight(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + "8");
    }
    public void nine(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + "9");
    }
    public void dot(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText(num.getText() + ".");
    }



    public void clear(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText("");
    }

    public void add(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            inputOne = Double.parseDouble(String.valueOf(num.getText()));
        } else {
            inputOne = 0.0;
        }
        num.setText("");
        execute = "+";
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }
    public void calculate(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")){
            inputTwo = Double.parseDouble(String.valueOf(num.getText()));
            if(execute.equals("+")){
                output = inputOne+inputTwo;
                execute = "";
            }
        } else{
            output = 0.0;
        }
        num.setText("" + output);
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

}