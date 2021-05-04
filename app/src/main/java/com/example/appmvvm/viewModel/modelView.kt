package com.example.appmvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appmvvm.model.modelData
import com.example.appmvvm.model.modelProvider

class modelView : ViewModel(){

    val quoteModel = MutableLiveData<modelData>()

    fun randomQuote() {
        val currentQuote = modelProvider.random()
        quoteModel.postValue(currentQuote)
    }
}