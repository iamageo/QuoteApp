package com.iamageo.quote.data.network

import com.iamageo.quote.data.model.Quote
import retrofit2.Response
import retrofit2.http.GET

interface QuoteAPIClient {

    @GET("random")
    suspend fun getRandomQuote(): Response<Quote>

}