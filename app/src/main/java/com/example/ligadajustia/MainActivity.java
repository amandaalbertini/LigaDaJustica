package com.example.ligadajustia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static String NOME = "com.example.ligadajustia.EXTRA_MESSAGENOME";
    public final static String CODINOME = "com.example.ligadajustia.CODINOME";
    public final static String ESPECIE = "com.example.ligadajustia.ESPECIE";
    public final static String HABILIDADE = "com.example.ligadajustia.HABILIDADE";
    public final static String VULNERABILIDADE = "com.example.ligadajustia.VULNERABILIDADE";
    public final static String NIVELACESSO = "com.example.ligadajustia.NIVELACESSO";
    public final static String EQUIPAMENTO = "com.example.ligadajustia.EQUIPAMENTO";
    public final static String DESCEQUIP = "com.example.ligadajustia.DESCEQUIP";
    public final static String FINALIDADEEQUIP = "com.example.ligadajustia.FINALIDADEEQUIP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Batman(View view) {

        String nome, codinome, especie, habilidades, vulnerabilidades, nivelacesso, equipamento, descequip, finalidadeequip;

        nome = "Bruce Wayne";
        codinome="Batman";
        especie="Humano";
        habilidades="Ser rico e Inteligente";
        vulnerabilidades="Magia";
        nivelacesso="10";
        equipamento="Batrang";
        descequip="Bumerangue de ferro em formto de morcego";
        finalidadeequip="Arremeçado para apagar inimigo";

        Intent intent = new Intent(this, Batman.class);
        intent.putExtra(NOME, nome);
        intent.putExtra(CODINOME, codinome);
        intent.putExtra(ESPECIE, especie);
        intent.putExtra(HABILIDADE, habilidades);
        intent.putExtra(VULNERABILIDADE, vulnerabilidades);
        intent.putExtra(NIVELACESSO, nivelacesso);
        intent.putExtra(EQUIPAMENTO, equipamento);
        intent.putExtra(DESCEQUIP, descequip);
        intent.putExtra(FINALIDADEEQUIP, finalidadeequip);

       startActivity(intent);


    }





    public void Superman(View view) {

        String nome, codinome, especie, habilidades, vulnerabilidades, nivelacesso, equipamento, descequip, finalidadeequip;

        nome = "Clark Kent";
        codinome="Superman";
        especie="Kryptoniano";
        habilidades="Escutar sons que um humano normal não pode escutar, soltar raio-laser pelos olhos e sopro congelante";
        vulnerabilidades="Kriptonita";
        nivelacesso="8";
        equipamento="Sua própria força";
        descequip="Sua força é a fonte de ";
        finalidadeequip="Combater crimes";

        Intent intent = new Intent(this, Batman.class);
        intent.putExtra(NOME, nome);
        intent.putExtra(CODINOME, codinome);
        intent.putExtra(ESPECIE, especie);
        intent.putExtra(HABILIDADE, habilidades);
        intent.putExtra(VULNERABILIDADE, vulnerabilidades);
        intent.putExtra(NIVELACESSO, nivelacesso);
        intent.putExtra(EQUIPAMENTO, equipamento);
        intent.putExtra(DESCEQUIP, descequip);
        intent.putExtra(FINALIDADEEQUIP, finalidadeequip);

        startActivity(intent);
    }

    public void Flash(View view) {

        String nome, codinome, especie, habilidades, vulnerabilidades, nivelacesso, equipamento, descequip, finalidadeequip;

        nome = "Berry Allen";
        codinome="Flash";
        especie="Humano modificado";
        habilidades="Velocista e rapida regeneração";
        vulnerabilidades="Frio";
        nivelacesso="5";
        equipamento="Roupa Anti-Atrito";
        descequip="Roupa que evita com que ele pegue fogo em alta velocitade e proteje ele de vento.";
        finalidadeequip="Proteção";

        Intent intent = new Intent(this, Batman.class);
        intent.putExtra(NOME, nome);
        intent.putExtra(CODINOME, codinome);
        intent.putExtra(ESPECIE, especie);
        intent.putExtra(HABILIDADE, habilidades);
        intent.putExtra(VULNERABILIDADE, vulnerabilidades);
        intent.putExtra(NIVELACESSO, nivelacesso);
        intent.putExtra(EQUIPAMENTO, equipamento);
        intent.putExtra(DESCEQUIP, descequip);
        intent.putExtra(FINALIDADEEQUIP, finalidadeequip);

        startActivity(intent);
    }


    public void Mulher(View view) {
        String nome, codinome, especie, habilidades, vulnerabilidades, nivelacesso, equipamento, descequip, finalidadeequip;

        nome = "Diana Prince";
        codinome="Mulher Maravilha";
        especie="Amazona";
        habilidades="Inteligência, Empatia, Super sentido, Força de Eres";
        vulnerabilidades="Emocional";
        nivelacesso="9";
        equipamento="Laço da verdade";
        descequip="É um laço longo inquebrável";
        finalidadeequip="Usado para bater e laçar os inimigos";

        Intent intent2 = new Intent(this,Batman.class);
        intent2.putExtra(NOME, nome);
        intent2.putExtra(CODINOME, codinome);
        intent2.putExtra(ESPECIE, especie);
        intent2.putExtra(HABILIDADE, habilidades);
        intent2.putExtra(VULNERABILIDADE, vulnerabilidades);
        intent2.putExtra(NIVELACESSO, nivelacesso);
        intent2.putExtra(EQUIPAMENTO, equipamento);
        intent2.putExtra(DESCEQUIP, descequip);
        intent2.putExtra(FINALIDADEEQUIP, finalidadeequip);

        startActivity(intent2);
    }
}
