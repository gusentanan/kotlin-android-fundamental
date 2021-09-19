package com.example.learn_activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.learn_activity.R
import com.example.learn_activity.model.Idol

class IdolCardAdapter(private val listOfIdol: ArrayList<Idol>): RecyclerView.Adapter<IdolCardAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var cardIdolName: TextView = itemView.findViewById(R.id.tv_card_name)
        var cardIdolDetail: TextView = itemView.findViewById(R.id.tv_card_detail)
        var cardIdolPhoto: ImageView = itemView.findViewById(R.id.img_card_idol)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_card_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_card_share)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_idol, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        var list = listOfIdol[position]
        Glide.with(holder.itemView.context)
            .load(list.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.cardIdolPhoto)

        holder.cardIdolName.text = list.name
        holder.cardIdolDetail.text = list.detail

        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context,  "Favorite " + listOfIdol[holder.absoluteAdapterPosition].name, Toast.LENGTH_SHORT).show()}
        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context,  "Share " + listOfIdol[holder.absoluteAdapterPosition].name, Toast.LENGTH_SHORT).show()}
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context,  "You Choose " + listOfIdol[holder.absoluteAdapterPosition].name, Toast.LENGTH_SHORT).show()}
    }

    override fun getItemCount(): Int {
        return listOfIdol.size
    }



}