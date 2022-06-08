package com.example.myapplication.di

import com.example.myapplication.domain.MemeRepository
import com.example.myapplication.remote.RemoteRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {

    @Binds
    abstract fun provideMyFirstClass(repo: RemoteRepositoryImpl): MemeRepository
}

