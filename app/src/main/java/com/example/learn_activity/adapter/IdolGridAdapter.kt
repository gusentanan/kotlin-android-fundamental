package com.example.learn_activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.learn_activity.R
import com.example.learn_activity.model.Idol

class IdolGridAdapter(private val listOfIdol: ArrayList<Idol>): RecyclerView.Adapter<IdolGridAdapter.GridViewHolder>() {

    inner class GridViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgGrid: ImageView = itemView.findViewById(R.id.img_grid_idol)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_idol, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        var list = listOfIdol[position]
        Glide.with(holder.itemView.context)
            .load(list.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgGrid)
    }

    override fun getItemCount(): Int {
        return listOfIdol.size
    }

}