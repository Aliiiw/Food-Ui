package com.alirahimi.foodui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.alirahimi.foodui.ui.theme.LightGray
import com.alirahimi.foodui.ui.theme.Pink
import com.alirahimi.foodui.ui.theme.Shapes

@Composable
fun ServingNumber() {
    var numbers by remember {
        mutableStateOf(6)
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clip(Shapes.small)
            .background(LightGray)
            .padding(horizontal = 16.dp)
    ) {

        Text(
            text = "Serving",
            modifier = Modifier.weight(1f),
            fontWeight = FontWeight.Medium
        )

        CircularButton(iconResource = R.drawable.ic_minus, elevation = null, color = Pink) {
            numbers--;
        }

        Text(
            text = "$numbers",
            modifier = Modifier.padding(16.dp),
            fontWeight = FontWeight.Medium
        )

        CircularButton(iconResource = R.drawable.ic_plus, elevation = null, color = Pink) {
            numbers++
        }
    }
}