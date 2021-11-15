package com.example.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SixActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six)
    }

    fun persegiMenu (view: View){
        val menupersegi = Intent(this@SixActivity, CiriPersegiActivity::class.java)
        startActivity(menupersegi)
        finish()
    }

    fun perpanMenu (view: View){
        val menuperpan = Intent(this@SixActivity, CiriPerPanjangActivity::class.java)
        startActivity(menuperpan)
        finish()
    }

    fun lingkaranMenu (view: View){
        val menulingkaran = Intent(this@SixActivity, CiriLingkaranActivity::class.java)
        startActivity(menulingkaran)
        finish()
    }

    fun segitigaMenu (view: View){
        val menusegitiga = Intent(this@SixActivity, CiriSegitigaActivity::class.java)
        startActivity(menusegitiga)
        finish()
    }

    fun layangMenu (view: View){
        val menulayang = Intent(this@SixActivity, CiriLayangActivity::class.java)
        startActivity(menulayang)
        finish()
    }

    fun trapesiumMenu (view: View){
        val menutrapesium = Intent(this@SixActivity, CiriTrapesiumActivity::class.java)
        startActivity(menutrapesium)
        finish()
    }

    fun belketMenu (view: View){
        val menubelket = Intent(this@SixActivity, CiriBelKetActivity::class.java)
        startActivity(menubelket)
        finish()
    }

    override fun onBackPressed() {
        val batal = Intent(this@SixActivity, FourthActivity::class.java)
        startActivity(batal)
        finish()
    }
}