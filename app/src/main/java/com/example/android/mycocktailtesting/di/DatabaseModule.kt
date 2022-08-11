package com.example.android.mycocktailtesting.di

import android.content.Context
import androidx.room.Room
import com.example.android.mycocktailtesting.di.database.DrinkDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): DrinkDatabase {
        return Room.databaseBuilder(
            appContext.applicationContext,
            DrinkDatabase::class.java,
            "drinks"
        ).build()
    }
}