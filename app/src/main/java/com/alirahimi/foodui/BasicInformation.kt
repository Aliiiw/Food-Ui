package com.alirahimi.foodui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BasicInformation() {

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {

        InformationColumn(iconResource = R.drawable.ic_clock, text = "23 min")

        InformationColumn(iconResource = R.drawable.ic_flame, text = "720 kcal")

        InformationColumn(iconResource = R.drawable.ic_star, text = "4.9")
    }
}