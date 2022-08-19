package com.alirahimi.foodui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.alirahimi.foodui.ui.theme.DarkGray
import com.alirahimi.foodui.ui.theme.Pink

@Composable
fun SimilarFoodsHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Similar Foods",
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "You may like these...",
                color = DarkGray
            )
        }

        Button(
            onClick = {},
            elevation = null,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent,
                contentColor = Pink
            )
        ) {

            Text(text = "Show more")

            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = ""
            )
        }
    }
}