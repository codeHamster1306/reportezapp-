package com.example.reportezapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        installSplashScreen()


        val signin = findViewById<Button>(R.id.signin)
        signin.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val createacc = findViewById<Button>(R.id.createacc)
        createacc.setOnClickListener {
            val intent = Intent(this, newAcc::class.java)
            startActivity(intent)
        }
    }
}
