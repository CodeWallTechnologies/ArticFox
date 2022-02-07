package com.turorials.articfox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fruit extends AppCompatActivity {

 private Button call,without,intentBtn;
 final int RESULT_BACK = 11;
 private TextView result;
 String resultName = "";
 private Button btnFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        result = findViewById(R.id.showResult);


        call = findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:09455129916"));
                startActivity(intent);

            }
        });

        without = findViewById(R.id.without);
        without.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });



        intentBtn = findViewById(R.id.intent);
        intentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fruit.this,ResultBack.class);
//                startActivityForResult(intent,RESULT_BACK);

            }
        });



        btnFragment = findViewById(R.id.fragment);
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fruit.this,FragmentTest.class);
                startActivity(intent);
            }
        });



    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode == RESULT_BACK){
            if(resultCode == RESULT_OK){

                resultName = data.getStringExtra("name");
               result.setText(resultName);
            }
        }
    }
}