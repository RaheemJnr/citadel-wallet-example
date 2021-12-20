package com.example.citadelwallet_.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.citadelwallet_.ui.components.AppTopAppBar

@Composable
fun UiScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Scaffold(
            topBar = {
                AppTopAppBar(
                    title = "My Citadel",
                    titleColorFilter = Color(0xffb151df),
                    icon = Icons.Filled.ArrowBack,
                    iconTint = Color(0xffb151df),
                    color = Color.Transparent,
                ) {

                }
            }

        ) {

        }

    }

}