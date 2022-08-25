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
    public void pos_neg(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(num.getText().toString().equals("")) {
            num.setText("0.0");
        }else {
            if (Double.parseDouble(String.valueOf(num.getText())) > 0) {
                num.setText("-" + num.getText());
            } else {
                num.setText(num.getText().toString().substring(1));
            }
        }
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

    public void subtract(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            inputOne = Double.parseDouble(String.valueOf(num.getText()));
        } else {
            inputOne = 0.0;
        }
        num.setText("");
        execute = "-";
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void multiply(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            inputOne = Double.parseDouble(String.valueOf(num.getText()));
        } else {
            inputOne = 0.0;
        }
        num.setText("");
        execute = "*";
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void divide(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            inputOne = Double.parseDouble(String.valueOf(num.getText()));
        } else {
            inputOne = 0.0;
        }
        num.setText("");
        execute = "/";
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void square(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            inputOne = Double.parseDouble(String.valueOf(num.getText()));
        } else {
            inputOne = 0.0;
        }
        num.setText("");
        execute = "^";
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void squareRoot(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            inputOne = Double.parseDouble(String.valueOf(num.getText()));
        } else {
            inputOne = 0.0;
        }
        num.setText("√" + inputOne);
        execute = "sqrt";
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void factorial(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            inputOne = Double.parseDouble(String.valueOf(num.getText()));
        } else {
            inputOne = 0.0;
        }
        num.setText(inputOne + "!");
        execute = "fac";
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void percent(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            num.setText(""+Double.parseDouble(String.valueOf(num.getText()))/100);
        } else {
            inputOne = 0.0;
        }
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void pi(View view){
        EditText num = (EditText) findViewById(R.id.input);
        num.setText("" + Math.PI);
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void cos(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            inputOne = Double.parseDouble(String.valueOf(num.getText()));
        } else {
            inputOne = 0.0;
        }
        num.setText(""+inputOne);
        execute = "cos";
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void sin(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            inputOne = Double.parseDouble(String.valueOf(num.getText()));
        } else {
            inputOne = 0.0;
        }
        num.setText(""+inputOne);
        execute = "sin";
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void tan(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")) {
            inputOne = Double.parseDouble(String.valueOf(num.getText()));
        } else {
            inputOne = 0.0;
        }
        num.setText(""+inputOne);
        execute = "tan";
        System.out.println("Num 1: " + inputOne);
        System.out.println("Num 2: " + inputTwo);
    }

    public void calculate(View view){
        EditText num = (EditText) findViewById(R.id.input);
        if(!num.getText().toString().equals("")){
            if(!execute.equals("sqrt") && !execute.equals("fac") && !execute.equals("cos") && !execute.equals("tan") && !execute.equals("sin")){
                inputTwo = Double.parseDouble(String.valueOf(num.getText()));
            }

            if(execute.equals("+")){
                output = inputOne+inputTwo;
                execute = "";
            } else if(execute.equals("-")){
                output = inputOne-inputTwo;
                execute = "";
            } else if(execute.equals("*")){
                output = inputOne*inputTwo;
                execute = "";
            } else if(execute.equals("/")){
                output = inputOne/inputTwo;
                execute = "";
            } else if(execute.equals("^")){
                output = Math.pow(inputOne,inputTwo);
                execute = "";
            } else if(execute.equals("sqrt")){
                output = Math.sqrt(inputOne);
                execute = "";
            } else if(execute.equals("fac")){
                output = 1.0;
                while (inputOne > 0){
                    output *= inputOne;
                    inputOne--;
                }
                execute = "";
            } else if(execute.equals("cos")){
                output = Math.cos(inputOne);
                execute = "";
            } else if(execute.equals("sin")){
                output = Math.sin(inputOne);
                execute = "";
            } else if(execute.equals("tan")){
                output = Math.tan(inputOne);
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