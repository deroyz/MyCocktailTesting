package com.example.android.mycocktailtesting.di.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.android.mycocktailtesting.di.database.*
import com.example.android.mycocktailtesting.di.network.*
import com.example.android.mycocktailtesting.domain.Drink
import com.example.android.mycocktailtesting.domain.asDatabaseModelFavoriteDrink
import dagger.hilt.EntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DrinksRepository @Inject constructor(private val database: DrinkDatabase) {

    val filterList: List<String> = CocktailDatabaseFilter.values().map { it.value }
    @Inject val cocktailDBService: CocktailDBService

    val randomDrinks: LiveData<List<Drink>> =
        Transformations.map(database.drinkDao.getRandomDrinks()) {
            it.asDomainModelRandomDrink()
        }

    val popularDrinks: LiveData<List<Drink>> =
        Transformations.map(database.drinkDao.getPopularDrinks()) {
            it.asDomainModelPopularDrink()
        }

    val latestDrinks: LiveData<List<Drink>> =
        Transformations.map(database.drinkDao.getLatestDrinks()) {
            it.asDomainModelLatestDrink()
        }

    val favoriteDrinks: LiveData<List<Drink>> =
        Transformations.map(database.drinkDao.getFavoriteDrinks()) {
            it.asDomainModelFavoriteDrink()
        }

    suspend fun refreshRandomDrinks() {
        withContext(Dispatchers.IO) {
            val randomCocktails = cocktailDBService.getRandomCocktails().await()
            database.drinkDao.insertAllRandomDrinks(*randomCocktails.asDatabaseModelRandomDrink())
        }
    }

    suspend fun refreshPopularDrinks() {
        withContext(Dispatchers.IO) {
            val popularCocktails = cocktailDBService.getPopularCocktails().await()
            database.drinkDao.insertAllPopularDrinks(*popularCocktails.asDatabaseModelPopularDrink())
        }
    }

    suspend fun refreshLatestDrinks() {
        withContext(Dispatchers.IO) {
            val latestCocktails = cocktailDBService.getLatestCocktails().await()
            database.drinkDao.insertAllLatestDrinks(*latestCocktails.asDatabaseModelLatestDrink())
        }
    }

    // Favorite Check, Insert, Delete
    suspend fun checkIsFavorite(idDrink: Double): Boolean {
        return withContext(Dispatchers.IO) {
            database.drinkDao.checkFavoriteById(idDrink)
        }
    }

    suspend fun insertFavoriteDrink(drink: Drink) {
        withContext(Dispatchers.IO) {
            database.drinkDao.insertFavoriteDrink(drink.asDatabaseModelFavoriteDrink())
        }
    }

    suspend fun deleteFavoriteDrink(idDrink: Double) {
        withContext(Dispatchers.IO) {
            database.drinkDao.deleteFavoriteDrink(idDrink)
        }
    }

}

