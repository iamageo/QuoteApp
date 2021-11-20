package com.iamageo.quote.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iamageo.quote.data.model.Quote
import com.iamageo.quote.domain.QuoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(private val getQuote: QuoteUseCase): ViewModel() {

    val quoteModel = MutableLiveData<Quote>()

    fun onCreate() {

        viewModelScope.launch {
            quoteModel.postValue(getQuote()!!)
        }
    }

    fun randomQuote() {
        onCreate()
    }


}