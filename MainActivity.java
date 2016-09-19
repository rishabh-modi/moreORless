package com.example.rishabh.moreorless;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int randomNum;

    public void check(View view)
    {
        EditText et = (EditText)findViewById(R.id.guess);

        String guessstring = et.getText().toString();

        int guessint = Integer.parseInt(guessstring);

        String message = "";


        System.out.println(randomNum);



            if (guessint > randomNum)
                message = " entered value is more than my number . Try Again !";
            else if (guessint == randomNum) {
                message = "Hurray !! yoy have enters correct number . Congratulations ";
                Random randomNumber1 = new Random();

                randomNum = randomNumber1.nextInt(21);

            } else {
                message = " entered value is less than my number . Try Again !";
            }

            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();




    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random randomNumber = new Random();

        randomNum = randomNumber.nextInt(21);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
