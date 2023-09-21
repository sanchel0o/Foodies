package com.nti.team.foodies.presentation.main_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nti.team.foodies.R

const val CORNER_RADIUS = 8
const val MAIN_PADDING = 12
const val MEDIUM_PADDING = 8
const val SMALL_PADDING = 4

@Composable
@Preview(showBackground = true)
fun ProductCardPreview() {
    ProductCard()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductCard() {
    Card(
        modifier = Modifier.padding(SMALL_PADDING.dp),
        shape = RoundedCornerShape(CORNER_RADIUS.dp),
        onClick = { }
    ) {
        ProductImage()
        Spacer(modifier = Modifier.height(MAIN_PADDING.dp))

        ProductDescription(
            modifier = Modifier.padding(start = MAIN_PADDING.dp, end = MAIN_PADDING.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))

        PriceCard(modifier = Modifier.padding(
            start = MAIN_PADDING.dp, end = MAIN_PADDING.dp)
        )
        Spacer(modifier = Modifier.height(MAIN_PADDING.dp))
    }
}

@Composable
fun ProductImage() {
    Image(
        painter = painterResource(id = R.drawable.photo),
        contentDescription = "",
        //contentScale = ContentScale.Crop
    )
}

@Composable
fun ProductDescription(
    modifier: Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            style = MaterialTheme.typography.titleMedium,
            text = "Том ям"
        )
        Text(
            style = MaterialTheme.typography.titleMedium,
            text = "500 г"
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PriceCard(
    modifier: Modifier,
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(CORNER_RADIUS.dp),
        onClick = { }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(MAIN_PADDING.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                style = MaterialTheme.typography.titleLarge,
                text = "480" + " " + stringResource(id = R.string.currency_symbol)
            )
            Text(
                style = TextStyle(
                    textDecoration = TextDecoration.LineThrough
                ),
                text = "500" + " " + stringResource(id = R.string.currency_symbol)
            )
        }
    }
}
