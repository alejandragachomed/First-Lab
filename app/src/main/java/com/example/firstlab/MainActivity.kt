package com.example.firstlab

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.Toast
import com.example.firstlab.R
import android.widget.TextView
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val textView2 = findViewById<TextView>(R.id.textView2)
        button.setOnClickListener {
            Toast.makeText(applicationContext, "Welcome again!", Toast.LENGTH_SHORT).show()
            textView.setTextColor(Color.BLUE)
        }
        button2.setOnClickListener {
            Toast.makeText(applicationContext, "This is Android Studio!", Toast.LENGTH_SHORT).show()
            textView2.setTextColor(Color.MAGENTA)
        }
    }

}