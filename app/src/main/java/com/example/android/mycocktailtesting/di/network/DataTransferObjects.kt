package com.example.android.mycocktailtesting.di.network

import com.example.android.mycocktailtesting.di.database.DatabaseLatestDrink
import com.example.android.mycocktailtesting.di.database.DatabasePopularDrink
import com.example.android.mycocktailtesting.di.database.DatabaseRandomDrink
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NetworkDrinkContainer(val drinks: List<NetworkDrink>)

@JsonClass(generateAdapter = true)
data class NetworkDrink(
    val idDrink: Double,
    val strDrink: String,
    val strCategory: String,
    val strGlass: String,
    val strInstructions: String,
    val strDrinkThumb: String,
//    val strIngredient1: String?,
//    val strIngredient2: String?,
//    val strIngredient3: String?,
//    val strIngredient4: String?,
//    val strIngredient5: String?,
//    val strIngredient6: String?,
//    val strIngredient7: String?,
//    val strIngredient8: String?,
//    val strIngredient9: String?,
//    val strIngredient10: String?,
//    val strIngredient11: String?,
//    val strIngredient12: String?,
//    val strIngredient13: String?,
//    val strIngredient14: String?,
//    val strIngredient15: String?,
//    val strMeasure1: String?,
//    val strMeasure2: String?,
//    val strMeasure3: String?,
//    val strMeasure4: String?,
//    val strMeasure5: String?,
//    val strMeasure6: String?,
//    val strMeasure7: String?,
//    val strMeasure8: String?,
//    val strMeasure9: String?,
//    val strMeasure10: String?,
//    val strMeasure11: String?,
//    val strMeasure12: String?,
//    val strMeasure13: String?,
//    val strMeasure14: String?,
//    val strMeasure15: String?
)

/**
 * Convert Network results to database objects
 */
//fun NetworkDrinkContainer.asDomainModel(): List<Drink> {
//    return drinks.map {
//        Drink(
//            idDrink = it.idDrink,
//            strDrink = it.strDrink,
//            strCategory = it.strCategory,
//            strGlass = it.strGlass,
//            strInstructions = it.strInstructions,
//            strDrinkThumb = it.strDrinkThumb,
////            strIngredient1 = it.strIngredient1,
////            strIngredient2 = it.strIngredient2,
////            strIngredient3 = it.strIngredient3,
////            strIngredient4 = it.strIngredient4,
////            strIngredient5 = it.strIngredient5,
////            strIngredient6 = it.strIngredient6,
////            strIngredient7 = it.strIngredient7,
////            strIngredient8 = it.strIngredient8,
////            strIngredient9 = it.strIngredient9,
////            strIngredient10 = it.strIngredient10,
////            strIngredient11 = it.strIngredient11,
////            strIngredient12 = it.strIngredient12,
////            strIngredient13 = it.strIngredient13,
////            strIngredient14 = it.strIngredient14,
////            strIngredient15 = it.strIngredient15,
////            strMeasure1 = it.strMeasure1,
////            strMeasure2 = it.strMeasure2,
////            strMeasure3 = it.strMeasure3,
////            strMeasure4 = it.strMeasure4,
////            strMeasure5 = it.strMeasure5,
////            strMeasure6 = it.strMeasure6,
////            strMeasure7 = it.strMeasure7,
////            strMeasure8 = it.strMeasure8,
////            strMeasure9 = it.strMeasure9,
////            strMeasure10 = it.strMeasure10,
////            strMeasure11 = it.strMeasure11,
////            strMeasure12 = it.strMeasure12,
////            strMeasure13 = it.strMeasure13,
////            strMeasure14 = it.strMeasure14,
////            strMeasure15 = it.strMeasure15
//        )
//    }
//}

fun NetworkDrinkContainer.asDatabaseModelRandomDrink(): Array<DatabaseRandomDrink> {
    return drinks.map {
        DatabaseRandomDrink(
            idDrink = it.idDrink,
            strDrink = it.strDrink,
            strCategory = it.strCategory,
            strGlass = it.strGlass,
            strInstructions = it.strInstructions,
            strDrinkThumb = it.strDrinkThumb,
//            strIngredient1 = it.strIngredient1,
//            strIngredient2 = it.strIngredient2,
//            strIngredient3 = it.strIngredient3,
//            strIngredient4 = it.strIngredient4,
//            strIngredient5 = it.strIngredient5,
//            strIngredient6 = it.strIngredient6,
//            strIngredient7 = it.strIngredient7,
//            strIngredient8 = it.strIngredient8,
//            strIngredient9 = it.strIngredient9,
//            strIngredient10 = it.strIngredient10,
//            strIngredient11 = it.strIngredient11,
//            strIngredient12 = it.strIngredient12,
//            strIngredient13 = it.strIngredient13,
//            strIngredient14 = it.strIngredient14,
//            strIngredient15 = it.strIngredient15,
//            strMeasure1 = it.strMeasure1,
//            strMeasure2 = it.strMeasure2,
//            strMeasure3 = it.strMeasure3,
//            strMeasure4 = it.strMeasure4,
//            strMeasure5 = it.strMeasure5,
//            strMeasure6 = it.strMeasure6,
//            strMeasure7 = it.strMeasure7,
//            strMeasure8 = it.strMeasure8,
//            strMeasure9 = it.strMeasure9,
//            strMeasure10 = it.strMeasure10,
//            strMeasure11 = it.strMeasure11,
//            strMeasure12 = it.strMeasure12,
//            strMeasure13 = it.strMeasure13,
//            strMeasure14 = it.strMeasure14,
//            strMeasure15 = it.strMeasure15
        )
    }.toTypedArray()
}

