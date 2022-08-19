package com.alirahimi.foodui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable

@Composable
fun Content(scrollState: LazyListState) {

    LazyColumn(
        contentPadding = PaddingValues(top = appBarExpandedHeight),
        state = scrollState,
    ) {
        item {
            BasicInformation()
        }
    }
}
