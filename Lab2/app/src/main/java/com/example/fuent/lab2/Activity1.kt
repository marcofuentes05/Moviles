package com.example.fuent.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity1 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val button1:Button = findViewById(R.id.mostrarMenu)
        val button2:Button = findViewById(R.id.mostrarPedido)

        button1.setOnClickListener{val intent = Intent(this, Activity2::class.java)
        startActivity(intent)}

        button2.setOnClickListener{val intent = Intent(this, Activity3::class.java)
            startActivity(intent)

        }

    }
}
