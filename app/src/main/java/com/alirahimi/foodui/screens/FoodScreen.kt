package com.alirahimi.foodui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import com.alirahimi.foodui.Content
import com.alirahimi.foodui.ParallaxToolbar

@Composable
fun FoodScreen() {

    val scrollState = rememberLazyListState()

    Box {

        Content(scrollState = scrollState)
        ParallaxToolbar(scrollState)

    }
}






