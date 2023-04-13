package com.example.homepage

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_1 = findViewById(R.id.btn_satu)
        btn_1.setOnClickListener(this)
        val btn_2 : Button = findViewById(R.id.btn_dua)
        btn_2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_satu ->{
                val iniinten = Intent(this@MainActivity,deskripsi::class.java)
            startActivity(iniinten)
            }
        }
        when(v.id){
            R.id.btn_dua -> {
                val url = packageManager.getLaunchIntentForPackage("com.google.ar.lens")
                startActivity(url)
            }
        }
    }
}