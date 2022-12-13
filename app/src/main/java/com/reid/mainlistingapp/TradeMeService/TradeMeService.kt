package com.reid.mainlistingapp.TradeMeService

import com.reid.mainlistingapp.Adaptor.ListingAdapter
import com.reid.mainlistingapp.Models.Listing
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object TradeMeService {

    private const val baseURL = "https://api.tmsandbox.co.nz/v1/"
    var currentListings: List<Listing> = mutableListOf()

    private fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun updateListings(adapter: ListingAdapter) {
        val listingApi =
            getInstance().create(TradeMeListingAPIInterface::class.java)
        GlobalScope.launch {
            val result = listingApi.getListings()
            currentListings = result.body()!!.List;
            adapter.listingList = currentListings
        }
        adapter.notifyDataSetChanged()
    }

    fun getListings(): List<Listing> {
        return this.currentListings
    }


}