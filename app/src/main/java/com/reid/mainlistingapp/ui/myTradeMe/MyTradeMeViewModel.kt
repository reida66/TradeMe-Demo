package com.reid.mainlistingapp.ui.myTradeMe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyTradeMeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the My Trade Me Fragment"
    }
    val text: LiveData<String> = _text
}