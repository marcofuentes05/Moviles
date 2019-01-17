package com.example.fuent.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import com.example.fuent.lab2.Interface.Clases.MenuOrderImp

class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val listaPedido : ListView = findViewById(R.id.listaPedido)


        var orden = (this.application as MyAplication).getOrden()
        var matriz = (this.application as MyAplication).getOrden().menuOrder
        val adapter : ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,matriz)
        listaPedido.adapter = adapter
        val button1: Button = findViewById(R.id.inicio)
        button1.setOnClickListener{
            val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }


        val button2: Button = findViewById(R.id.limpiarPedido)
        button2.setOnClickListener{
            val s:MenuOrderImp = (this.application as MyAplication).getOrden()
            s.clear()
            (this.application as MyAplication).setOrden(s)
            val toast1: Toast = Toast.makeText(applicationContext,"El pedido ha sido limpiado con éxito",Toast.LENGTH_LONG)
            toast1.show()
            var orden = (this.application as MyAplication).getOrden()
            var matriz = (this.application as MyAplication).getOrden().menuOrder
            val adapter : ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,matriz)
            listaPedido.adapter = adapter

        }

        val button3: Button = findViewById(R.id.hacerPedido)
        button3.setOnClickListener{
            val s : MenuOrderImp = (this.application as MyAplication).getOrden()
            s.done()
            (this.application as MyAplication).setOrden(s)

            var orden = (this.application as MyAplication).getOrden()
            var matriz = (this.application as MyAplication).getOrden().menuOrder
            val adapter : ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,matriz)
            listaPedido.adapter = adapter

            val toast1: Toast = Toast.makeText(applicationContext,"El pedido ha sido hecho con éxito",Toast.LENGTH_LONG)
            toast1.show()
        }
    }
}
