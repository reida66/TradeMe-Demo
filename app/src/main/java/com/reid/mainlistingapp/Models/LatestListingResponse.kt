package com.reid.mainlistingapp.Models

data class LatestListingResponse(
    val TotalCount: String,
    val TotalCountTruncated: String,
    val Page: String,
    val PageSize: String,
    val List: List<Listing>
) {


}