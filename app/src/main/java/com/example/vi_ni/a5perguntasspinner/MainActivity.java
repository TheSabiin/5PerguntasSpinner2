package com.example.vi_ni.a5perguntasspinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Spinner spnPergunta1,spnPergunta2,spnPergunta3,spnPergunta4,spnPergunta5;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnPergunta1 = findViewById(R.id.spPergunta1);
        spnPergunta2 = findViewById(R.id.spPergunta2);
        spnPergunta3 = findViewById(R.id.spnPergunta3);
        spnPergunta4 = findViewById(R.id.spnPergunta4);
        spnPergunta5 = findViewById(R.id.spnPergunta5);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void responder(View view){

        spnPergunta1.setEnabled(false);
        spnPergunta2.setEnabled(false);
        spnPergunta3.setEnabled(false);
        spnPergunta4.setEnabled(false);
        spnPergunta5.setEnabled(false);

        int count = 0;

        if(spnPergunta1.getSelectedItem().toString().equals("Maça"))
            count++;
        if(spnPergunta2.getSelectedItem().toString().equals("Chave"))
            count++;
        if(spnPergunta3.getSelectedItem().toString().equals("Disco Rigido"))
            count++;
        if(spnPergunta4.getSelectedItem().toString().equals("NotePad++"))
            count++;
        if(spnPergunta5.getSelectedItem().toString().equals("Nissan"))
            count++;

        txtResultado.setText(String.valueOf(count) + "/5 acertos");
    }
    public void recomecar(View view){
        spnPergunta1.setEnabled(true);
        spnPergunta2.setEnabled(true);
        spnPergunta3.setEnabled(true);
        spnPergunta4.setEnabled(true);
        spnPergunta5.setEnabled(true);

    }
}
