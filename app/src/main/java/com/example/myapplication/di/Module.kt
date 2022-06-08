package com.example.myapplication.di

import com.example.myapplication.api.ChuckService
import com.example.myapplication.domain.MemeRepository
import com.example.myapplication.remote.RemoteRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ActivityComponent::class)
object Module {

    @Provides
    fun provideChuckService(
        // Potential dependencies of this type
    ): ChuckService {
        return Retrofit.Builder()
            .baseUrl("https://api.chucknorris.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ChuckService::class.java)
    }
}
