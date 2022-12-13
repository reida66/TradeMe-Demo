package com.reid.mainlistingapp.TradeMeService

import com.reid.mainlistingapp.Models.LatestListingResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface TradeMeListingAPIInterface {

    @Headers(
        "Authorization: OAuth oauth_consumer_key=\"A1AC63F0332A131A78FAC304D007E7D1\"," +
                "oauth_signature_method=\"PLAINTEXT\",oauth_timestamp=\"1511177219\"," +
                "oauth_nonce=\"Wa7hrTHqltg\",oauth_version=\"1.0\"," +
                "oauth_signature=\"EC7F18B17A062962C6930A8AE88B16C7%26\""
    )
    @GET("listings/latest.json")
    suspend fun getListings(
        @Query("rows") rows: Int = 20,
        @Query("sort_order") sortOrder: String = "ExpiryDesc",
        @Query("listed_as") listedAs: String = "Auctions",
    ): Response<LatestListingResponse>


}