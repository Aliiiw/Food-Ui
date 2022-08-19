package com.alirahimi.foodui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.alirahimi.foodui.ui.theme.Pink
import com.alirahimi.foodui.ui.theme.Shapes

@Composable
fun ShoppingListButton() {
    Column(modifier = Modifier.padding(16.dp)) {
        Button(
            onClick = { },
            elevation = null,
            shape = Shapes.small,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Pink,
                contentColor = Color.White
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Add to shopping list",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}