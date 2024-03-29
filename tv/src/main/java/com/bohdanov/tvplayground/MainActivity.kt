@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.bohdanov.tvplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import com.bohdanov.tvplayground.theme.TvPlaygroundTheme
import com.bohdanov.uilibrary.temp.getCatalog
import com.bohdanov.uilibrary.ui.components.CatalogBrowserTv

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TvPlaygroundTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    CatalogBrowserTv(sectionList = getCatalog())
                }
            }
        }
    }
}
