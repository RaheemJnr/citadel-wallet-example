package com.example.citadelwallet_.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.citadelwallet_.navigation.MainScreen

@Composable
fun StartScreen(navController:NavController) {

    androidx.compose.material.Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Welcome",
                fontSize = 22.sp,
                modifier = Modifier
                    .wrapContentSize()
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Button(
                onClick = { navController.navigate(MainScreen.UiScreen.route) }
            ) {
                Text(text = "Design Page")
                Spacer(modifier = Modifier.height(8.dp))
                Icon(Icons.Filled.ArrowForward, contentDescription = "")

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StartScreenPrev() {
    StartScreen(rememberNavController())
}