package com.turorials.articfox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FragmentTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_test);

        Fragment_b obj = new Fragment_b();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,obj).commit();


    }
}