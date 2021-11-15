package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SevenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)
    }

    fun kubusMenu (view: View){
        val menukubus = Intent(this@SevenActivity, CiriKubusActivity::class.java)
        startActivity(menukubus)
        finish()
    }

    fun balokMenu (view: View){
        val menubalok = Intent(this@SevenActivity, CiriBalokActivity::class.java)
        startActivity(menubalok)
        finish()
    }

    fun tabungMenu (view: View){
        val menutabung = Intent(this@SevenActivity, CiriTabungActivity::class.java)
        startActivity(menutabung)
        finish()
    }

    fun kerucutMenu (view: View){
        val menukerucut = Intent(this@SevenActivity, CiriKerucutActivity::class.java)
        startActivity(menukerucut)
        finish()
    }

    fun bolaMenu (view: View){
        val menubola = Intent(this@SevenActivity, CiriBolaActivity::class.java)
        startActivity(menubola)
        finish()
    }

    fun limasMenu (view: View){
        val menulimas = Intent(this@SevenActivity, CiriLimasActivity::class.java)
        startActivity(menulimas)
        finish()
    }

    fun prismaMenu (view: View){
        val menuprisma = Intent(this@SevenActivity, CiriPrismaActivity::class.java)
        startActivity(menuprisma)
        finish()
    }

    override fun onBackPressed() {
        val batal = Intent(this@SevenActivity, FourthActivity::class.java)
        startActivity(batal)
        finish()
    }
}