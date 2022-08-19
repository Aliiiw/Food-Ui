package com.alirahimi.foodui

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun SimilarFoods() {
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        FastFoodItem(
            image = painterResource(id = R.drawable.hot_dog),
            name = "Hot Dog",
            description = "Fast Foods",
            price = "7$"
        )

        FastFoodItem(
            image = painterResource(id = R.drawable.hamburger),
            name = "Hamburger",
            description = "Fast Foods",
            price = "3$"
        )

        FastFoodItem(
            image = painterResource(id = R.drawable.doughnut),
            name = "Doughnut",
            description = "Dessert",
            price = "6$"
        )

        FastFoodItem(
            image = painterResource(id = R.drawable.apple_pie),
            name = "Apple Pie",
            description = "Cookies",
            price = "23$"
        )

    }
}