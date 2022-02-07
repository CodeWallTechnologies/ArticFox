package com.turorials.articfox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResultBack extends AppCompatActivity {

    EditText name1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_back);

        name1 = findViewById(R.id.name);

        button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name1.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please enter your name", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent();
                    intent.putExtra("name",name1.getText().toString());
                    setResult(RESULT_OK,intent);
                    finish();
                }
            }
        });






    }

    @Override
    public void onBackPressed() {

//        Toast.makeText(getApplicationContext(), "Something", Toast.LENGTH_SHORT).show();
        if(name1.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Please enter your name", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent();
            intent.putExtra("name",name1.getText().toString());
            setResult(RESULT_OK,intent);
            finish();
        }
    }
}