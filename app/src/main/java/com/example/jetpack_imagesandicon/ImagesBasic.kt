package com.example.jetpack_imagesandicon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImageExm() {
    Image(
        painter = painterResource(R.drawable.green_grass),
        contentDescription = "Image of Green Grass",
        modifier = Modifier
            .padding(16.dp)
            .size(300.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.FillBounds
    )
}