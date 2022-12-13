package com.reid.mainlistingapp.Adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.reid.mainlistingapp.Models.Listing
import com.reid.mainlistingapp.R
import com.reid.mainlistingapp.ViewHolder.ListingViewHolder


class ListingAdapter(private val context: Context) : RecyclerView.Adapter<ListingViewHolder>() {
    private var recyclerView: RecyclerView? = null
    private var selectedIndex: Int = RecyclerView.NO_POSITION
    var onSelect: (Listing) -> Unit = {}
    var onNothingSelected: () -> Unit = {}


    init {

    }

    var listingList: List<Listing> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListingViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.listing_row_item, parent, false);
        view.setOnClickListener {
            Toast.makeText(
                context,
                "Hello There, Listing View to be implemented",
                Toast.LENGTH_SHORT
            ).show()
        }
        return ListingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListingViewHolder, position: Int) {
        holder.price.text = listingList[position].PriceDisplay.toString()
        holder.region.text = listingList[position].Region
        holder.title.text = listingList[position].Title
        if (listingList[position].HasBuyNow) {
            holder.buyNowPrice.text = String.format("$%.2f",listingList[position].BuyNowPrice )
            holder.buyNow.text = "Buy Now"
        }
        if (listingList[position].PictureHref != null) {
            Glide.with(context).load(listingList[position].PictureHref).into(holder.mainPhoto);
        }
    }


    override fun getItemCount(): Int {
        return listingList.size
    }

}