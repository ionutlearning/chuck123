package com.example.myapplication.api

import com.example.myapplication.api.model.Meme
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET


interface ChuckService {
    @GET("jokes/random")
    suspend fun meme(): Meme
}