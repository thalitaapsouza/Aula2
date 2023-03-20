package com.example.aula2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup getGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getGroup = (RadioGroup) findViewById(R.id.radioGrupoPrincipal);
    }

    public void btnQuestionario(View view) {
        RadioButton radioSelecionado = (RadioButton) findViewById(getGroup.getCheckedRadioButtonId());
        if (radioSelecionado.getText().toString().equals("1976"))
            Toast.makeText(this, "Certa Resposta!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Resposta Errada! A correta é: 1976", Toast.LENGTH_SHORT).show();
    }
}