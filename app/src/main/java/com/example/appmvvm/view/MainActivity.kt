package com.example.appmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.appmvvm.R
import com.example.appmvvm.databinding.ActivityMainBinding
import com.example.appmvvm.viewModel.modelView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val dataViewModel:modelView by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataViewModel.quoteModel.observe(this, Observer {currentData ->
            binding.tvAuthor.text = currentData.author
            binding.tvQuote.text = currentData.quote
        })

        binding.viewContainer.setOnClickListener {
          dataViewModel.randomQuote()
        }
    }
}