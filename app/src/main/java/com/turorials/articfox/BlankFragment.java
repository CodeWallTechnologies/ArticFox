package com.turorials.articfox;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BlankFragment extends Fragment {

    EditText editText;
    Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        editText = view.findViewById(R.id.editTextTextPersonName);
        button = view.findViewById(R.id.btn_change_fragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString().trim();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fl_frame_one,new BlankFragment2(name)).commit();
            }
        });




        // Inflate the layout for this fragment
        return view;
    }





    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BlankFragment","On Create");
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("BlankFragment","On Activity Created");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("BlankFragment","On Start");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BlankFragment","On Resume");
    }


    @Override
    public void onAttach(@NonNull Context context) {

        super.onAttach(context);
        Log.d("BlankFragment","On Attach");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("BlankFragment","On Pause");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.d("BlankFragment","On Stop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BlankFragment","On DestoryView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BlankFragment","On Destroy");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("BlankFragment","On Detach");
    }
}