package com.example.mycity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class ShoppingActivity: AppCompatActivity() {

    data class Display(val imageResId: Int, val title: String, val description: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.shopping_layout, null, false)
        setContentView(view)

        val shoppingItems = listOf (
            Display(R.drawable.pvmall, R.string.shop1.toString(), R.string.pvmallText.toString()),
            Display(R.drawable.abanaomall, R.string.shop2.toString(),
                R.string.abanaoText.toString()
            ),
            Display(R.drawable.centermall, R.string.shop3.toString(),
                R.string.centermallText.toString()
            )
        )

            val shop1: ImageView = findViewById(R.id.shop1Image)
        shop1.setOnClickListener {
            val mall1 = shoppingItems.find {
                it.imageResId == R.drawable.pvmall
            }

            val intent = Intent(this, ShopDetailsActivity::class.java)
            intent.putExtra("imageResId", mall1?.imageResId)
            intent.putExtra("title", resources.getString(R.string.shop1))
            intent.putExtra("caption", resources.getString(R.string.pvmallText))
            startActivity(intent)

        }
    }
}
