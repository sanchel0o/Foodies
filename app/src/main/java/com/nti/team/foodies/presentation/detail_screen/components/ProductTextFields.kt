package com.nti.team.foodies.presentation.detail_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.nti.team.foodies.R


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
        Text(text = value + " " + stringResource(id = R.string.weight_symbol))
    }
    Divider(modifier = Modifier.fillMaxWidth())
}
