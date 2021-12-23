package com.example.citadelwallet_.navigation


import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.citadelwallet_.ui.screen.StartScreen
import com.example.citadelwallet_.ui.screen.UiScreen
import com.example.citadelwallet_.ui.theme.CitadelWallet_Theme
import com.google.accompanist.insets.ProvideWindowInsets


/** nav graph to navigate to respective screens */
@ExperimentalMaterialApi
@Composable
fun MainScreenNavigation() {

    ProvideWindowInsets {
        CitadelWallet_Theme {
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
    }
}
