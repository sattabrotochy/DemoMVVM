package com.example.mvvmdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemo.viewModel.MainViewModel
import com.example.mvvmdemo.viewModel.MainViewModelFactory
import javax.inject.Inject


class MainActivity : AppCompatActivity() {


     lateinit var mainViewModel: MainViewModel

    @Inject
     lateinit var mainViewModelFactory: MainViewModelFactory
     private val products: TextView
        get() = findViewById(R.id.product)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as FakerApplication).applicationComponent.inject(this)

        mainViewModel = ViewModelProvider(this,mainViewModelFactory)[MainViewModel::class.java]
        mainViewModel.productsLiveData.observe(this, Observer {
            products.text =  it.joinToString { x -> x.title + "\n\n" }
        })
    }
}