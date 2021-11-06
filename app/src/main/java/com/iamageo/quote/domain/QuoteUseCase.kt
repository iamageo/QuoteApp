package com.iamageo.quote.domain

import com.iamageo.quote.data.QuoteRepository
import com.iamageo.quote.data.model.Quote

class QuoteUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke(): Quote = repository.getRandomQuote()

}