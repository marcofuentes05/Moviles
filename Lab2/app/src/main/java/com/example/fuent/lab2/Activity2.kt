package com.example.fuent.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.fuent.lab2.Interface.Clases.MenuOrderImp


class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val matriz = arrayOf("Hamburguesa","Papas","Gaseosas","Pizza","Dulces","Ensalada")

        val lista : ListView = findViewById(R.id.listaMenu)
        val button1: Button = findViewById(R.id.inicioBackButton)
        button1.setOnClickListener{
            val intent = Intent (this, Activity1::class.java)
            startActivity(intent)
        }

        val adapter : ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,matriz)
        lista.adapter = adapter


        lista.isClickable = true
        lista.onItemClickListener = AdapterView.OnItemClickListener { arg0, arg1, position, arg3 ->
            val s: MenuOrderImp = (this.application as MyAplication).getOrden()
            s.add(matriz.get(position))

            val toast1: Toast = Toast.makeText(applicationContext,"Se ha agregado '"+matriz.get(position)+"' a tu orden", Toast.LENGTH_LONG)
            toast1.show()

        }

    }
}
