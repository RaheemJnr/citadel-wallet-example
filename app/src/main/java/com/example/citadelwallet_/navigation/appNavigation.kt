package com.example.citadelwallet_.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.citadelwallet_.ui.screen.StartScreen
import com.example.citadelwallet_.ui.screen.UiScreen


/** nav graph to navigate to respective screens */
@ExperimentalMaterialApi
@Composable
fun MainScreenNavigation() {

    val navController = rememberNavController()

    NavHost(navController, startDestination = MainScreen.UiScreen.route) {
        //weatherList
        composable(MainScreen.StartScreen.route) {
            StartScreen(navController)
        }
        //
        composable(MainScreen.UiScreen.route) {
            UiScreen(navController)
        }

    }


}
