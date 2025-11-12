package com.example.helloandroid

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val imgCat = findViewById<ImageView>(R.id.imgCat)
        val imgDog = findViewById<ImageView>(R.id.imgDog)
        val imgBird = findViewById<ImageView>(R.id.imgBird)
        val btnAddImages = findViewById<Button>(R.id.btnAddImages)

        btnAddImages.setOnClickListener {
            // Егер суреттер бар болса, drawable ішінен жүкте
            try {
                imgCat.setImageResource(R.drawable.cat)
                imgDog.setImageResource(R.drawable.dog)
                imgBird.setImageResource(R.drawable.bird)
            } catch (e: Exception) {
                // Егер суреттер жоқ болса, жай түсіндіру
                btnAddImages.text = "⚠️ Алдымен суреттерді drawable қалтасына қос!"
            }
        }
    }
}
