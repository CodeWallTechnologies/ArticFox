package com.turorials.articfox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hello World");
        builder.setMessage("Are you sure do you want to quit?");
//        builder.setCancelable(true);
//
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

//        new DialogFragment3().show(getSupportFragmentManager(),"tag");


//        getSupportFragmentManager().beginTransaction().replace(R.id.fl_frame_one,new BlankFragment()).commit();


//        btnFragment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//           String name=     editText.getText().toString().trim();
//                getSupportFragmentManager().beginTransaction().replace(R.id.fl_frame_one,new BlankFragment(name)).commit();
//
//              if(!status){
//
//                    status = true;
//                }else {
//                    getSupportFragmentManager().beginTransaction().replace(R.id.fl_frame_one,new BlankFragment2()).commit();
//                    status = false;
//                }
//            }
//        });


    }
}