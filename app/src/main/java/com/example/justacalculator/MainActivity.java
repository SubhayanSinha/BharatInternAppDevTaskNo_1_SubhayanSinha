package com.example.justacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.justacalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding ;
    int a , b ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater()) ;
        setContentView(binding.getRoot());

        binding.addition.setOnClickListener(this);
        binding.subtraction.setOnClickListener(this);
        binding.multiplication.setOnClickListener(this);
        binding.division.setOnClickListener(this);


    }

    public int getinput(EditText edt)
    {
        if(edt.getText().toString().equals(""))
        {
            return 0 ;
        }
        else
            return Integer.parseInt(edt.getText().toString()) ;
    }

    @Override
    public void onClick(View view) {
        a = getinput(binding.number1) ;
        b = getinput(binding.number2) ;

        int id = view.getId();
        if (id == R.id.addition) {
            binding.answer.setText("Answer is " + (a + b));
        } else if (id == R.id.subtraction) {
            binding.answer.setText("Answer is " + (a - b));
        } else if (id == R.id.multiplication) {
            binding.answer.setText("Answer is " + (a * b));
        } else if (id == R.id.division) {
            binding.answer.setText("Answer is " + (a / b));
        }

    }
}