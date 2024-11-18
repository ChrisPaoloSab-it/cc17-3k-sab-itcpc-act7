package com.example.mycity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val coffeeLink = findViewById<ImageView>(R.id.coffeeCategoryImage)
        coffeeLink.setOnClickListener {
            val intent = Intent(this, CoffeeActivity::class.java)
            startActivity(intent)
        }

        val restoLink = findViewById<ImageView>(R.id.restaurantCategoryImage)
        restoLink.setOnClickListener {
            val intent = Intent(this, RestaurantActivity::class.java)
            startActivity(intent)
        }

        val kidLink = findViewById<ImageView>(R.id.kidCategoryImage)
        kidLink.setOnClickListener {
            val intent = Intent(this, KidActivity::class.java)
            startActivity(intent)
        }

        val spaLink = findViewById<ImageView>(R.id.healthCategoryImage)
        spaLink.setOnClickListener {
            val intent = Intent(this, HealthActivity::class.java)
            startActivity(intent)
        }

        val shopsLink = findViewById<ImageView>(R.id.shoppingCategoryImage)
        shopsLink.setOnClickListener {
            val intent = Intent(this, ShoppingActivity::class.java)
            startActivity(intent)
        }
    }
}