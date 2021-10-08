package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class TabungActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabung)
        val btnHitung = findViewById<Button>(R.id.btnHitungblk)
        val editJari = findViewById<EditText>(R.id.etjari)
        val editTinggi = findViewById<EditText>(R.id.ettinggi)
        val hasilVolume = findViewById<TextView>(R.id.txthslvolumeblk)
        val hasilLuas = findViewById<TextView>(R.id.txthslluasblk)

        var jariTabung: Double? = null
        var tinggiTabung: Double? = null
        var volumeTabung: Double? = null
        var luasTabung: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editJari.getText().toString().trim().isEmpty()  ||
                editTinggi.getText().toString().trim().isEmpty())
            {
                Toast.makeText(
                    this@TabungActivity,
                    "Jari dan Tinggi tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                jariTabung = editJari.getText().toString().toDouble()
                tinggiTabung = editTinggi.getText().toString().toDouble()
                volumeTabung = 3.14 * jariTabung!! * jariTabung!! * tinggiTabung!!
                hasilVolume.setText(volumeTabung.toString())
                luasTabung = 2 * 3.14 * jariTabung!! * (jariTabung!! + tinggiTabung!!)
                hasilLuas.setText(luasTabung.toString())
            }
        }
    }
}