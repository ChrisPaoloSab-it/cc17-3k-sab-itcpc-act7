package com.example.mycity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class RestaurantActivity: AppCompatActivity() {

    data class Display(val imageResId: Int, val title: String, val caption: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.restaurant_layout, null, false)
        setContentView(view)

        val restaurantItems = listOf(
            Display(
                R.drawable.restvizcos,
                R.string.restaurant1.toString(),
                R.string.vizcosText.toString()
            ),
            Display(
                R.drawable.restred,
                R.string.restaurant2.toString(),
                R.string.rustikzText.toString()
            ),
            Display(
                R.drawable.restgulay,
                R.string.restaurant3.toString(),
                R.string.gulayText.toString()
            )
        )

        val restaurant1: ImageView = findViewById(R.id.restaurant1Image)
        val restaurant2: ImageView = findViewById(R.id.restaurant2Image)
        val restaurant3: ImageView = findViewById(R.id.restaurant3Image)

        restaurant1.setOnClickListener {
            val place1 = restaurantItems.find {
                it.imageResId == R.drawable.restvizcos
            }
            val intent = Intent(this, PlaceDetailsActivity::class.java)
            intent.putExtra("imageResId", place1?.imageResId)
            intent.putExtra("title", resources.getString(R.string.restaurant1))
            intent.putExtra("caption", resources.getString(R.string.vizcosText))
            startActivity(intent)
        }

            restaurant2.setOnClickListener {
                val place2 = restaurantItems.find {
                    it.imageResId == R.drawable.restred
                }
                val intent = Intent(this, PlaceDetailsActivity::class.java)
                intent.putExtra("imageResId", place2?.imageResId)
                intent.putExtra("title", resources.getString(R.string.restaurant2))
                intent.putExtra("caption", resources.getString(R.string.rustikzText))
                startActivity(intent)
            }

        restaurant3.setOnClickListener {
            val place3 = restaurantItems.find {
                it.imageResId == R.drawable.restgulay
            }
            val intent = Intent(this, PlaceDetailsActivity::class.java)
            intent.putExtra("imageResId", place3?.imageResId)
            intent.putExtra("title", resources.getString(R.string.restaurant3))
            intent.putExtra("caption", resources.getString(R.string.gulayText))
            startActivity(intent)
            }
        }
    }
