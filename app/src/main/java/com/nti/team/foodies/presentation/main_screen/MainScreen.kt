package com.nti.team.foodies.presentation.main_screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nti.team.foodies.presentation.main_screen.components.MainScreenTopAppBar
import com.nti.team.foodies.presentation.main_screen.components.ProductCard

@Composable
@Preview(showBackground = true)
fun MainScreenPreview() {
    MainScreen()
}

@Composable
fun MainScreen() {
    ProductsGrid()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductsGrid() {
    val topAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
        topBar = { MainScreenTopAppBar() }

    ) { values ->
        LazyVerticalGrid(
            modifier = Modifier,
            contentPadding = values,
            columns = GridCells.Adaptive(minSize = 180.dp)
        ) {
            items(5) {
                ProductCard()
            }
        }
    }
}

