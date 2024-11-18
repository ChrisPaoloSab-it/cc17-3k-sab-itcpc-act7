package com.example.mycity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class HealthActivity: AppCompatActivity() {

    data class Display(val imageResId: Int, val title: String, val caption: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.health_destination_layout, null, false)
        setContentView(view)

        val healthItems = listOf(
            Display(
                R.drawable.spanorthhaven,
                R.string.health1.toString(),
                R.string.northHavenText.toString()
            ),
            Display(
                R.drawable.humannature,
                R.string.health2.toString(),
                R.string.humanNatureText.toString()
            ),
            Display(
                R.drawable.tingi,
                R.string.health3.toString(),
                R.string.tingiText.toString()
            )
            )

        val health1: ImageView = findViewById(R.id.health1Image)
        val health2: ImageView = findViewById(R.id.health2Image)
        val health3: ImageView = findViewById(R.id.health3Image)

        health1.setOnClickListener {
            val place1 = healthItems.find {
                it.imageResId == R.drawable.spanorthhaven
            }
                val intent = Intent(this, PlaceDetailsActivity::class.java)
                    intent.putExtra("imageResId", place1?.imageResId)
                    intent.putExtra("title", resources.getString(R.string.health1))
                    intent.putExtra("caption", resources.getString(R.string.northHavenText))
                    startActivity(intent)
        }

        health2.setOnClickListener {
            val place2 = healthItems.find {
                it.imageResId == R.drawable.humannature
            }
                val intent = Intent(this, PlaceDetailsActivity::class.java)
                    intent.putExtra("imageResId", place2?.imageResId)
                    intent.putExtra("title", resources.getString(R.string.health2))
                    intent.putExtra("caption", resources.getString(R.string.humanNatureText))
                    startActivity(intent)
        }

        health3.setOnClickListener {
            val place3 = healthItems.find {
            it.imageResId == R.drawable.tingi
        }
            val intent = Intent(this, PlaceDetailsActivity::class.java)
            intent.putExtra("imageResId", place3?.imageResId)
            intent.putExtra("title", resources.getString(R.string.health3))
            intent.putExtra("caption", resources.getString(R.string.tingiText))
            startActivity(intent)
        }
    }
}
