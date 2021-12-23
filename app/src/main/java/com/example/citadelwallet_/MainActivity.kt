package com.example.citadelwallet_

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.example.citadelwallet_.navigation.MainScreenNavigation
import com.example.citadelwallet_.ui.theme.CitadelWallet_Theme
import com.example.citadelwallet_.util.LocalSysUiController
import com.example.citadelwallet_.util.SystemUiController

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, true)
        setContent {
            val systemUiController = remember { SystemUiController(window) }
            // A surface container using the 'background' color from the theme
            CompositionLocalProvider(LocalSysUiController provides systemUiController) {
                Surface(color = MaterialTheme.colors.background) {
                    MainScreenNavigation()
                }
            }
        }
    }
}


@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CitadelWallet_Theme {
        MainScreenNavigation()
    }
}