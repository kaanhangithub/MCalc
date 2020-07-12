package com.example.mcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }

    public void buttonClicked(View v){

        EditText principleView = (EditText) findViewById(R.id.prin);
        String pS = principleView.getText().toString();
        EditText amortizationView = (EditText) findViewById(R.id.amor);
        String aS = amortizationView.getText().toString();
        EditText interestView = (EditText) findViewById(R.id.inte);
        String iS = interestView.getText().toString();


        MortgageModel obj = new MortgageModel(pS,aS,iS);

        ((TextView)findViewById(R.id.answer)).setText(obj.computePayment());










    }

}
