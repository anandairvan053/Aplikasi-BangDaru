package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CiriPersegiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciri_persegi)
    }

    fun buttonkembali(view: View) {
        val kembali = Intent(this@CiriPersegiActivity, SixActivity::class.java)
        startActivity(kembali)
        finish()
    }

    override fun onBackPressed() {
        val batal = Intent(this@CiriPersegiActivity, SixActivity::class.java)
        startActivity(batal)
        finish()
    }
}