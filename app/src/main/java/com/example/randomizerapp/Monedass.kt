package com.example.randomizerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class Monedass : AppCompatActivity() {

    lateinit var imagemoned: ImageView
    lateinit var btnmoned: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monedass)

        imagemoned = findViewById(R.id.imagemoned)
        btnmoned = findViewById(R.id.btnmoned)


        btnmoned.setOnClickListener{

            var naleat = Random()

            var nume =naleat.nextInt(6)+1

            if (nume == 1) {
                imagemoned.setImageResource(R.drawable.face)
            }

            if (nume == 2) {
                imagemoned.setImageResource(R.drawable.cross)
            }

        }
    }


}