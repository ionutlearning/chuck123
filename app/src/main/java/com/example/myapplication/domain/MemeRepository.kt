package com.example.myapplication.domain

import com.example.myapplication.api.model.Meme

interface MemeRepository {

    suspend fun getMemes() : Meme
}