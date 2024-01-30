package com.luizafmartinez.m05_oop_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.luizafmartinez.m05_oop_java.classes.Cliente;
import com.luizafmartinez.m05_oop_java.classes.ContaBancaria;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* ContaBancaria conta = new ContaBancaria();
        conta.sacar();*/

        Cliente cliente = new Cliente();

    }

}
