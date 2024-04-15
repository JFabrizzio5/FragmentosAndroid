package com.example.fragmentsaludito;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class fragsaludos extends Fragment implements View.OnClickListener {
    View view;
    EditText editadito;
    Button botoncito;
    TextView vistita;
    TextView mensa;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_fragsaludos, container, false);
        editadito = view.findViewById(R.id.textosaludo2);
        botoncito = view.findViewById(R.id.botonsal2);
        mensa = view.findViewById(R.id.mensaj2);

        botoncito.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        vistita = getActivity().findViewById(R.id.visaludoscorre);
        String cadenita = ((Button)v).getText().toString();
        mensajes mensitos = new mensajes();
        if(cadenita.equals("saludo")){
            mensitos.setMensajito(editadito.getText().toString());
            vistita.setText(mensitos.getMensajito());
        }
    }
}