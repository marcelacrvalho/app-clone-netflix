package com.example.netflix.main.activities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix.R
import com.example.netflix.utils.models.Movie

class MainAdapter(private val movies: List<Movie>): RecyclerView.Adapter<MainAdapter.MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
       val currentMovie = movies[position]
        holder.bind(currentMovie)
    }
    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movie: Movie) {
            val tvMovie: TextView = itemView.findViewById(R.id.tv_movie)
            tvMovie.text = movie.title
        }
    }
}
