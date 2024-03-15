package com.example.retrofitapicall.api

import com.example.retrofitapicall.model.Student
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("Pass the get url here")
    fun getService() :Call<Student>
}