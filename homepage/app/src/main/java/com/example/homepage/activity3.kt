package com.example.homepage

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        handleIntent(intent)
    }
    private fun handleIntent(intent: Intent?) {
        val action = intent?.action
        val data = intent?.dataString
        if (Intent.ACTION_VIEW == action && data != null) {
            // do something with the data
            val webpage: Uri = Uri.parse("http://www.google.com")
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }

        }
    }
}