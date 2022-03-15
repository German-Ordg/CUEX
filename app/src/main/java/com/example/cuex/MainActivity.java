package com.example.cuex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero= (EditText) findViewById(R.id.txtnumero);
        Resultado= (TextView) findViewById(R.id.txtresultado);
    }

    public void dolar(View view){
        if(validar()) {
            String lempira = numero.getText().toString();

            double numero1  = Double.parseDouble(lempira);

            double division = numero1 / 24.50;
            String resultado = String.valueOf(division);
            Resultado.setText(resultado);
        }

    }

    public void euro(View view){
        if(validar()) {
            String lempira = numero.getText().toString();

            double numero1  = Double.parseDouble(lempira);

            double division = numero1 / 28.15;
            String resultado = String.valueOf(division);
            Resultado.setText(resultado);
        }

    }

    public boolean validar(){
        boolean retorno= true;

        String validacion1 = numero.getText().toString();

        if ((validacion1.isEmpty())){
            numero.setError("El campo no puede estar vacio");
            retorno =false;
        }
        return retorno;
    }
}