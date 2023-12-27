package com.example.mvvmdemo.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmdemo.model.Product
import com.example.mvvmdemo.repository.ProductRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: ProductRepository) : ViewModel() {
    val productsLiveData : LiveData<List<Product>>
        get() = repository.products

    init {
        viewModelScope.launch {
            delay(10000)
            repository.getProducts()
        }
    }


}