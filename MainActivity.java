package com.framebush.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText slut1;
    EditText slut2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slut1      = findViewById(R.id.number1Text);
        slut2      = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);

    }
    
    public void toplama(View view){

        if(slut1.getText().toString().matches("") || slut2.getText().toString().matches("")){
            resultText.setText("mal asdasd");
        }

        else {
            int number1 = Integer.parseInt(slut1.getText().toString());
            int number2 = Integer.parseInt(slut2.getText().toString());

            int result = number1 + number2;
            resultText.setText("Result: "+result);
        }
    }

    public void cikartma(View view){

        if(slut1.getText().toString().matches("") || slut2.getText().toString().matches("")){
            resultText.setText("mal asdasd");
        }

        else {
            int number1 = Integer.parseInt(slut1.getText().toString());
            int number2 = Integer.parseInt(slut2.getText().toString());

            int result = number1 - number2;
            resultText.setText("Result: "+result);
        }
    }

    public void carpma(View view){

        if(slut1.getText().toString().matches("") || slut2.getText().toString().matches("")){
            resultText.setText("mal asdasd");
        }

        else {
            int number1 = Integer.parseInt(slut1.getText().toString());
            int number2 = Integer.parseInt(slut2.getText().toString());

            int result = number1 * number2;
            resultText.setText("Result: "+result);
        }
    }

    public void bolme(View view){

        if(slut1.getText().toString().matches("") || slut2.getText().toString().matches("")){
            resultText.setText("mal asdasd");
        }

        else {
            int number1 = Integer.parseInt(slut1.getText().toString());
            int number2 = Integer.parseInt(slut2.getText().toString());

            int result = number1 / number2;
            resultText.setText("Result: "+result);
        }
    }
}