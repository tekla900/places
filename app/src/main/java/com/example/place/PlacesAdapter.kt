package com.example.places

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.place.R

class PlacesAdapter(private val places: List<places>)
    : RecyclerView.Adapter<PlacesAdapter.PlacesViewHolder>() {

    class PlacesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView: ImageView = itemView.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlacesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.new_activity, parent, false)
        return PlacesViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlacesViewHolder, position: Int) {

        val pl = places[position]

        val currentUrl: String = pl.url

        Glide.with(holder.imageView.context)
            .load(currentUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .centerCrop()
            .into(holder.imageView)

    }

    override fun getItemCount(): Int = places.size

}