package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun datarMenu (view: View){
        val bangundatar = Intent(this@MainActivity, SecondActivity::class.java)
        startActivity(bangundatar)
        finish()
    }

    fun ruangMenu (view: View){
        val bangunruang = Intent(this@MainActivity, ThirdActivity::class.java)
        startActivity(bangunruang)
        finish()
    }

    fun tentaruangMenu (view: View){
        val bangundatardanruang = Intent(this@MainActivity, FourthActivity::class.java)
        startActivity(bangundatardanruang)
        finish()
    }

    fun tentangMenu (view: View){
        val menutentang = Intent(this@MainActivity, FifthActivity::class.java)
        startActivity(menutentang)
        finish()
    }

    fun quitApp(view: View) {
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setTitle("Konfirmasi Keluar")
        builder.setMessage("Apakah anda yakin mau keluar aplikasi ?")
        builder.setPositiveButton(
            "Ya"
        ) { dialog, which -> finish() }
        builder.setNegativeButton("Tidak", null)
        val alertDialog = builder.create()
        alertDialog.show()
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setTitle("Konfirmasi Keluar")
        builder.setMessage("Apakah anda yakin mau keluar aplikasi ?")
        builder.setPositiveButton(
            "Ya"
        ) { dialog, which -> finish() }
        builder.setNegativeButton("Tidak", null)
        val alertDialog = builder.create()
        alertDialog.show()
    }
}