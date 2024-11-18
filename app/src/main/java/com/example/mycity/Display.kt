package com.example.mycity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlaceDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_layout)

        val imageResId = intent.getIntExtra("imageResId", 0)
        val title = intent.getStringExtra("title")
        val caption = intent.getStringExtra("caption")

        val imageView: ImageView = findViewById(R.id.imageGoesHere)
        val titleTextView : TextView = findViewById(R.id.placeNameGoesHere)
        val captionTextView : TextView = findViewById(R.id.captionGoesHere)

        imageView.setImageResource(imageResId)
        titleTextView.text = title
        captionTextView.text = caption
    }
}
