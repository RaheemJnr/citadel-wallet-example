package com.example.citadelwallet_.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.citadelwallet_.ui.components.AppTopAppBar
import com.example.citadelwallet_.ui.components.OtherSection
import com.example.citadelwallet_.ui.components.colorsList
import com.example.citadelwallet_.ui.components.diagonalGradientTint

@Composable
fun UiScreen(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xfff2f2f7))
    ) {
        Scaffold(
            topBar = {
                AppTopAppBar(
                    title = "My Citadel",
                    titleColorFilter = Color(0xffb151df),
                    icon = Icons.Filled.ArrowBack,
                    iconTint = Color(0xffb151df),
                    color = Color(0xfff2f2f7),
                    onIconClick = { navController.popBackStack() }
                )
            }
        ) {
            LazyColumn(
                Modifier
                    .background(Color(0xfff2f2f7))
            ) {
                //top card section
                item {
                    Surface(elevation = 800.dp) {
                        Column(
                            modifier = Modifier
                                .background(Color(0xfff2f2f7))
                                .padding(16.dp)

                        ) {
                            //heading text
                            Text(
                                text = "Digital Asset Profile",
                                fontSize = 32.sp,
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp,
                                    letterSpacing = 0.15.sp,
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 26.dp, bottom = 8.dp)
                                    .align(Alignment.CenterHorizontally)
                            )
                            Spacer(modifier = Modifier.height(8.dp))

                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 11.dp, vertical = 11.dp)
                                    .size(200.dp),
                                shape = RoundedCornerShape(18.dp),
                                backgroundColor = Color.Black,
                                elevation = 10.dp
                            ) {
                                Box(
                                    Modifier
                                        .fillMaxSize()
                                        .diagonalGradientTint(colorsList, BlendMode.Exclusion)
                                ) {
                                    Box(
                                        Modifier.padding(16.dp),
                                    ) {
                                        ConstraintLayout(
                                            modifier = Modifier
                                                .fillMaxSize(),
                                        ) {
                                            //reference
                                            val (demoLiveText, amountText,
                                                demoText, unknownText, unknownIcon) = createRefs()
                                            // demoLiveText
                                            Text(
                                                text = "DEMO LIVE",
                                                fontSize = 32.sp,
                                                color = Color.Black,
                                                fontWeight = FontWeight.SemiBold,
                                                fontFamily = FontFamily.Default,
                                                modifier = Modifier.constrainAs(demoLiveText) {
                                                    top.linkTo(parent.top, margin = 12.dp)
                                                    start.linkTo(parent.start)
                                                }
                                            )
                                            //amountText
                                            Text(
                                                text = "2,000.000000",
                                                fontSize = 38.sp,
                                                color = Color.Black,
                                                fontWeight = FontWeight.SemiBold,
                                                fontFamily = FontFamily.Default,
                                                modifier = Modifier.constrainAs(amountText) {
                                                    top.linkTo(demoLiveText.bottom, margin = 4.dp)
                                                }
                                            )
                                            //demoText
                                            Text(
                                                text = "DEMO",
                                                fontSize = 36.sp,
                                                color = Color.Black,
                                                fontWeight = FontWeight.SemiBold,
                                                fontFamily = FontFamily.Default,
                                                modifier = Modifier.constrainAs(demoText) {
                                                    top.linkTo(amountText.bottom)
                                                }
                                            )
                                            Icon(
                                                Icons.Filled.Person,
                                                contentDescription = "Person",
                                                modifier = Modifier.constrainAs(unknownIcon) {
                                                    top.linkTo(unknownText.top)
                                                    end.linkTo(parent.end)

                                                }
                                            )
                                            Text(
                                                text = "UNKNOWN",
                                                fontSize = 22.sp,
                                                color = Color.Black,
                                                fontWeight = FontWeight.SemiBold,
                                                fontFamily = FontFamily.Default,
                                                modifier = Modifier.constrainAs(unknownText) {
                                                    top.linkTo(demoText.bottom)
                                                    end.linkTo(unknownIcon.start, margin = 6.dp)
                                                }

                                            )

                                        }

                                    }
                                }

                            }
                        }
                    }
                }
                //
                item {
                    OtherSection()
                }
                item {
                    Column(
                        Modifier
                            .background(Color(0xfff2f2f7))
                            .padding(horizontal = 18.dp, vertical = 16.dp)
                    ) {
                        Text(
                            text = "Information source: embedded genesis data",
                            fontSize = 18.sp,
                            color = Color.Gray,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = FontFamily.Default,
                        )
                        Spacer(modifier = Modifier.height(12.dp))


                    }
                }
            }


        }

    }

}

@Preview
@Composable
fun UiScreenPrev() {
    UiScreen(navController = rememberNavController())
}