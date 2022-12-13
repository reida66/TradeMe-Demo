package com.reid.mainlistingapp.ui.watchList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WatchlistViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Watchlist Fragment"
    }
    val text: LiveData<String> = _text
}