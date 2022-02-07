package com.turorials.articfox;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment2 extends Fragment {

    String name;
    TextView textView;

    public BlankFragment2(String name) {
        this.name = name;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_blank2, container, false);
        textView = view.findViewById(R.id.fg2_tv);
        textView.setText(name);

        // Inflate the layout for this fragment
        return view;
    }
}