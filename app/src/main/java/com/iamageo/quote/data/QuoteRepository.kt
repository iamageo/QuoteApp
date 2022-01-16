package com.iamageo.quote.data

import com.iamageo.quote.data.model.Quote
import com.iamageo.quote.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val api: QuoteService) {

    suspend fun getRandomQuote() : Quote {
        return api.getRandomQuote()
    }
}