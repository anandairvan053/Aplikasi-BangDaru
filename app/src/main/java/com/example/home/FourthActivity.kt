package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
    }

    fun bangundtrMenu (view: View){
        val menutentang = Intent(this@FourthActivity, SixActivity::class.java)
        startActivity(menutentang)
        finish()
    }

    fun bangunragMenu (view: View){
        val menutentang = Intent(this@FourthActivity, SevenActivity::class.java)
        startActivity(menutentang)
        finish()
    }

    override fun onBackPressed() {
        val batal = Intent(this@FourthActivity, MainActivity::class.java)
        startActivity(batal)
        finish()
    }
}