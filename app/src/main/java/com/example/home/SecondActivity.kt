package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class SecondActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var persegi: ImageButton
    lateinit var ppanjang: ImageButton
    lateinit var lingkaran: ImageButton
    lateinit var segitiga: ImageButton
    lateinit var layang: ImageButton
    lateinit var trapesium: ImageButton
    lateinit var belketupat: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        persegi = findViewById(R.id.Persegi)
        persegi.setOnClickListener(this)
        ppanjang = findViewById(R.id.ppanjang)
        ppanjang.setOnClickListener(this)
        lingkaran = findViewById(R.id.lingkaran)
        lingkaran.setOnClickListener(this)
        segitiga = findViewById(R.id.segitiga)
        segitiga.setOnClickListener(this)
        layang = findViewById(R.id.layang)
        layang.setOnClickListener(this)
        trapesium = findViewById(R.id.trapesium)
        trapesium.setOnClickListener(this)
        belketupat = findViewById(R.id.belketupat)
        belketupat.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.Persegi -> run {
                val persegi = Intent(this@SecondActivity, PersegiActivity::class.java)
                startActivity(persegi)
            }
            R.id.ppanjang -> run {
                val ppanjang = Intent(this@SecondActivity, PerPanjangActivity::class.java)
                startActivity(ppanjang)
            }
            R.id.lingkaran -> run {
                val lingkaran = Intent(this@SecondActivity, LingkaranActivity::class.java)
                startActivity(lingkaran)
            }
            R.id.segitiga -> run {
                val segitiga = Intent(this@SecondActivity, SegitigaActivity::class.java)
                startActivity(segitiga)
            }
            R.id.layang -> run {
                val layang = Intent(this@SecondActivity, LayangActivity::class.java)
                startActivity(layang)
            }
            R.id.trapesium -> run {
                val trapesium = Intent(this@SecondActivity, TrapesiumActivity::class.java)
                startActivity(trapesium)
            }
            R.id.belketupat -> run {
                val layang = Intent(this@SecondActivity, BelahKetActivity::class.java)
                startActivity(layang)
            }
        }
    }
}