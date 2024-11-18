package com.example.mycity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class KidActivity: AppCompatActivity() {

    data class Display(val imageResId: Int, val title: String, val caption: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.kid_friendly_layout, null, false)
        setContentView(view)

        val kidItems = listOf(
            Display(R.drawable.kidspark, R.string.kids1.toString(), R.string.parkText.toString()),
            Display(R.drawable.kidslibrary, R.string.kids2.toString(), R.string.libraryText.toString()),
            Display(R.drawable.kidsmuseum, R.string.kids3.toString(), R.string.museumText.toString())
        )

        val kid1: ImageView = findViewById(R.id.kids1Image)
        val kid2: ImageView = findViewById(R.id.kids2Image)
        val kid3: ImageView = findViewById(R.id.kids3Image)

        kid1.setOnClickListener {
            val place1 = kidItems.find {
                it.imageResId == R.drawable.kidspark
            }
            val intent = Intent(this, PlaceDetailsActivity::class.java)
            intent.putExtra("imageResId", place1?.imageResId)
            intent.putExtra("title", resources.getString(R.string.kids1))
            intent.putExtra("caption", resources.getString(R.string.parkText))
            startActivity(intent)
        }

        kid2.setOnClickListener {
            val place2 = kidItems.find {
                it.imageResId == R.drawable.kidslibrary
            }
            val intent = Intent(this, PlaceDetailsActivity::class.java)
            intent.putExtra("imageResId", place2?.imageResId)
            intent.putExtra("title", resources.getString(R.string.kids2))
            intent.putExtra("caption", resources.getString(R.string.libraryText))
            startActivity(intent)
        }

        kid3.setOnClickListener {
            val place3 = kidItems.find {
                it.imageResId == R.drawable.kidsmuseum
            }
            val intent = Intent(this, PlaceDetailsActivity::class.java)
            intent.putExtra("imageResId", place3?.imageResId)
            intent.putExtra("title", resources.getString(R.string.kids3))
            intent.putExtra("caption", resources.getString(R.string.museumText))
            startActivity(intent)
        }
    }
}
