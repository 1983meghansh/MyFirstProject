package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view){
        Log.i("Info" ,"Button pressed");
        EditText editText=(EditText) findViewById(R.id.editText);
        String amountInDollars=editText.getText().toString();
        double amountInDollarsDouble=Double.parseDouble(amountInDollars);
        double amountInRupees=amountInDollarsDouble*73.82;
        String amountInRupeesString=String.format("%.2f", amountInRupees);
        Log.i("Amount In Rupees",amountInRupeesString);
        Toast.makeText(this, "$"+ amountInDollars + " is Rs " + amountInRupeesString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}