package org.trackmyexpenses.project

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * This object defines the custom typography styles used throughout the application.
 * Each text style is defined using the TextStyle class from the Compose UI library.
 * The styles are grouped by their usage context, such as headings, body text, subtitles, and captions.
 *
 * Text styles:
 * - h1: Used for the largest headings. Font size is 64sp with a line height of 80sp.
 * - h2: Used for large headings. Font size is 32sp with a line height of 34sp.
 * - h3: Used for medium headings. Font size is 24sp with a line height of 22sp.
 * - h4: Used for small headings. Font size is 18sp with a line height of 22sp.
 * - body1: Used for regular body text. Font size is 16sp with a line height of 19sp.
 * - body2: Used for regular body text. Font size is 16sp with a line height of 19sp.
 * - subtitle1: Used for subtitles. Font size is 14sp with a line height of 18sp.
 * - subtitle2: Used for subtitles. Font size is 13sp with a line height of 16sp.
 * - caption: Used for captions. Font size is 12sp with a line height of 12sp.
 *
 * Each text style uses the default font family and specifies the font weight and size.
 */
val CustomTypography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 64.sp,
        lineHeight = 80.sp
    ),
    h2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 34.sp
    ),
    h3 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 22.sp
    ),
    h4 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 22.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 19.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 19.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 18.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        lineHeight = 16.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 12.sp
    )
)