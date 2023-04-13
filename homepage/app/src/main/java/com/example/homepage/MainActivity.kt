package com.example.homepage

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_1 : Button = findViewById(R.id.btn_satu)
        btn_1.setOnClickListener(this)

        val btn_2 : Button = findViewById(R.id.btn_dua)
        btn_2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_satu -> {
                val dial_number = "082333852298"
                val intensatu = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $dial_number"))
                startActivity(intensatu)
            }
        }
        when(v.id){
            R.id.btn_dua -> {
                val url = "http://www.google.com/"
                val web = Intent(Intent.ACTION_VIEW)
                web.setData(Uri.parse(url))
                startActivity(web)
            }
        }
    }
}