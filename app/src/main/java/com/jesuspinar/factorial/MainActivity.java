package com.jesuspinar.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static int factorial(int n) {
        int result = 1;
        if(n >= 0){
            for(int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
        }
        else{
            return result = -1;
        }
    }
}