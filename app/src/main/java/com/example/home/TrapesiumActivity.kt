package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class TrapesiumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapesium)
        val btnHitung = findViewById<Button>(R.id.btnHitungblk)
        val editsisi1 = findViewById<EditText>(R.id.etsisi1)
        val editsisi2 = findViewById<EditText>(R.id.etsisi2)
        val editsisiatas = findViewById<EditText>(R.id.etatas)
        val edittinggi = findViewById<EditText>(R.id.etltinggiblk)
        val editsisibawah = findViewById<EditText>(R.id.etbawah)
        val hasilKeliling = findViewById<TextView>(R.id.txthslkeliling)
        val hasilLuas = findViewById<TextView>(R.id.txthsluas)

        var sisi1: Double? = null
        var sisi2: Double? = null
        var atas: Double? = null
        var bawah: Double? = null
        var tinggi: Double? = null
        var keliling: Double? = null
        var luas: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editsisi1.getText().toString().trim().isEmpty() || editsisi2.getText().toString().trim().isEmpty() || edittinggi.getText().toString().trim().isEmpty() || editsisiatas.getText().toString()
                    .trim().isEmpty() ||
                editsisibawah.getText().toString().trim().isEmpty()
            ) {
                Toast.makeText(
                    this@TrapesiumActivity,
                    "Sisi Panjang, Sisi Pendek, Sisi 1, Sisi 2, dan Tinggi Trapesium tidak boleh kosong",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                val DF = DecimalFormat("#.##")
                sisi1 = editsisi1.getText().toString().toDouble()
                sisi2 = editsisi2.getText().toString().toDouble()
                atas = editsisiatas.getText().toString().toDouble()
                bawah = editsisibawah.getText().toString().toDouble()
                tinggi = edittinggi.getText().toString().toDouble()
                keliling = sisi1!! + sisi2!! + atas!! + bawah!!
                hasilKeliling.setText(DF.format(keliling).toString())
                luas = (atas!! + bawah!!) * tinggi!! / 2
                hasilLuas.setText(DF.format(luas).toString())
            }
        }
    }

    override fun onBackPressed() {
        val batal = Intent(this@TrapesiumActivity, SecondActivity::class.java)
        startActivity(batal)
        finish()
    }
}