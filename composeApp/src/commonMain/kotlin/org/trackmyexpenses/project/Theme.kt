package org.trackmyexpenses.project

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable

/**
 * This file defines the theme settings for the application, including color palettes for light and dark themes.
 * It uses the colors defined in the AppColors object and applies them to the MaterialTheme.
 */

// Define the color palettes for light and dark themes using the colors from AppColors
private val LightColorPalette = lightColors(
    primary = AppColors.Violet100,
    primaryVariant = AppColors.Violet80,
    secondary = AppColors.Green100,
    background = AppColors.Light100,
    surface = AppColors.Light80,
    onPrimary = AppColors.Light100,
    onSecondary = AppColors.Dark100,
    onBackground = AppColors.Dark100,
    onSurface = AppColors.Dark100
)

private val DarkColorPalette = darkColors(
    primary = AppColors.Violet100,
    primaryVariant = AppColors.Violet80,
    secondary = AppColors.Green100,
    background = AppColors.Dark100,
    surface = AppColors.Dark75,
    onPrimary = AppColors.Dark100,
    onSecondary = AppColors.Light100,
    onBackground = AppColors.Light100,
    onSurface = AppColors.Light100
)

/**
 * Composable function to apply the custom theme to the application.
 *
 * @param darkTheme Boolean value to determine if the system is in dark theme.
 * @param content Composable content to be displayed within the theme.
 */
@Composable
fun MyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), // Determine if the system is in dark theme
    content: @Composable () -> Unit // Content to be displayed within the theme
) {
    // Select the appropriate color palette based on the theme
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    // Apply the MaterialTheme with the selected colors, custom typography, and shapes
    MaterialTheme(
        colors = colors,
        typography = CustomTypography,
        shapes = CustomShapes,
        content = content
    )
}