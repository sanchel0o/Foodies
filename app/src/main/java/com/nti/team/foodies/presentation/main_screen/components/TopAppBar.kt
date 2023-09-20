package com.nti.team.foodies.presentation.main_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.nti.team.foodies.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreenTopAppBar() {
    TopAppBar(
        navigationIcon = { FilterButton(onFilterButtonClick = { }) },
        actions = { SearchButton(onSearchButtonClick = { }) },
        title = { FoodiesAppBarLogo() }
    )
}

@Composable
fun FoodiesAppBarLogo() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            //modifier = Modifier.size(width = 110.dp, height = 44.dp),
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = R.drawable.logo),
            contentDescription = ""
        )
    }
}

@Composable
fun FilterButton(
    onFilterButtonClick: () -> Unit,
) {
    IconButton(onClick = { onFilterButtonClick() }) {
        Icon(imageVector = Icons.Outlined.List, contentDescription = "")
    }
}

@Composable
fun SearchButton(
    onSearchButtonClick: () -> Unit
) {
    IconButton(onClick = { onSearchButtonClick() }) {
        Icon(imageVector = Icons.Outlined.Search, contentDescription = "")
    }

}