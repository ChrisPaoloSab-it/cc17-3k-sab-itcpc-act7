package com.example.mycity

import android.os.Bundle
import android.view.View.inflate
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CoffeeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.coffee_shops_layout, null, false)
        setContentView(view)
    }
}