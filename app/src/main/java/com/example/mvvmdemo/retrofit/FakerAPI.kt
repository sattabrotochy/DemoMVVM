package com.example.mvvmdemo.retrofit

import com.example.mvvmdemo.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {


    @GET("products")
   suspend fun  getProducts() :Response<List<Product>>

}