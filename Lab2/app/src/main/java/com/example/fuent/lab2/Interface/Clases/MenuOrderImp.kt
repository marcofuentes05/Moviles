package com.example.fuent.lab2.Interface.Clases

import android.app.AlertDialog
import android.app.PendingIntent.getActivity
import com.example.fuent.lab2.Interface.MenuOrder
import android.content.DialogInterface



/**
 * Created by fuent on 16/01/2019.
 */
class MenuOrderImp: MenuOrder {

    override var menuOrder = ArrayList<String>()
        get() = field


    override fun del(elementIndex: Int) {
        this.menuOrder.removeAt(elementIndex)
    }

    override fun done() {
        this.clear()
    }

    override fun add(element: String) {
        this.menuOrder.add(element)
    }

    override fun clear(){
        this.menuOrder.clear()
    }



}