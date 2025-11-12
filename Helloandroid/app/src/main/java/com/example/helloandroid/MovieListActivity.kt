package com.example.helloandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        val movies = listOf(
            Movie("Avatar", "android.resource://${packageName}/${R.raw.avatar}"),
            Movie("Titanic", "android.resource://${packageName}/${R.raw.titanic}"),
            Movie("Inception", "android.resource://${packageName}/${R.raw.inception}")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MovieAdapter(movies)
    }
}

data class Movie(val name: String, val videoUrl: String)
