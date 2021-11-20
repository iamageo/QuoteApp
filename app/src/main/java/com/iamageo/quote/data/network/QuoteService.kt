package com.iamageo.quote.data.network

import com.iamageo.quote.core.RetrofitHelper
import com.iamageo.quote.data.model.Quote
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class QuoteService @Inject constructor(private val apiClient: QuoteAPIClient) {


    suspend fun getRandomQuote(): Quote {
        return withContext(Dispatchers.IO) {
            val response = apiClient.getRandomQuote()
            response.body() ?: Quote("something went wrong, try again!", "")
        }
    }


}