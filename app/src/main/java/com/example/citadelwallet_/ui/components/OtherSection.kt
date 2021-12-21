package com.example.citadelwallet_.ui.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * help section
 */
@Composable
fun OtherSection() {
    val context = LocalContext.current
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(12.dp, 8.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(2.dp, 12.dp)
                .clickable {
                    showToast(context, "clicked Asset", Toast.LENGTH_LONG)
                }
        ) {
            //asset id
            Column(
                Modifier
                    .fillMaxWidth(0.9f)
                    .padding(8.dp)
            ) {
                Text(
                    text = "Asset Id",
                    modifier = Modifier.align(Alignment.Start),
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 22.sp
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "rgb1ggdkjrtfadcvbb35thdjjdb77hgf5ffjjs9kkhgdhhhhhhhhgf",
                    modifier = Modifier.align(Alignment.Start),
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    fontSize = 18.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                Icons.Filled.CheckCircle, contentDescription = "",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            )
        }
        Divider(
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .width(0.7.dp)
                .alpha(0.5f),
            startIndent = 8.dp,
            thickness = 2.dp
        )
        //ticker
        Row(
            Modifier
                .padding(8.dp, 12.dp)
                .fillMaxWidth()
                .clickable {
                    showToast(context, "clicked Ticker", Toast.LENGTH_LONG)
                },
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Ticker",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 24.sp
            )
            Text(
                text = "DEMO",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default,
                color = Color.Black,
                fontSize = 22.sp
            )
        }
        Divider(
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .width(0.7.dp)
                .alpha(0.5f),
            startIndent = 10.dp,
            thickness = 2.dp
        )
        //name
        Row(
            Modifier
                .padding(8.dp, 12.dp)
                .fillMaxWidth()
                .clickable {
                    showToast(context, "clicked Name", Toast.LENGTH_LONG)
                },
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Name",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 24.sp
            )
            Text(
                text = "DEMO live",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default,
                color = Color.Black,
                fontSize = 22.sp
            )
        }
        Divider(
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .width(0.7.dp)
                .alpha(0.5f),
            startIndent = 8.dp,
            thickness = 2.dp
        )
        //divisibility
        Row(
            Modifier
                .padding(8.dp, 12.dp)
                .fillMaxWidth()
                .clickable {
                    showToast(context, "clicked divisibility", Toast.LENGTH_LONG)
                },
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Divisibility",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 24.sp
            )
            Text(
                text = "8 subdecimals",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default,
                color = Color.Black,
                fontSize = 22.sp
            )
        }
        Divider(
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .width(0.7.dp)
                .alpha(0.5f),
            startIndent = 8.dp,
            thickness = 2.dp
        )
        //known since
        Row(
            Modifier
                .padding(8.dp, 12.dp)
                .fillMaxWidth()
                .clickable {
                    showToast(context, "clicked known since", Toast.LENGTH_LONG)
                },
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Known since",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 24.sp
            )
            Text(
                text = "Jan 1,1970",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default,
                color = Color.Black,
                fontSize = 22.sp
            )
        }
        Divider(
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .width(0.7.dp)
                .alpha(0.5f),
            startIndent = 8.dp,
            thickness = 2.dp
        )
        //Ricardian
        Row(
            Modifier
                .padding(8.dp, 12.dp)
                .fillMaxWidth()
                .clickable {
                    showToast(context, "clicked Ricardian", Toast.LENGTH_LONG)
                },
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Ricardian contract",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 24.sp
            )
            Text(
                text = "none",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default,
                color = Color.Black,
                fontSize = 22.sp
            )
        }


    }
}

@Preview
@Composable
fun OtherSectionPrev() {
    OtherSection()

}