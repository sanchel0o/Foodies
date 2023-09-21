package com.nti.team.foodies.presentation.detail_screen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProductDescription() {
    Column {
        ProductName("Том Ям")

        Spacer(modifier = Modifier.height(SMALL_SPACER_HEIGHT.dp))

        ProductInfo(info = "Кокосовое молоко, кальмары, креветки, помидоры черри, грибы вешанки")

        Spacer(modifier = Modifier.height(LARGE_SPACER_HEIGHT.dp))

        Box(modifier = Modifier.weight(1f)) {
            Column {
                LazyColumn(modifier = Modifier) {
                    item {
                        Divider(modifier = Modifier.fillMaxWidth())
                    }
                    items(5) {
                        ProductEnergyValue(name = "Вес", value = "400")
                    }
                }
            }
        }

        Box(
            modifier = Modifier,
            contentAlignment = Alignment.BottomCenter
        ) {
            AddToCartButton(onAddToCartClick = { /*TODO*/ }, price = "123")
        }
    }
    Spacer(modifier = Modifier.height(LARGE_SPACER_HEIGHT.dp))
}
