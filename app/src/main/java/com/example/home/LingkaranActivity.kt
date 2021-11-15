package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class LingkaranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)
        val btnHitung = findViewById<Button>(R.id.btnHitungblk)
        val editTextSisi = findViewById<EditText>(R.id.etjari)
        val hasilKeliling = findViewById<TextView>(R.id.txthslkll)
        val hasilLuas = findViewById<TextView>(R.id.txthslluasblk)

        var jari: Double? = null
        var kelilinglingkaran: Double? = null
        var luaslingkaran: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editTextSisi.getText().toString().trim().isEmpty() ){
                Toast.makeText(this@LingkaranActivity, "jari - jari tidak boleh kosong", Toast.LENGTH_SHORT ).show()
            } else {
                val DF = DecimalFormat("#.##")
                jari = editTextSisi.getText().toString().toDouble()
                kelilinglingkaran = jari!! * 2 * 3.14
                hasilKeliling.setText(DF.format(kelilinglingkaran).toString())
                luaslingkaran = jari!! * jari!! * 3.14
                hasilLuas.setText(DF.format(luaslingkaran).toString())
            }
        }
    }

    override fun onBackPressed() {
        val batal = Intent(this@LingkaranActivity, SecondActivity::class.java)
        startActivity(batal)
        finish()
    }
}