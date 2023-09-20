package com.nti.team.foodies.presentation.detail_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.nti.team.foodies.R

@Composable
fun ProductImage() {
    Image(
        modifier = Modifier,
        contentScale = ContentScale.None,
        painter = painterResource(R.drawable.photo),
        contentDescription = "")
}