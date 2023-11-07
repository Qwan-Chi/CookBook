package org.leftbrained.cookbook.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import org.leftbrained.cookbook.presentation.Greeting
import org.leftbrained.cookbook.presentation.RecipeInfo
import org.leftbrained.cookbook.presentation.RecipeList
import org.leftbrained.cookbook.presentation.main

@Composable
fun navHost(): NavHostController {
    val navController = rememberSwipeDismissableNavController()
    SwipeDismissableNavHost(
        navController = navController,
        startDestination = "greeting"
    ) {
        composable("greeting") {
            Greeting(navController = navController)
        }
        composable("recipeList") {
            RecipeList(navController = navController)
        }
        composable(
            "recipeInfo/{recipeIndex}",
            arguments = listOf(navArgument("recipeIndex") { type = NavType.StringType })
        ) { backStackEntry ->
            RecipeInfo(
                recipeDTO = main[backStackEntry.arguments?.getString("recipeIndex")?.toInt() ?: 0]
            )
        }
    }
    return navController
}