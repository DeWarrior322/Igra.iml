package com.example.igra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity
{
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
int start_x = 0;
int end_x = 0;


    @Override


        public boolean onTouchEvent(MotionEvent event) {

            switch (event.getAction()){
                case MotionEvent.ACTION_UP:
                    start_x = (int) event.getX();
                    break;
                case MotionEvent.ACTION_DOWN:
                    end_x= (int) event.getX();
                    break;
            }
            if (start_x != 0 && end_x != 0){
                if (start_x > end_x) {
                    setContentView(R.layout.activity_main);
                } else if (start_x < end_x){
                    setContentView(R.layout.activity_main);
                }
                start_x = 0;
                end_x = 0;
            }
            return false;
        }
    }



