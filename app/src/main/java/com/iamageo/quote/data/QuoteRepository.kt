package com.iamageo.quote.data

import com.iamageo.quote.data.model.Quote
import com.iamageo.quote.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getRandomQuote() : Quote {
        return api.getRandomQuote()
    }
}