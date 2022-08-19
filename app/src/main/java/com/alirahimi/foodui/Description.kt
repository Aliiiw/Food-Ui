package com.alirahimi.foodui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Description() {
    Text(
        text = "This Dessert is very tasty and not hard to be prepared, " +
                "please pay attention that you can replace strawberry with any another fruit like ",
        fontWeight = FontWeight.Medium,
        modifier = Modifier
            .padding(16.dp)
    )
}