package com.nti.team.foodies.presentation.detail_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nti.team.foodies.presentation.detail_screen.components.FloatingBackButton
import com.nti.team.foodies.presentation.detail_screen.components.ProductDescription
import com.nti.team.foodies.presentation.detail_screen.components.ProductImage

@Composable
@Preview(showBackground = true)
fun DetailScreenPreview() {
    DetailScreen()
}

@Composable
fun DetailScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
    ) {
        FloatingBackButton(onBackButtonClick = { })

        Column(modifier = Modifier) {
            ProductImage()
            ProductDescription()
        }
    }
}
