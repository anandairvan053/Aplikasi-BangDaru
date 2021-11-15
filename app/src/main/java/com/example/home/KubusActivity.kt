package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.home.R
import java.text.DecimalFormat

class KubusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kubus)
        val btnHitung = findViewById<Button>(R.id.btnHitungkbs)
        val editrusuk = findViewById<EditText>(R.id.etrusukkbs)
        val hasilVolume = findViewById<TextView>(R.id.txthslvolumkbs)
        val hasilLuas = findViewById<TextView>(R.id.txthslluaskbs)

        var rusukKubus: Double? = null
        var volumeKubus: Double? = null
        var luasKubus: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editrusuk.getText().toString().trim().isEmpty())
            {
                Toast.makeText(
                    this@KubusActivity,
                    "Rusuk tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val DF = DecimalFormat("#.##")
                rusukKubus = editrusuk.getText().toString().toDouble()
                volumeKubus = rusukKubus!! *  rusukKubus!! * rusukKubus!!
                hasilVolume.setText(DF.format(volumeKubus).toString())
                luasKubus = 6 *  rusukKubus!! * rusukKubus!!
                hasilLuas.setText(DF.format(luasKubus).toString())
            }
        }
    }

    override fun onBackPressed() {
        val batal = Intent(this@KubusActivity, ThirdActivity::class.java)
        startActivity(batal)
        finish()
    }
}