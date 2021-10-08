package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ThirdActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var kubus: ImageButton
    lateinit var balok: ImageButton
    lateinit var bola: ImageButton
    lateinit var prisma: ImageButton
    lateinit var limas: ImageButton
    lateinit var kerucut: ImageButton
    lateinit var tabung: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        kubus = findViewById(R.id.kubus)
        kubus.setOnClickListener(this)
        balok = findViewById(R.id.balok)
        balok.setOnClickListener(this)
        bola = findViewById(R.id.bola)
        bola.setOnClickListener(this)
        prisma = findViewById(R.id.prisma)
        prisma.setOnClickListener(this)
        limas = findViewById(R.id.limas)
        limas.setOnClickListener(this)
        kerucut = findViewById(R.id.kerucut)
        kerucut.setOnClickListener(this)
        tabung = findViewById(R.id.tabung)
        tabung.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.kubus -> run {
                val kubus = Intent(this@ThirdActivity, KubusActivity::class.java)
                startActivity(kubus)
            }
            R.id.balok -> run {
                val balok = Intent(this@ThirdActivity, BalokActivity::class.java)
                startActivity(balok)
            }
            R.id.bola -> run {
                val bola = Intent(this@ThirdActivity, BolaActivity::class.java)
                startActivity(bola)
            }
            R.id.prisma -> run {
                val prisma = Intent(this@ThirdActivity, PrismaActivity::class.java)
                startActivity(prisma)
            }
            R.id.limas -> run {
                val limas = Intent(this@ThirdActivity, LimasActivity::class.java)
                startActivity(limas)
            }
            R.id.kerucut -> run {
                val kerucut = Intent(this@ThirdActivity, KerucutActivity::class.java)
                startActivity(kerucut)
            }
            R.id.tabung -> run {
                val limas = Intent(this@ThirdActivity, TabungActivity::class.java)
                startActivity(limas)
            }
        }
    }
}