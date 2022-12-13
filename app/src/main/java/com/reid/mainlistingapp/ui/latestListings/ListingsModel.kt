package com.reid.mainlistingapp.ui.latestListings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListingsModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Listings Fragment"
    }
    val text: LiveData<String> = _text
}