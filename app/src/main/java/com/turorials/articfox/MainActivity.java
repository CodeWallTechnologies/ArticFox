package com.turorials.articfox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {


    ListView listView;
    SearchView searchView;
    ArrayAdapter<String> arrayAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.list_view);
        searchView = findViewById(R.id.search_View);


        List<String > list = new ArrayList<>();


        list.add("Apples");
        list.add("Orange");
        list.add("Grape");
        list.add("Mango");
        list.add("Apples");
        list.add("Orange");
        list.add("Grape");
        list.add("Mango");
        list.add("Apples");
        list.add("Orange");
        list.add("Grape");
        list.add("Mango");
        list.add("Apples");
        list.add("Orange");
        list.add("Grape");
        list.add("Mango");


         arrayAdapter = new ArrayAdapter<>(MainActivity.this,
                R.layout.support_simple_spinner_dropdown_item,list);


        listView.setAdapter(arrayAdapter);



        searchView.setOnQueryTextListener(this);







        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Fruit.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, ""+ list.get(position), Toast.LENGTH_SHORT).show();
            }
        });


        //Map //HashMap



    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        arrayAdapter.getFilter().filter(newText);
        return false;
    }
}