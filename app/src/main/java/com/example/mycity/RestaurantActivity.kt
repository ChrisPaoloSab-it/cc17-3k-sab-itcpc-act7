package com.example.mycity

import android.os.Bundle

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class RestaurantActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.restaurant_layout, null, false)
        setContentView(view)
    }
}