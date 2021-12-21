package com.example.citadelwallet_.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppTopAppBar(
    title: String = "",
    titleColorFilter: Color,
    icon: ImageVector,
    iconTint: Color,
    color: Color,
    onIconClick: () -> Unit,

    ) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(color)
            .clickable { onIconClick() },
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "Top App Bar Icon",
            tint = iconTint,
            modifier = Modifier
                .padding(start = 8.dp)
                .align(Alignment.CenterVertically)
                .size(32.dp)
        )
        Text(
            text = title,
            color = titleColorFilter,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                letterSpacing = 0.15.sp,
            ),
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterVertically)
                .padding(start = 0.dp, end = 8.dp)

        )
    }
}