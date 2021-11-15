package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class PerPanjangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_per_panjang)
        val btnHitung = findViewById<Button>(R.id.btnHitungpp)
        val editpanjang = findViewById<EditText>(R.id.etpanjangpp)
        val editlebar = findViewById<EditText>(R.id.etlebarpp)
        val hasilKeliling = findViewById<TextView>(R.id.txthslkelilingpp)
        val hasilLuas = findViewById<TextView>(R.id.txthsluaspp)

        var lebarPersegipanjang: Double? = null
        var panjangPersegipanjang: Double? = null
        var kelilingPersegipanjang: Double? = null
        var luasPersegipanjang: Double? = null

        //Hitung Keliling
        btnHitung.setOnClickListener {
            if (editpanjang.getText().toString().trim().isEmpty() ||  editlebar.getText().toString().trim().isEmpty()){
                Toast.makeText(this@PerPanjangActivity, "Panjang dan lebar tidak boleh kosong", Toast.LENGTH_SHORT ).show()
            } else {
                val DF = DecimalFormat("#.##")
                panjangPersegipanjang = editpanjang.getText().toString().toDouble()
                lebarPersegipanjang = editlebar.getText().toString().toDouble()
                kelilingPersegipanjang = 2*panjangPersegipanjang!!  + 2*lebarPersegipanjang!!
                hasilKeliling.setText(DF.format(kelilingPersegipanjang).toString())
                luasPersegipanjang = panjangPersegipanjang!! * lebarPersegipanjang!!
                hasilLuas.setText(DF.format(luasPersegipanjang).toString())
            }
        }
    }

    override fun onBackPressed() {
        val batal = Intent(this@PerPanjangActivity, SecondActivity::class.java)
        startActivity(batal)
        finish()
    }
}