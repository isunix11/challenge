package com.example.androiddata.ui.main

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androiddata.R
import com.example.androiddata.data.Picture

class MainRecyclerAdapter(val context: Context,
                          val profileimages: List<Picture>,
                          val itemListener: PictureItemListener):
    RecyclerView.Adapter<MainRecyclerAdapter.ViewHolder>()

{
    override fun getItemCount() = profileimages.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.monster_grid_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val picture = profileimages[position]
        with(holder) {
            nameText?.let {
                it.text = picture.user.name
                it.contentDescription = picture.user.name
            }
//            ratingBar?.rating = monster.scariness.toFloat()
            Glide.with(context)
                .load(picture.user.profile_image.large)
                .into(pictureImage)

            val Tag = "tag"

            Log.i(Tag, picture.user.profile_image.toString())
            holder.itemView.setOnClickListener{
                itemListener.onMonsterItemClick(picture)
            }
        }
    }

    inner class ViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView) {
        val nameText = itemView.findViewById<TextView>(R.id.nameText)
        val pictureImage = itemView.findViewById<ImageView>(R.id.pictureImage)
    }

    interface PictureItemListener {
        fun onMonsterItemClick(profileimage: Picture)
    }
}