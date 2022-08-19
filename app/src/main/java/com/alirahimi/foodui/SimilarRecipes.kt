package com.alirahimi.foodui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun SimilarRecipes() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        RecipeItem(
            image = painterResource(id = R.drawable.cheesecake),
            name = "Cheesecake",
            category = "Dessert",
            experience = "Beginner",
            experienceColor = Color(0xFF8cd694),
            baseColor = Color(0xFFcbe8e0)
        )

        RecipeItem(
            image = painterResource(id = R.drawable.cupcake),
            name = "Cupcake",
            category = "Dessert",
            experience = "Intermediate",
            experienceColor = Color(0xFF7c89ff),
            baseColor = Color(0xFFe8d0ff)
        )

        RecipeItem(
            image = painterResource(id = R.drawable.berrycake),
            name = "Berry Cake",
            category = "Breakfast",
            experience = "Beginner",
            experienceColor = Color(0xFF8cd694),
            baseColor = Color(0xFFfae9d4)
        )
    }
}