package com.example.retrofitapicall.retrofitObject

import com.example.retrofitapicall.api.ApiService
import com.example.retrofitapicall.model.Student
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
    private const val BASE_URL = "your base url...."

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiService : ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}