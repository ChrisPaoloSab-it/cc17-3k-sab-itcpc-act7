package com.example.mycity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ShoppingActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.shopping_layout, null, false)
        setContentView(view)
    }

}
