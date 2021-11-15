package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class PersegiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)
        val btnHitung = findViewById<Button>(R.id.btnHitungblk)
        val editTextSisi = findViewById<EditText>(R.id.etsisi)
        val hasilKeliling = findViewById<TextView>(R.id.txthslkll)
        val hasilLuas = findViewById<TextView>(R.id.txthslluasblk)

        var sisiPersegi: Double? = null
        var kelilingPersegi: Double? = null
        var luasPersegi: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editTextSisi.getText().toString().trim().isEmpty()){
                Toast.makeText(this@PersegiActivity, "Sisi tidak boleh kosong",Toast.LENGTH_SHORT ).show()
            } else {
                val DF = DecimalFormat("#.##")
                sisiPersegi = editTextSisi.getText().toString().toDouble()
                kelilingPersegi = sisiPersegi!! * 4
                hasilKeliling.setText(DF.format(kelilingPersegi).toString())
                luasPersegi = sisiPersegi!! * sisiPersegi!!
                hasilLuas.setText(DF.format(luasPersegi).toString())
            }
        }
    }

    override fun onBackPressed() {
        val batal = Intent(this@PersegiActivity, SecondActivity::class.java)
        startActivity(batal)
        finish()
    }
}