package com.bohdanov.tvplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.bohdanov.tvplayground.ui.theme.TvPlaygroundTheme
import com.bohdanov.uilibrary.temp.getCatalog
import com.bohdanov.uilibrary.ui.components.CatalogBrowserPh

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TvPlaygroundTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CatalogBrowserPh(sectionList = getCatalog())
                }
            }
        }
    }
}
