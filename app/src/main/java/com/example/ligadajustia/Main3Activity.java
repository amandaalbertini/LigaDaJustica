package com.example.ligadajustia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batman);
        Bundle extras = getIntent().getExtras();

        TextView nome = findViewById(R.id.txtnome2);
        TextView codi = findViewById(R.id.txtcodinome2);
        TextView especie = findViewById(R.id.txtespecie2);
        TextView habilidade = findViewById(R.id.txthabilidade2);
        TextView vulnerabilidade = findViewById(R.id.txtvulnerabilidade2);
        TextView acesso = findViewById(R.id.txtacesso2);
        TextView equipa = findViewById(R.id.txtequip2);
        TextView equipd = findViewById(R.id.txtequipdesc2);
        TextView equipf = findViewById(R.id.txtequipfin2);

        String Nome = null, Codi = null, Especie = null, Habilidade = null, Vulnerabilidade = null, Acesso = null, Equipa = null, Equipd = null, Equipf = null;

        Nome = extras.getString(MainActivity.NOME);
        Codi = extras.getString(MainActivity.CODINOME);
        Especie = extras.getString(MainActivity.ESPECIE);
        Habilidade = extras.getString(MainActivity.HABILIDADE);
        Vulnerabilidade = extras.getString(MainActivity.VULNERABILIDADE);
        Acesso = extras.getString(MainActivity.NIVELACESSO);
        Equipa = extras.getString(MainActivity.EQUIPAMENTO);
        Equipd = extras.getString(MainActivity.DESCEQUIP);
        Equipf = extras.getString(MainActivity.FINALIDADEEQUIP);

        String NOME = String.format(Nome);
        nome.setText(NOME);

        String CODINOME = String.format(Codi);
        codi.setText(CODINOME);

        String ESPECIE = String.format(Especie);
        especie.setText(ESPECIE);

        String HABI = String.format(Habilidade);
        habilidade.setText(HABI);

        String VULNE = String.format(Vulnerabilidade);
        vulnerabilidade.setText(VULNE);

        String ACESSO = String.format(Acesso);
        acesso.setText(ACESSO);

        String EQUIPA = String.format(Equipa);
        equipa.setText(EQUIPA);

        String EQUIPD = String.format(Equipd);
        equipd.setText(EQUIPD);

        String EQUIPF = String.format(Equipf);
        equipf.setText(EQUIPF);
    
    }
}
