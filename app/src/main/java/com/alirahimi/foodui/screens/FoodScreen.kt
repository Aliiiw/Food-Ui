package com.alirahimi.foodui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import com.alirahimi.foodui.ParallaxToolbar

@Composable
fun FoodScreen() {

    val scrollState = rememberLazyListState()

    Box {
        ParallaxToolbar(scrollState)

    }
}






