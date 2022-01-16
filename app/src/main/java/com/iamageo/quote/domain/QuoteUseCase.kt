package com.iamageo.quote.domain

import com.iamageo.quote.data.QuoteRepository
import com.iamageo.quote.data.model.Quote
import javax.inject.Inject

class QuoteUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): Quote = repository.getRandomQuote()

}