fun NetworkDrinkContainer.asDatabaseModelPopularDrink(): Array<DatabasePopularDrink> {
    return drinks.map {
        DatabasePopularDrink(
            idDrink = it.idDrink,
            strDrink = it.strDrink,
            strCategory = it.strCategory,
            strGlass = it.strGlass,
            strInstructions = it.strInstructions,
            strDrinkThumb = it.strDrinkThumb,
//            strIngredient1 = it.strIngredient1,
//            strIngredient2 = it.strIngredient2,
//            strIngredient3 = it.strIngredient3,
//            strIngredient4 = it.strIngredient4,
//            strIngredient5 = it.strIngredient5,
//            strIngredient6 = it.strIngredient6,
//            strIngredient7 = it.strIngredient7,
//            strIngredient8 = it.strIngredient8,
//            strIngredient9 = it.strIngredient9,
//            strIngredient10 = it.strIngredient10,
//            strIngredient11 = it.strIngredient11,
//            strIngredient12 = it.strIngredient12,
//            strIngredient13 = it.strIngredient13,
//            strIngredient14 = it.strIngredient14,
//            strIngredient15 = it.strIngredient15,
//            strMeasure1 = it.strMeasure1,
//            strMeasure2 = it.strMeasure2,
//            strMeasure3 = it.strMeasure3,
//            strMeasure4 = it.strMeasure4,
//            strMeasure5 = it.strMeasure5,
//            strMeasure6 = it.strMeasure6,
//            strMeasure7 = it.strMeasure7,
//            strMeasure8 = it.strMeasure8,
//            strMeasure9 = it.strMeasure9,
//            strMeasure10 = it.strMeasure10,
//            strMeasure11 = it.strMeasure11,
//            strMeasure12 = it.strMeasure12,
//            strMeasure13 = it.strMeasure13,
//            strMeasure14 = it.strMeasure14,
//            strMeasure15 = it.strMeasure15
        )
    }.toTypedArray()
}

fun NetworkDrinkContainer.asDatabaseModelLatestDrink(): Array<DatabaseLatestDrink> {
    return drinks.map {
        DatabaseLatestDrink(
            idDrink = it.idDrink,
            strDrink = it.strDrink,
            strCategory = it.strCategory,
            strGlass = it.strGlass,
            strInstructions = it.strInstructions,
            strDrinkThumb = it.strDrinkThumb,
//            strIngredient1 = it.strIngredient1,
//            strIngredient2 = it.strIngredient2,
//            strIngredient3 = it.strIngredient3,
//            strIngredient4 = it.strIngredient4,
//            strIngredient5 = it.strIngredient5,
//            strIngredient6 = it.strIngredient6,
//            strIngredient7 = it.strIngredient7,
//            strIngredient8 = it.strIngredient8,
//            strIngredient9 = it.strIngredient9,
//            strIngredient10 = it.strIngredient10,
//            strIngredient11 = it.strIngredient11,
//            strIngredient12 = it.strIngredient12,
//            strIngredient13 = it.strIngredient13,
//            strIngredient14 = it.strIngredient14,
//            strIngredient15 = it.strIngredient15,
//            strMeasure1 = it.strMeasure1,
//            strMeasure2 = it.strMeasure2,
//            strMeasure3 = it.strMeasure3,
//            strMeasure4 = it.strMeasure4,
//            strMeasure5 = it.strMeasure5,
//            strMeasure6 = it.strMeasure6,
//            strMeasure7 = it.strMeasure7,
//            strMeasure8 = it.strMeasure8,
//            strMeasure9 = it.strMeasure9,
//            strMeasure10 = it.strMeasure10,
//            strMeasure11 = it.strMeasure11,
//            strMeasure12 = it.strMeasure12,
//            strMeasure13 = it.strMeasure13,
//            strMeasure14 = it.strMeasure14,
//            strMeasure15 = it.strMeasure15
        )
    }.toTypedArray()
}










