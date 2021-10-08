package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var bangundatar: ImageButton
    lateinit var bangunruang: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bangundatar = findViewById(R.id.bdatar)

        bangundatar.setOnClickListener(this)
        bangunruang = findViewById(R.id.cardBRuang)

        bangunruang.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.bdatar -> run {
                val bangundatar = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(bangundatar)
            }
            R.id.cardBRuang -> run {
                val BangunRuang = Intent(this@MainActivity, ThirdActivity::class.java)
                startActivity(BangunRuang)
            }
        }
    }
    fun quitApp(view: View) {
        this@MainActivity.finish()
        exitProcess(0)
    }
}