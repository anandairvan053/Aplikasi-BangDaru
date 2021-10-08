package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LimasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_limas)
        val btnHitung = findViewById<Button>(R.id.btnHitungblk)
        val editAlas = findViewById<EditText>(R.id.etalas)
        val editTinggiSisi = findViewById<EditText>(R.id.ettinggisisi)
        val editTinggiLimas = findViewById<EditText>(R.id.ettinggilms)
        val hasilVolume = findViewById<TextView>(R.id.txthslvolumeblk)
        val hasilLuas = findViewById<TextView>(R.id.txthslluasblk)

        var alasLimas: Double? = null
        var tinggisisiLimas: Double? = null
        var tinggiLimas: Double? = null
        var volumeLimas: Double? = null
        var luasLimas: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editAlas.getText().toString().trim().isEmpty() || editTinggiSisi.getText().toString().trim().isEmpty() ||
                editTinggiLimas.getText().toString().trim().isEmpty())
            {
                Toast.makeText(
                    this@LimasActivity,
                    "Alas, Tinggi Sisi, dan Tinggi Limas tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else {
                alasLimas = editAlas.getText().toString().toDouble()
                tinggiLimas = editTinggiLimas.getText().toString().toDouble()
                tinggisisiLimas = editTinggiSisi.getText().toString().toDouble()
                volumeLimas = (alasLimas!! * alasLimas!! * tinggiLimas!!) / 3
                hasilVolume.setText(volumeLimas.toString())
                luasLimas = 2*(alasLimas!! * tinggisisiLimas!!) + (alasLimas!! * alasLimas!!)
                hasilLuas.setText(luasLimas.toString())
            }
        }
    }
}