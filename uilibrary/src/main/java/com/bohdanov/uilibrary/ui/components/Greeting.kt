package com.bohdanov.uilibrary.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.bohdanov.uilibrary.ui.components.basewrappers.TextPh
import com.bohdanov.uilibrary.ui.components.basewrappers.TextTv

@Composable
fun TvGreeting(name: String, modifier: Modifier = Modifier) {
    TextTv(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun PhGreeting(name: String, modifier: Modifier = Modifier) {
    TextPh(
        text = "Hello $name!",
        modifier = modifier
    )
}
