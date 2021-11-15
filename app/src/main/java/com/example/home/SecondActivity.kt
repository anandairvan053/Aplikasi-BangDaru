package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun persegiMenu (view: View){
        val menupersegi = Intent(this@SecondActivity, PersegiActivity::class.java)
        startActivity(menupersegi)
        finish()
    }

    fun perpanMenu (view: View){
        val menupersegipanjang = Intent(this@SecondActivity, PerPanjangActivity::class.java)
        startActivity(menupersegipanjang)
        finish()
    }

    fun lingkaranMenu (view: View){
        val menulingkaran = Intent(this@SecondActivity, LingkaranActivity::class.java)
        startActivity(menulingkaran)
        finish()
    }

    fun segitigaMenu (view: View){
        val menusegitiga = Intent(this@SecondActivity, SegitigaActivity::class.java)
        startActivity(menusegitiga)
        finish()
    }

    fun layangMenu (view: View){
        val menulayang = Intent(this@SecondActivity, LayangActivity::class.java)
        startActivity(menulayang)
        finish()
    }

    fun trapesiumMenu (view: View){
        val menutrapesium = Intent(this@SecondActivity, TrapesiumActivity::class.java)
        startActivity(menutrapesium)
        finish()
    }

    fun belketMenu (view: View){
        val menubelahketupat = Intent(this@SecondActivity, BelahKetActivity::class.java)
        startActivity(menubelahketupat)
        finish()
    }

    override fun onBackPressed() {
        val batal = Intent(this@SecondActivity, MainActivity::class.java)
        startActivity(batal)
        finish()
    }
}