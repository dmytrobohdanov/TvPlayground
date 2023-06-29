package com.bohdanov.uilibrary.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.tv.foundation.lazy.list.TvLazyRow
import androidx.tv.foundation.lazy.list.items
import com.bohdanov.uilibrary.ui.components.basewrappers.TextPh
import com.bohdanov.uilibrary.ui.components.basewrappers.TextTv
import com.bohdanov.uilibrary.ui.models.Movie
import com.bohdanov.uilibrary.ui.models.Section

@Composable
fun SectionTv(
    section: Section,
    modifier: Modifier = Modifier,
    onItemSelected: (Movie) -> Unit = {},
) {
    TextTv(
        text = section.title,
        style = androidx.tv.material3.MaterialTheme.typography.headlineSmall,
    )
    TvLazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
         items(section.movies) { movie ->
            MovieCardTv(
                movie = movie,
                onClick = { onItemSelected(movie) }
            )
        }
    }
}

@Composable
fun SectionPh(
    section: Section,
    modifier: Modifier = Modifier,
    onItemSelected: (Movie) -> Unit = {},
) {
    TextPh(
        text = section.title,
        style = androidx.compose.material3.MaterialTheme.typography.headlineSmall,
    )
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(section.movies) { movie ->
            MovieCardPh(
                movie = movie,
                onClick = { onItemSelected(movie) }
            )
        }
    }
}
