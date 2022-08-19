package com.alirahimi.foodui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.alirahimi.foodui.ui.theme.Pink

@Composable
fun InformationColumn(@DrawableRes iconResource: Int, text: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Icon(
            painter = painterResource(id = iconResource),
            contentDescription = "",
            tint = Pink,
            modifier = Modifier.height(24.dp)
        )

        Text(
            text = text,
            fontWeight = FontWeight.Bold
        )
    }
}