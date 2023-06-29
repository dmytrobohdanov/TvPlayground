package com.bohdanov.tvplayground.theme

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.lightColorScheme
import com.bohdanov.uilibrary.ui.theme.md_theme_light_background
import com.bohdanov.uilibrary.ui.theme.md_theme_light_error
import com.bohdanov.uilibrary.ui.theme.md_theme_light_errorContainer
import com.bohdanov.uilibrary.ui.theme.md_theme_light_inverseOnSurface
import com.bohdanov.uilibrary.ui.theme.md_theme_light_inversePrimary
import com.bohdanov.uilibrary.ui.theme.md_theme_light_inverseSurface
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onBackground
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onError
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onErrorContainer
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onPrimary
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onPrimaryContainer
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onSecondary
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onSecondaryContainer
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onSurface
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onSurfaceVariant
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onTertiary
import com.bohdanov.uilibrary.ui.theme.md_theme_light_onTertiaryContainer
import com.bohdanov.uilibrary.ui.theme.md_theme_light_outline
import com.bohdanov.uilibrary.ui.theme.md_theme_light_outlineVariant
import com.bohdanov.uilibrary.ui.theme.md_theme_light_primary
import com.bohdanov.uilibrary.ui.theme.md_theme_light_primaryContainer
import com.bohdanov.uilibrary.ui.theme.md_theme_light_scrim
import com.bohdanov.uilibrary.ui.theme.md_theme_light_secondary
import com.bohdanov.uilibrary.ui.theme.md_theme_light_secondaryContainer
import com.bohdanov.uilibrary.ui.theme.md_theme_light_surface
import com.bohdanov.uilibrary.ui.theme.md_theme_light_surfaceTint
import com.bohdanov.uilibrary.ui.theme.md_theme_light_surfaceVariant
import com.bohdanov.uilibrary.ui.theme.md_theme_light_tertiary
import com.bohdanov.uilibrary.ui.theme.md_theme_light_tertiaryContainer


@OptIn(ExperimentalTvMaterial3Api::class)
private val LightColors = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    primaryContainer = md_theme_light_primaryContainer,
    onPrimaryContainer = md_theme_light_onPrimaryContainer,
    secondary = md_theme_light_secondary,
    onSecondary = md_theme_light_onSecondary,
    secondaryContainer = md_theme_light_secondaryContainer,
    onSecondaryContainer = md_theme_light_onSecondaryContainer,
    tertiary = md_theme_light_tertiary,
    onTertiary = md_theme_light_onTertiary,
    tertiaryContainer = md_theme_light_tertiaryContainer,
    onTertiaryContainer = md_theme_light_onTertiaryContainer,
    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,
    surfaceVariant = md_theme_light_surfaceVariant,
    onSurfaceVariant = md_theme_light_onSurfaceVariant,
    surfaceTint = md_theme_light_surfaceTint,
    inverseOnSurface = md_theme_light_inverseOnSurface,
    inverseSurface = md_theme_light_inverseSurface,
    inversePrimary = md_theme_light_inversePrimary,

    error = md_theme_light_error,
    errorContainer = md_theme_light_errorContainer,
    onError = md_theme_light_onError,
    onErrorContainer = md_theme_light_onErrorContainer,

    border = md_theme_light_outline,

    borderVariant = md_theme_light_outlineVariant,
    scrim = md_theme_light_scrim,
)

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun TvPlaygroundTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}
