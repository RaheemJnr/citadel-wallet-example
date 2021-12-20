package com.example.citadelwallet_.navigation

/** sealed class to hold possible screen destination and screen title */

sealed class MainScreen(val route: String) {
    object StartScreen : MainScreen("forecastList")
    object UiScreen : MainScreen("detail")

}