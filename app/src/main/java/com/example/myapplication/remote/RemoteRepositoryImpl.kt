package com.example.myapplication.remote

import com.example.myapplication.api.ChuckService
import com.example.myapplication.api.model.Meme
import com.example.myapplication.domain.MemeRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RemoteRepositoryImpl @Inject constructor(private val service: ChuckService) : MemeRepository {

    override suspend fun getMemes(): Meme =
        withContext(Dispatchers.IO) {
            service.meme()
        }

}