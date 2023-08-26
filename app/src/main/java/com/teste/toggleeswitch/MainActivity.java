package com.teste.toggleeswitch;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView textResultado;
    private TextView resultadoFinal;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        textResultado = findViewById(R.id.textResultado);
        resultadoFinal = findViewById(R.id.resultadoFinal);
        checkedListener();
        segundaLista();
    }

    public void checkedListener() {
        toggleSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textResultado.setText("Notificações Ativadas");
                } else {
                    textResultado.setText("Notificações Desabilitadas");
                }


            }
        });
    }

    public void segundaLista() {
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    resultadoFinal.setText("Notificações Ativadas");
                } else {
                    resultadoFinal.setText("Notificações Desabilitadas");
                }


            }
        });
    }

    public void enviarToggle(View view) {
        if (toggleSenha.isChecked()) {
            textResultado.setText("Notificações Ativadas");
        } else {
            textResultado.setText("Notificações Desabilitadas");
        }
    }

    public void enviarSwitch(View view) {
        if (switchSenha.isChecked()) {
            resultadoFinal.setText("Notificações Ativadas");
        } else {
            resultadoFinal.setText("Notificações Desabilitadas");
        }
    }

}
