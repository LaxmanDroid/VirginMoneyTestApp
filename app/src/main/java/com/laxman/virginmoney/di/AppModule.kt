package com.laxman.virginmoney.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.laxman.virginmoney.constants.Constants.BASE_URL
import com.laxman.virginmoney.data.remote.ApiData
import com.laxman.virginmoney.data.remote.ApiService
import com.laxman.virginmoney.data.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    fun provideGson(): Gson = GsonBuilder().create()

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Singleton
    @Provides
    fun providePeopleApiData(apiService: ApiService) = ApiData(apiService)


    @Singleton
    @Provides
    fun provideRepository(remoteData: ApiData) =
        Repository(remoteData)
}