package com.reid.mainlistingapp.ViewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reid.mainlistingapp.R

class ListingViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    var title: TextView = view.findViewById(R.id.Title)
    var price: TextView = view.findViewById(R.id.Price)
    var region: TextView = view.findViewById(R.id.Region)
    var mainPhoto: ImageView = view.findViewById(R.id.MainPhoto)
    var buyNow : TextView = view.findViewById(R.id.BuyNow)
    var buyNowPrice : TextView = view.findViewById(R.id.BuyNowPrice)


}