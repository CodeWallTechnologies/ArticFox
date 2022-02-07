package com.turorials.articfox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.turorials.articfox.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash_screen);

      ActivitySplashScreenBinding activitySplashScreenBinding =
        DataBindingUtil.setContentView(this,R.layout.activity_splash_screen);
      activitySplashScreenBinding.setMyVariable("Hello DataBinding...");


//        ActivitySplashScreenBinding activitySplashScreenBinding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
//        setContentView(activitySplashScreenBinding.getRoot());





      TextView  textView = findViewById(R.id.textViewsp);

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },500   );


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(SplashScreen.this,
//                        MainActivity.class);
//                startActivity(intent);
//            }
//        },500);
    }



}