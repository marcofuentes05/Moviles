package com.example.fuent.lab2

import android.app.Application
import com.example.fuent.lab2.Interface.Clases.MenuOrderImp
import com.example.fuent.lab2.Interface.MenuOrder

/**
 * Created by fuent on 16/01/2019.
 */
class MyAplication: Application() {

    private var orden : MenuOrderImp =  MenuOrderImp()

    fun getOrden() : MenuOrderImp{
        return this.orden
    }

    fun setOrden(order: MenuOrderImp){
        this.orden =order
    }
}