package com.nti.team.foodies.presentation.detail_screen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.nti.team.foodies.R

@Composable
fun AddToCartButton(
    onAddToCartClick: () -> Unit,
    price: String,
) {
    Card(
        shape = RectangleShape,
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
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
                    id = R.string.currency_symbol
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
        modifier = Modifier
            .padding(top = LARGE_PADDING.dp, start = LARGE_PADDING.dp)
            .size(44.dp),
        shape = CircleShape,
        onClick = { onBackButtonClick() }
    ) {
        Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "")
    }
}
