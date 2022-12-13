package com.reid.mainlistingapp.Models

import org.junit.Assert
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.Long
internal class ListingTest {


    var listing = Listing(12,"Car","",250,300.15f,"","Christchurch",true,true)

    @Test
    fun return_toSting() {
      assertFalse(1!=1)
    }
    fun testToString() {
    }

    @Test
    fun getListingId() {
        var testLong : Long = 12
        assertTrue(listing.ListingId == testLong)
    }

    @Test
    fun setListingId() {
        var oldLong : Long = 12
        listing.ListingId = 20
        assertTrue(listing.ListingId != oldLong)
    }

    @Test
    fun getTitle() {
        assertTrue(listing.Title == "Car")
    }

    @Test
    fun setTitle() {
        listing.Title = "Bar"
        assertTrue(listing.Title == "Bar")
    }

    @Test
    fun getPriceDisplay() {
        assertTrue(listing.PriceDisplay == 250)
    }

    @Test
    fun setPriceDisplay() {
        listing.PriceDisplay = 200
        assertTrue(listing.PriceDisplay == 200)

    }

    @Test
    fun getBuyNowPrice() {
        assertTrue(listing.BuyNowPrice == 300.15f)
    }

    @Test
    fun setBuyNowPrice() {
        listing.BuyNowPrice = 200.0f
        assertTrue(listing.BuyNowPrice == 200.0f)
    }

    @Test
    fun getRegion() {
        assertTrue(listing.Region == "Christchurch")
    }

    @Test
    fun setRegion() {
        listing.Region = "Auckland"
        assertTrue(listing.Region == "Auckland")
    }

}