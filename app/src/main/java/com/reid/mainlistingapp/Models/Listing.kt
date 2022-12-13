package com.reid.mainlistingapp.Models

data class Listing(
    var ListingId: Long,
    var Title: String,
    var Category: String,
    var PriceDisplay: Number,
    var BuyNowPrice: Float,
    var PictureHref: String,
    var Region: String,
    var IsClassified: Boolean,
    var HasBuyNow: Boolean,

) {



    override fun toString(): String {
        return "Listing(ListingId=$ListingId, Title='$Title', Category='$Category', PriceDisplay=$PriceDisplay, BuyNowPrice=$BuyNowPrice, PictureHref='$PictureHref', Region='$Region', IsClassified=$IsClassified, HasBuyNow=$HasBuyNow)"
    }

}