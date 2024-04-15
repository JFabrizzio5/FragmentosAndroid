package com.example.fragmentsaludito;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragresultados extends Fragment {

    TextView viresultados; // Referencia al TextView

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragresultados, container, false);
        viresultados = view.findViewById(R.id.viresultados); // Inicializar el TextView
        return view;
    }

    // Método para actualizar el TextView con los resultados
    public void actualizarResultados(int resultado) {
        viresultados.setText(String.valueOf(resultado));
    }
}
