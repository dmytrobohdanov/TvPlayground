@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.bohdanov.uilibrary.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.tv.material3.ExperimentalTvMaterial3Api
import coil.compose.AsyncImage
import com.bohdanov.uilibrary.ui.components.basewrappers.CardPh
import com.bohdanov.uilibrary.ui.components.basewrappers.CardTv
import com.bohdanov.uilibrary.ui.models.Movie

@Composable
fun MovieCardTv(
    movie: Movie,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    CardTv(
        modifier = modifier,
        onClick = onClick
    ) {
        CardsImage(movie)
    }
}

@Composable
fun MovieCardPh(
    movie: Movie,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    CardPh(
        modifier = modifier,
        onClick = onClick
    ) {
        CardsImage(movie)
    }
}

@Composable
private fun CardsImage(movie: Movie) {
    AsyncImage(
        model = movie.posterLink,
        contentDescription = movie.name,
    )
}
