package com.example.helloandroid

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val items: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tvMovieName)
        val btnPlay: Button = view.findViewById(R.id.btnPlay)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = items[position]
        holder.tvName.text = movie.name
        holder.btnPlay.setOnClickListener {
            val intent = Intent(holder.itemView.context, VideoActivity::class.java)
            intent.putExtra("videoUrl", movie.videoUrl)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = items.size
}
