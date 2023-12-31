package com.nti.team.foodies.presentation.detail_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nti.team.foodies.R

@Composable
fun ProductImage() {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f),
        contentScale = ContentScale.FillWidth,
        painter = painterResource(R.drawable.photo),
        contentDescription = ""
    )
    Spacer(modifier = Modifier.height(LARGE_SPACER_HEIGHT.dp))
}
