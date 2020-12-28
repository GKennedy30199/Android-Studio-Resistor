package com.gavankennedy.resistorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView BandColor1,BandColor2,BandColor3,Result;
Button BandNum1,BandNum2,BandNum3,WhiteButton,BrownButton,RedButton,OrangeButton,YellowButton,GreenButton,BlueButton,VioletButton,GreyButton;
int currentBand=0;
int rValue=0;
//int rTempValue=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BandColor1=findViewById(R.id.BandColor1);
        BandColor2=findViewById(R.id.BandColor2);
        BandColor3=findViewById(R.id.BandColor3);
        Result=findViewById(R.id.Result);
    }
    public void Red(View view){

        if(currentBand==1)
        {
            rValue=2;
            BandColor1.setBackgroundColor(Color.RED);
            BandColor1.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.RED);
        }
        else if(currentBand==2)
        {

            rValue=rValue*10+2;
            BandColor2.setBackgroundColor(Color.RED);
            BandColor2.setVisibility(View.VISIBLE);
        }
        else if(currentBand==3)
        {

            rValue=rValue*100;
        }

    }
    public void White(View view){

        if(currentBand==1)
        {

            BandColor1.setBackgroundColor(Color.WHITE);
            BandColor1.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.WHITE);
        }
        else if(currentBand==2)
        {

            rValue=rValue*10+9;
            BandColor2.setBackgroundColor(Color.RED);
            BandColor2.setVisibility(View.VISIBLE);
        }
        else if(currentBand==3)
        {

            rValue=rValue*1000000000;
            BandColor3.setBackgroundColor(Color.WHITE);
            BandColor3.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.WHITE);
        }

    }
    public void Blue(View view){
        if(currentBand==1)
        {
            rValue=6;
            BandColor1.setBackgroundColor(Color.BLUE);
            BandColor1.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.BLUE);
        }
        else if(currentBand==2)
        {

            rValue=rValue*10+6;
            BandColor2.setBackgroundColor(Color.BLUE);
            BandColor2.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.BLUE);
        }
        else if(currentBand==3)
        {

            rValue=rValue*1000000;
            BandColor3.setBackgroundColor(Color.BLUE);
            BandColor3.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.BLUE);
        }

    }
    public void Green(View view){
        if(currentBand==1)
        {
            rValue=5;
            BandColor1.setBackgroundColor(Color.GREEN);
            BandColor1.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.GREEN);
        }
        else if(currentBand==2)
        {

            rValue=rValue*10+5;
            BandColor2.setBackgroundColor(Color.GREEN);
            BandColor2.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.GREEN);
        }
        else if(currentBand==3)
        {
            rValue=rValue*100000;
            BandColor3.setBackgroundColor(Color.GREEN);
            BandColor3.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.GREEN);
        }

    }
    public void Yellow(View view){
        if(currentBand==1)
        {
            rValue=4;
            BandColor1.setBackgroundColor(Color.YELLOW);
            BandColor1.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.YELLOW);
        }
        else if(currentBand==2)
        {

            rValue=rValue*10+4;
            BandColor2.setBackgroundColor(Color.YELLOW);
            BandColor2.setVisibility(View.VISIBLE);
            Result.setVisibility(View.VISIBLE);
        }
        else if(currentBand==3)
        {

            rValue=rValue*10000;
            BandColor3.setBackgroundColor(Color.YELLOW);
            BandColor3.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.YELLOW);
        }

    }
    public void Grey(View view){
        if(currentBand==1)
        {
            rValue=8;
            BandColor1.setBackgroundColor(Color.LTGRAY);
            BandColor1.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.LTGRAY);
        }
        else if(currentBand==2)
        {

            rValue=rValue*10+8;
            BandColor2.setBackgroundColor(Color.LTGRAY);
            BandColor2.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.LTGRAY);
        }
        else if(currentBand==3)
        {

            rValue=rValue*100000000;
            BandColor2.setBackgroundColor(Color.LTGRAY);
            BandColor2.setVisibility(View.VISIBLE);
            Result.setBackgroundColor(Color.LTGRAY);
        }

    }
    public void Band1(View view)
    {
        currentBand=1;
    }
    public void Band2(View view)
    {
        currentBand=2;
    }
    public void Band3(View view)
    {
        currentBand=3;
    }
    public void Calculate(View view)
    {
        Result.setText(String.valueOf(rValue) + "Ω");
    }
    public void ResetResult(View view){rValue=0;
    Result.setText(String.valueOf(rValue));
    BandColor1.setBackgroundColor(Color.WHITE);
    BandColor2.setBackgroundColor(Color.WHITE);
    BandColor3.setBackgroundColor(Color.WHITE);}
}