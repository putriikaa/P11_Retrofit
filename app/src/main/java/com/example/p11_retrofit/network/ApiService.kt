package com.example.p11_retrofit.network

import retrofit2.Call
import com.example.p11_retrofit.model.RickModel
import retrofit2.http.GET

interface ApiService {

    @GET("character")
    fun getRickCharacter(): Call<RickModel>
}