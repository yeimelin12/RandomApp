package com.example.randomizerapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var dado: Button
    lateinit var moneda: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dado = findViewById(R.id.dado);
        moneda = findViewById(R.id.moneda)

        dado.setOnClickListener{
            val intent = Intent(this, Dados::class.java);
            startActivity(intent)
        }

        moneda.setOnClickListener{
            val intent = Intent(this, Monedass::class.java);
            startActivity(intent)
        }

    }



}