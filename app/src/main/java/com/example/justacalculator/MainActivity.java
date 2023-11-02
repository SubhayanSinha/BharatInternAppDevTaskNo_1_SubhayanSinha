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
//        int a = Integer.parseInt(binding.number1.getText().toString()) ;
//        int b = Integer.parseInt(binding.number2.getText().toString()) ;
//        a = getinput(binding.number1) ;
//        b = getinput(binding.number2) ;

//        binding.addition.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int s = a + b ;
//                binding.answer.setText("Answer is "+ s);
//            }
//        });
//        binding.subtraction.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int s = a - b ;
//                binding.answer.setText("Answer is "+ s);
//            }
//        });
//        binding.multiplication.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int s = a * b ;
//                binding.answer.setText("Answer is "+ s);
//            }
//        });
//        binding.division.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int s = a / b ;
//                binding.answer.setText("Answer is "+ s);
//            }
//        });

//        View.OnClickListener buttonClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case binding.addition:
//                        // Handle button 1 click
//                        break;
//                    case R.id.subtraction:
//                        // Handle button 2 click
//                        break;
//                    case R.id.multiplication:
//                        // Handle button 3 click
//                        break;
//                    case R.id.division:
//                        // Handle button 4 click
//                        break;
//                }
//            }
//        };

        // Assign the common OnClickListener to all buttons
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