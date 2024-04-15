package com.example.fragmentsaludito;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class fragopera extends Fragment implements View.OnClickListener {
    EditText editadito1, editadito2;
    Button bot1, bot2, bot3, bot4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragopera, container, false);
        bot1 = view.findViewById(R.id.botoncalcu1);
        bot2 = view.findViewById(R.id.botoncalcu2);
        bot3 = view.findViewById(R.id.botoncalcu3);
        bot4 = view.findViewById(R.id.botoncalcu4);

        editadito1 = view.findViewById(R.id.textocalcu);
        editadito2 = view.findViewById(R.id.textocalcu2);

        bot1.setOnClickListener(this);
        bot2.setOnClickListener(this);
        bot3.setOnClickListener(this);
        bot4.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        String cadenita = ((Button)v).getText().toString();
        operaciones operadito = new operaciones();
        operadito.setDatito(Integer.parseInt(editadito1.getText().toString()));
        operadito.setDatito2(Integer.parseInt(editadito2.getText().toString()));

        int resultado = 0; // Variable para guardar el resultado

        if(cadenita.equals("suma")){
            resultado = operadito.suma();
        } else if(cadenita.equals("resta")){
            resultado = operadito.resta();
        } else if(cadenita.equals("multi")){
            resultado = operadito.multi();
        } else if(cadenita.equals("divide")){
            resultado = operadito.divi();
        }

        // Obtener el Fragmento fragresultados y actualizar los resultados
        fragresultados resultadosFragment = (fragresultados) getActivity().getSupportFragmentManager().findFragmentById(R.id.fragmentcalculares);


        if (resultadosFragment != null) {
            resultadosFragment.actualizarResultados(resultado);
        }
    }
}
