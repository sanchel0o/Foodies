package com.nti.team.foodies.presentation.detail_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nti.team.foodies.R
import com.nti.team.foodies.presentation.detail_screen.components.ProductImage

const val SPACER_HEIGHT = 24

const val SMALL_PADDING = 12
const val MEDIUM_PADDING = 13
const val LARGE_PADDING = 16

const val CORNER_RADIUS = 8

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
        Column(modifier = Modifier.fillMaxSize()) {
            ProductImage()
            Spacer(modifier = Modifier.height(SPACER_HEIGHT.dp))

            ProductDescription()
        }
        AddToCartButton(
            onAddToCartClick = {},
            price = "720"
        )
    }
}

@Composable
fun ProductDescription() {
    Column {
        ProductName("Том Ям")
        Spacer(modifier = Modifier.height(8.dp))
        ProductInfo(info = "Кокосовое молоко, кальмары, креветки, помидоры черри, грибы вешанки")
        Spacer(modifier = Modifier.height(SPACER_HEIGHT.dp))
        Divider(modifier = Modifier.fillMaxWidth())

        Box(modifier = Modifier.weight(1f)) {
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(10) {
                    ProductEnergyValue(name = "Вес", value = "400")
                }
            }
        }
    }

}

@Composable
fun ProductInfo(info: String) {
    Text(
        modifier = Modifier.padding(start = LARGE_PADDING.dp),
        style = MaterialTheme.typography.labelMedium,
        color = Color.Gray,
        text = info
    )
}

@Composable
fun ProductName(name: String) {
    Text(
        modifier = Modifier.padding(start = LARGE_PADDING.dp),
        style = MaterialTheme.typography.labelLarge,
        text = name //product name
    )
}

@Composable
fun ProductEnergyValue(
    name: String,
    value: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = LARGE_PADDING.dp,
                end = LARGE_PADDING.dp,
                top = MEDIUM_PADDING.dp,
                bottom = MEDIUM_PADDING.dp
            ),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            style = MaterialTheme.typography.labelMedium,
            color = Color.Gray,
            text = name
        )
        Text(text = value + " " + stringResource(id = R.string.gramm_symbol))
    }
    Divider(modifier = Modifier.fillMaxWidth())
}

@Composable
fun AddToCartButton(
    onAddToCartClick: () -> Unit,
    price: String,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = LARGE_PADDING.dp,
                    end = LARGE_PADDING.dp,
                    top = SMALL_PADDING.dp,
                    bottom = SMALL_PADDING.dp
                ),
            shape = RoundedCornerShape(CORNER_RADIUS.dp),
            onClick = { onAddToCartClick() }
        ) {
            Text(
                style = MaterialTheme.typography.labelSmall,
                text = stringResource(id = R.string.add_to_cart_for) + " " + price + " " + stringResource(
                    id = R.string.ruble_symbol
                )
            )
        }
    }
}

@Composable
fun FloatingBackButton(
    onBackButtonClick: () -> Unit
) {
    FloatingActionButton(
        modifier = Modifier.padding(top = LARGE_PADDING.dp, start = LARGE_PADDING.dp).size(44.dp),
        shape = CircleShape,
        onClick = { /*TODO*/ }
    ) {
        Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "" )
    }
}
