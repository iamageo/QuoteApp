package com.iamageo.quote.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iamageo.quote.data.model.Quote
import com.iamageo.quote.domain.QuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel: ViewModel() {

    val quoteModel = MutableLiveData<Quote>()

    var getQuote = QuoteUseCase()

    fun onCreate() {

        viewModelScope.launch {
            quoteModel.postValue(getQuote()!!)
        }
    }

    fun randomQuote() {
        onCreate()
    }


}