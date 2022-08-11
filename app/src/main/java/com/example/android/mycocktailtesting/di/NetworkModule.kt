package com.example.android.mycocktailtesting.di

import com.example.android.mycocktailtesting.di.network.CocktailDBService
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    private const val BASE_URL = "https://www.thecocktaildb.com/api/json/v2/9973533/"

        @Provides
        @Singleton
        fun provideCocktailDbService(): CocktailDBService {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(
                    MoshiConverterFactory.create(
                        Moshi
                            .Builder()
                            .add(KotlinJsonAdapterFactory())
                            .build()
                    )
                )
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .build()
                .create(CocktailDBService::class.java)
        }
}