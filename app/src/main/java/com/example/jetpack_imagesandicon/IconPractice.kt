package com.example.jetpack_imagesandicon

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IconPrac () {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .height(70.dp)
                .padding(vertical = 8.dp)
                .fillMaxWidth()
                .background(color = Color.LightGray),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Filled.Home, // Outlined, Rounded
                    contentDescription = "Home Icon",
                    modifier = Modifier
                        .size(40.dp),
                    tint = Color.Blue
                )


            }


            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Filled.Person, // Outlined, Rounded
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(40.dp),
                    tint = Color.Green
                )
            }

            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Filled.Favorite, // Outlined, Rounded
                    contentDescription = "Favorite",
                    modifier = Modifier
                        .size(40.dp),
                    tint = Color.Red
                )


            }
        }
    }
}