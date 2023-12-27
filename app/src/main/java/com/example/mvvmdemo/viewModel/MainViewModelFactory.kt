package com.example.mvvmdemo.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemo.repository.ProductRepository
import retrofit2.Converter.Factory
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private  val  repository: ProductRepository) :ViewModelProvider.Factory  {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository)as T
    }
}