package com.example.fuent.lab2.Interface

/**
 * Created by fuent on 16/01/2019.
 */
interface MenuOrder {
    val menuOrder: ArrayList<String> // Pedido

    fun clear() // Limpiar pedido
    fun add(element: String) // Agregar elemento
    fun del(elementIndex: Int) // Elimina elemento
    fun done() // Realiza pedido
}