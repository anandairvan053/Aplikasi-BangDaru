package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }

    fun kubusMenu (view: View){
        val menukubus = Intent(this@ThirdActivity, KubusActivity::class.java)
        startActivity(menukubus)
        finish()
    }

    fun balokMenu (view: View){
        val menubalok = Intent(this@ThirdActivity, BalokActivity::class.java)
        startActivity(menubalok)
        finish()
    }

    fun tabungMenu (view: View){
        val menutabung = Intent(this@ThirdActivity, TabungActivity::class.java)
        startActivity(menutabung)
        finish()
    }

    fun kerucutMenu (view: View){
        val menukerucut = Intent(this@ThirdActivity, KerucutActivity::class.java)
        startActivity(menukerucut)
        finish()
    }

    fun bolaMenu (view: View){
        val menubola = Intent(this@ThirdActivity, BolaActivity::class.java)
        startActivity(menubola)
        finish()
    }

    fun limasMenu (view: View){
        val menulimas = Intent(this@ThirdActivity, LimasActivity::class.java)
        startActivity(menulimas)
        finish()
    }

    fun prismaMenu (view: View){
        val menuprisma = Intent(this@ThirdActivity, PrismaActivity::class.java)
        startActivity(menuprisma)
        finish()
    }

    override fun onBackPressed() {
        val batal = Intent(this@ThirdActivity, MainActivity::class.java)
        startActivity(batal)
        finish()
    }
}