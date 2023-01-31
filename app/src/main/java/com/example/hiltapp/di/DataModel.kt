package com.example.hiltapp.di

import com.example.hiltapp.data.RepositoryImpl
import com.example.hiltapp.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModel {
    @Binds
    abstract fun getRepository(impl: RepositoryImpl): Repository
}