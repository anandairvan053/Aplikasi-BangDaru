package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class KerucutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kerucut)
        val btnHitung = findViewById<Button>(R.id.btnHitungblk)
        val editJari = findViewById<EditText>(R.id.etjari)
        val editTinggi = findViewById<EditText>(R.id.ettinggi)
        val hasilVolume = findViewById<TextView>(R.id.txthslvolumeblk)
        val hasilLuas = findViewById<TextView>(R.id.txthslluasblk)

        var jariKerucut: Double? = null
        var tinggiKerucut: Double? = null
        var volumeKerucut: Double? = null
        var luasKerucut: Double? = null
        var garispelukisKuadrat: Double? = null
        var garispelukis: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editJari.getText().toString().trim().isEmpty()  ||
                editTinggi.getText().toString().trim().isEmpty())
            {
                Toast.makeText(
                    this@KerucutActivity,
                    "Jari-Jari dan Tinggi tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val DF = DecimalFormat("#.##")
                jariKerucut = editJari.getText().toString().toDouble()
                tinggiKerucut = editTinggi.getText().toString().toDouble()
                volumeKerucut = (3.14 * jariKerucut!! * jariKerucut!! * tinggiKerucut!!) / 3
                hasilVolume.setText(DF.format(volumeKerucut).toString())
                garispelukisKuadrat = (jariKerucut!! * jariKerucut!!) + (tinggiKerucut!! * tinggiKerucut!!)
                garispelukis = Math.sqrt(garispelukisKuadrat!!)
                luasKerucut = 3.14 * jariKerucut!! * (jariKerucut!! + garispelukis!!)
                hasilLuas.setText(DF.format(luasKerucut).toString())
            }
        }
    }

    override fun onBackPressed() {
        val batal = Intent(this@KerucutActivity, ThirdActivity::class.java)
        startActivity(batal)
        finish()
    }
}