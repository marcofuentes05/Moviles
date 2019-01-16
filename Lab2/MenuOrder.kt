package com.example.oscar.myfirstapp

interface MenuOrder {

    val menuOrder: ArrayList<String> // Pedido

    fun clear() // Limpiar pedido
    fun add(element: String) // Agregar elemento
    fun del(elementIndex: Int) // Elimina elemento
    fun done() // Realiza pedido
}