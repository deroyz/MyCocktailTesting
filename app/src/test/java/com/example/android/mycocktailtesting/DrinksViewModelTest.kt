package com.example.android.mycocktailtesting

import android.app.Application
import com.example.android.mycocktailtesting.di.database.getDatabase
import com.example.android.mycocktailtesting.drinks.DrinksViewModel
import com.example.android.mycocktailtesting.di.repository.DrinksRepository
import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DrinksViewModelTest {

    private lateinit var drinksViewModel: DrinksViewModel


    @Mock
    lateinit var application: Application

    @Before
    fun setup(){
        drinksViewModel = DrinksViewModel(application)

        database = getDatabase(application)
          drinksRepository = DrinksRepository(database)
    }
}