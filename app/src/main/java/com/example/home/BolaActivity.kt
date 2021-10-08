package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class BolaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bola)
        val btnHitung = findViewById<Button>(R.id.btnHitungbl)
        val editJari = findViewById<EditText>(R.id.etjari)
        val hasilVolume = findViewById<TextView>(R.id.txthslvolumbl)
        val hasilLuas = findViewById<TextView>(R.id.txthslluasbl)

        var jariBola: Double? = null
        var volumeBola: Double? = null
        var luasBola: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editJari.getText().toString().trim().isEmpty())
            {
                Toast.makeText(
                    this@BolaActivity,
                    "Jari-Jari tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                jariBola = editJari.getText().toString().toDouble()
                volumeBola = (4 * 3.14 * jariBola!! * jariBola!! * jariBola!!) / 3
                hasilVolume.setText(volumeBola.toString())
                luasBola = 4 * 3.14 * jariBola!! * jariBola!!
                hasilLuas.setText(luasBola.toString())
            }
        }
    }
}