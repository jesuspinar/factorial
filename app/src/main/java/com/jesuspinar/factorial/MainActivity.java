package com.jesuspinar.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText etInputNumber = findViewById(R.id.etInputNumber);
        TextView tvResult = findViewById(R.id.tvResult);

        button.setOnClickListener(v -> {
            long number;
            String numFact = etInputNumber.getText().toString();

            if (!numFact.equals("")){
                number = Long.parseLong(numFact);
                tvResult.setText(String.valueOf(factorial(number)));
            }
        });

    }

    public long factorial(long n) {
        long result = 1;
        if(n >= 0){
            for(int i = 1; i <= n; i++){
                result *= i;
            }
            if (result <= 0) {
                Toast.makeText(this, getString(R.string.numberNotValid), Toast.LENGTH_SHORT).show();
                return 0;
            }
            else{
                return result;
            }
        }
        else{
            Toast.makeText(this, getString(R.string.numberNotValid),Toast.LENGTH_SHORT).show();
            return 0;
        }
    }
}