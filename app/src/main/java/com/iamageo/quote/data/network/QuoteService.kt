package com.iamageo.quote.data.network

import com.iamageo.quote.core.RetrofitHelper
import com.iamageo.quote.data.model.Quote
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getRandomQuote(): Quote {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(QuoteAPIClient::class.java).getRandomQuote()
            response.body() ?: Quote("something went wrong, try again!", "")
        }
    }


}