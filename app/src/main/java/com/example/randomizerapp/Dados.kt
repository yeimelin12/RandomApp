package com.example.randomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class Dados : AppCompatActivity() {

    lateinit var imagdado :ImageView
    lateinit var Tirar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        imagdado = findViewById(R.id.imagedado);
        Tirar = findViewById(R.id.Tirar);



        Tirar.setOnClickListener{

            var naleat = Random()

            var nume =naleat.nextInt(6)+1

            if (nume == 1) {
                imagdado.setImageResource(R.drawable.cara1)
            }

            if (nume == 2) {
                imagdado.setImageResource(R.drawable.cara2)
            }

            if (nume == 3) {
                imagdado.setImageResource(R.drawable.cara3)
            }

            if (nume == 4) {
                imagdado.setImageResource(R.drawable.cara4)
            }

            if (nume == 5) {
                imagdado.setImageResource(R.drawable.cara5)
            }

            if (nume == 6) {
                imagdado.setImageResource(R.drawable.cara6)
            }

        }


    }


}