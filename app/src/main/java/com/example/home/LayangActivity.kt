package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class LayangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layang)
        val btnHitung = findViewById<Button>(R.id.btnHitungblk)
        val editsisi1 = findViewById<EditText>(R.id.ets1)
        val editsisi2 = findViewById<EditText>(R.id.ets2)
        val editdiagonal1 = findViewById<EditText>(R.id.etd1)
        val editdiagonal2 = findViewById<EditText>(R.id.etd2)
        val hasilKeliling = findViewById<TextView>(R.id.txthslkeliling)
        val hasilLuas = findViewById<TextView>(R.id.txthsluas)

        var sisi1: Double? = null
        var sisi2: Double? = null
        var diagonal1: Double? = null
        var diagonal2: Double? = null
        var keliling: Double? = null
        var luas: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editsisi1.getText().toString().trim().isEmpty() || editsisi2.getText().toString().trim().isEmpty() || editdiagonal1.getText().toString()
                    .trim().isEmpty() ||
                editdiagonal2.getText().toString().trim().isEmpty()
            ) {
                Toast.makeText(
                    this@LayangActivity,
                    "Sisi Panjang, Sisi Pendek, Diagonal 1, dan Diagonal 2 Layang - Layang tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val DF = DecimalFormat("#.##")
                sisi1 = editsisi1.getText().toString().toDouble()
                sisi2 = editsisi2.getText().toString().toDouble()
                diagonal1 = editdiagonal1.getText().toString().toDouble()
                diagonal2 = editdiagonal2.getText().toString().toDouble()
                keliling = (sisi1!! + sisi2!!) * 2
                hasilKeliling.setText(DF.format(keliling).toString())
                luas = diagonal1!! * diagonal2!! / 2
                hasilLuas.setText(DF.format(luas).toString())
            }
        }
    }

    override fun onBackPressed() {
        val batal = Intent(this@LayangActivity, SecondActivity::class.java)
        startActivity(batal)
        finish()
    }
}