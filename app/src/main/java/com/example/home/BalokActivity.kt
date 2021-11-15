package com.example.home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class BalokActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)
        val btnHitung = findViewById<Button>(R.id.btnHitungblk)
        val editPanjang = findViewById<EditText>(R.id.etpanjangblk)
        val editLebar = findViewById<EditText>(R.id.etlebarblk)
        val editTinggi = findViewById<EditText>(R.id.etltinggiblk)
        val hasilVolume = findViewById<TextView>(R.id.txthslvolumeblk)
        val hasilLuas = findViewById<TextView>(R.id.txthslluasblk)

        var panjangBalok: Double? = null
        var lebarBalok: Double? = null
        var tinggiBalok: Double? = null
        var volumeBalok: Double? = null
        var luasBalok: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editPanjang.getText().toString().trim().isEmpty() || editLebar.getText().toString().trim().isEmpty() ||
                editTinggi.getText().toString().trim().isEmpty())
            {
                Toast.makeText(
                    this@BalokActivity,
                    "Panjang, Lebar, dan Tinggi tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val DF = DecimalFormat("#.##")
                panjangBalok = editPanjang.getText().toString().toDouble()
                lebarBalok = editLebar.getText().toString().toDouble()
                tinggiBalok = editTinggi.getText().toString().toDouble()
                volumeBalok = panjangBalok!! * lebarBalok!! * tinggiBalok!!
                hasilVolume.setText(DF.format(volumeBalok).toString())
                luasBalok = 2*(panjangBalok!! * tinggiBalok!!) + 2*(panjangBalok!! * lebarBalok!!) +
                        2*(lebarBalok!! * tinggiBalok!!)
                hasilLuas.setText(DF.format(luasBalok).toString())
            }
        }
    }

    override fun onBackPressed() {
        val batal = Intent(this@BalokActivity, ThirdActivity::class.java)
        startActivity(batal)
        finish()
    }
}