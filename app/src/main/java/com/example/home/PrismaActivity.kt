package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class PrismaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prisma)
        val btnHitung = findViewById<Button>(R.id.btnHitungblk)
        val editPanjang = findViewById<EditText>(R.id.etpanjangblk)
        val editLebar = findViewById<EditText>(R.id.etlebarblk)
        val editTinggi = findViewById<EditText>(R.id.ettinggi)
        val hasilVolume = findViewById<TextView>(R.id.txthslvolumeblk)
        val hasilLuas = findViewById<TextView>(R.id.txthslluasblk)

        var panjangPrisma: Double? = null
        var lebarPrisma: Double? = null
        var tinggiPrisma: Double? = null
        var volumePrisma: Double? = null
        var luasPrisma: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editPanjang.getText().toString().trim().isEmpty() || editLebar.getText().toString()
                    .trim().isEmpty() ||
                editTinggi.getText().toString().trim().isEmpty()
            ) {
                Toast.makeText(
                    this@PrismaActivity,
                    "Panjang, Lebar, dan Tinggi tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val DF = DecimalFormat("#.##")
                panjangPrisma = editPanjang.getText().toString().toDouble()
                lebarPrisma = editLebar.getText().toString().toDouble()
                tinggiPrisma = editTinggi.getText().toString().toDouble()
                volumePrisma = (panjangPrisma!! * lebarPrisma!! * tinggiPrisma!!) / 2
                hasilVolume.setText(DF.format(volumePrisma).toString())
                luasPrisma =
                    (3 * panjangPrisma!! * lebarPrisma!!) + (lebarPrisma!! * tinggiPrisma!!)
                hasilLuas.setText(DF.format(luasPrisma).toString())
            }
        }
    }

    override fun onBackPressed() {
        val batal = Intent(this@PrismaActivity, ThirdActivity::class.java)
        startActivity(batal)
        finish()
    }
}