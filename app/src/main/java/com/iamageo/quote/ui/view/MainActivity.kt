package com.iamageo.quote.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.iamageo.quote.data.model.Quote
import com.iamageo.quote.databinding.ActivityMainBinding
import com.iamageo.quote.ui.viewmodel.QuoteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val viewModel: QuoteViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel.onCreate()

        setupTouchView()
        setupObserver()
    }

    private fun setupTouchView() {
        binding.viewContainer.setOnClickListener {
            viewModel.randomQuote()
        }
    }

    private fun setupObserver() {
        viewModel.quoteModel.observe(this, { currentQuote ->
            setupText(currentQuote)
        })
    }

    private fun setupText(quote: Quote) {
        binding.tvQuote.text = quote.content
        binding.tvAuthor.text = quote.author
    }
}