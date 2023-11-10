package com.example.simple_interest_trial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button reset, calculate ;
    EditText principalAmount, time, rate;

    TextView simpleInterest;

    void result(){
        if (principalAmount.getText().toString().length()==0 || time.getText().toString().length()==0 || rate.getText().toString().length()==0){
            calculate.setEnabled(false);
        }
        double p_amount = Integer.parseInt(principalAmount.getText().toString());
        double years = Integer.parseInt(time.getText().toString());
        double rate_ = Integer.parseInt(rate.getText().toString());

        double final_ = (p_amount*years*rate_)/100;
        simpleInterest.setText(Double.toString(final_));
    }

    void clear(){
        principalAmount.setText("");
        time.setText("");
        rate.setText("");
        simpleInterest.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principalAmount = findViewById(R.id.principalAmount);
        time = findViewById(R.id.time);
        rate = findViewById(R.id.rate);

        reset = findViewById(R.id.reset);
        calculate = findViewById(R.id.calculate);

        simpleInterest = findViewById(R.id.simpleInterest);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
    }


}