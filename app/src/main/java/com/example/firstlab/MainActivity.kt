package com.example.firstlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.Toast
import com.example.firstlab.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener { // Your code to handle the button click event goes here
            // For example, you can display a toast message:
            Toast.makeText(applicationContext, "Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }

}