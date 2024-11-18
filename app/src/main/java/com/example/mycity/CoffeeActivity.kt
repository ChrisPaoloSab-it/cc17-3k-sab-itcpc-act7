package com.example.mycity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CoffeeActivity: AppCompatActivity() {

    data class Display(val imageResId: Int, val title: String, val caption: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.coffee_shops_layout, null, false)
        setContentView(view)

        val coffeeItems = listOf (
            Display(R.drawable.coffee_beanstalk, R.string.coffee1.toString(), R.string.beanstalkText.toString()),
            Display(R.drawable.coffee_batirol, R.string.coffee2.toString(), R.string.batirolText.toString()),
                Display(R.drawable.coffee_sabaguio, R.string.coffee3.toString(), R.string.sabaguioText.toString())
        )
            val coffee1: ImageView = findViewById(R.id.coffeeShop1Image)
            val coffee2: ImageView = findViewById(R.id.coffeeShop2Image)
            val coffee3: ImageView = findViewById(R.id.coffeeShop3Image)

            coffee1.setOnClickListener {
                val coffeeShop1 = coffeeItems.find {
                    it.imageResId == R.drawable.coffee_beanstalk
                }

                val intent = Intent(this, PlaceDetailsActivity::class.java)
                intent.putExtra("imageResId", coffeeShop1?.imageResId)
                intent.putExtra("title", resources.getString(R.string.coffee1))
                intent.putExtra("caption", resources.getString(R.string.beanstalkText))
                startActivity(intent)

            }

        coffee2.setOnClickListener {
            val coffeeShop2 = coffeeItems.find {
                it.imageResId == R.drawable.coffee_batirol
            }
            val intent = Intent(this, PlaceDetailsActivity::class.java)
            intent.putExtra("imageResId", coffeeShop2?.imageResId)
            intent.putExtra("title", resources.getString(R.string.coffee2))
            intent.putExtra("caption", resources.getString(R.string.batirolText))
            startActivity(intent)
        }

        coffee3.setOnClickListener {
            val coffeeShop3 = coffeeItems.find {
                it.imageResId == R.drawable.coffee_sabaguio
            }
            val intent = Intent(this, PlaceDetailsActivity::class.java)
            intent.putExtra("imageResId", coffeeShop3?.imageResId)
            intent.putExtra("title", resources.getString(R.string.coffee3))
            intent.putExtra("caption", resources.getString(R.string.sabaguioText))
            startActivity(intent)

        }
    }
}