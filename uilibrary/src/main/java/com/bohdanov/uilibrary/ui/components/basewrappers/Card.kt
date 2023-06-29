@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.bohdanov.uilibrary.ui.components.basewrappers

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.tv.material3.CardBorder
import androidx.tv.material3.CardGlow
import androidx.tv.material3.CardScale
import androidx.tv.material3.CardShape
import androidx.tv.material3.ExperimentalTvMaterial3Api

@Composable
fun CardPh(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    shape: Shape = CardDefaults.shape,
    colors: CardColors = CardDefaults.cardColors(),
    elevation: CardElevation = CardDefaults.cardElevation(),
    border: BorderStroke? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    androidx.compose.material3.Card(
        modifier = modifier.clickable { onClick() },
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        content = content,
    )
}

@Composable
fun CardTv(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    onLongClick: (() -> Unit)? = null,
    shape: CardShape = androidx.tv.material3.CardDefaults.shape(),
    colors: androidx.tv.material3.CardColors = androidx.tv.material3.CardDefaults.colors(),
    scale: CardScale = androidx.tv.material3.CardDefaults.scale(),
    border: CardBorder = androidx.tv.material3.CardDefaults.border(),
    glow: CardGlow = androidx.tv.material3.CardDefaults.glow(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable ColumnScope.() -> Unit
) {
    androidx.tv.material3.Card(
        onClick = onClick,
        modifier = modifier,
        onLongClick = onLongClick,
        shape = shape,
        colors = colors,
        scale = scale,
        border = border,
        glow = glow,
        interactionSource = interactionSource,
        content = content,
    )
}