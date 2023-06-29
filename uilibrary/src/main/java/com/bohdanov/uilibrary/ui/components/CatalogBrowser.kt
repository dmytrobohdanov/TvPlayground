package com.bohdanov.uilibrary.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.tv.foundation.lazy.list.TvLazyColumn
import androidx.tv.foundation.lazy.list.items
import com.bohdanov.uilibrary.ui.models.Movie
import com.bohdanov.uilibrary.ui.models.Section

private val arrangement = Arrangement.spacedBy(16.dp)

@Composable
fun CatalogBrowserTv(
    sectionList: List<Section>,
    modifier: Modifier = Modifier,
    onItemSelected: (Movie) -> Unit = {},
) {
    TvLazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = arrangement
    ) {
        items(sectionList) { section ->
            SectionTv(
                section = section,
                onItemSelected = onItemSelected
            )
        }
    }
}

@Composable
fun CatalogBrowserPh(
    sectionList: List<Section>,
    modifier: Modifier = Modifier,
    onItemSelected: (Movie) -> Unit = {},
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = arrangement
    ) {
        items(sectionList) { section ->
            SectionPh(
                section = section,
                onItemSelected = onItemSelected
            )
        }
    }
}
