package com.unip.safeeats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unip.safeeats.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abrirTelaCadastro(findViewById(R.id.botaoCadastro));
        abrirTelaLogin(findViewById(R.id.botaoLogin));

    }

    public void abrirTelaCadastro(View v){
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, telaCadastro.class);
                startActivity(intent);
            }
        });

    }

    public void abrirTelaLogin(View v){
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, telaLogin.class);
                startActivity(intent);
            }
        });
    }
}