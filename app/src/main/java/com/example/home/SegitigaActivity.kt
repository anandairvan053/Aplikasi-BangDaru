package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SegitigaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)
        val btnHitung = findViewById<Button>(R.id.btnHitungblk)
        val editalas = findViewById<EditText>(R.id.etalas)
        val edittinggi = findViewById<EditText>(R.id.etltinggiblk)
        val hasilKeliling = findViewById<TextView>(R.id.txthslkeliling)
        val hasilLuas = findViewById<TextView>(R.id.txthsluaspp)

        var alassegitiga: Double? = null
        var tinggisegitiga: Double? = null
        var kelilingsegitiga: Double? = null
        var luassegitiga: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (edittinggi.getText().toString().trim().isEmpty() || editalas.getText().toString().trim().isEmpty()){
                Toast.makeText(this@SegitigaActivity, "Tinggi dan Alas tidak boleh kosong", Toast.LENGTH_SHORT ).show()
            } else {
                alassegitiga = editalas.getText().toString().toDouble()
                tinggisegitiga = edittinggi.getText().toString().toDouble()
                kelilingsegitiga = alassegitiga!! * 3
                hasilKeliling.setText(kelilingsegitiga.toString())
                luassegitiga = alassegitiga!! * tinggisegitiga!! / 2
                hasilLuas.setText(luassegitiga.toString())
            }
        }
    }
}