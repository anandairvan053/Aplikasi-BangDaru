package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

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
                val DF = DecimalFormat("#.##")
                jariBola = editJari.getText().toString().toDouble()
                volumeBola = (4 * 3.14 * jariBola!! * jariBola!! * jariBola!!) / 3
                hasilVolume.setText(DF.format(volumeBola).toString())
                luasBola = 4 * 3.14 * jariBola!! * jariBola!!
                hasilLuas.setText(DF.format(luasBola).toString())
            }
        }
    }

    override fun onBackPressed() {
        val batal = Intent(this@BolaActivity, ThirdActivity::class.java)
        startActivity(batal)
        finish()
    }
}