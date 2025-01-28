package org.trackmyexpenses.project

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

/**
 * This file defines the custom shapes used throughout the application.
 * Each shape is defined using the RoundedCornerShape class from the Compose UI library.
 * The shapes are grouped by their size: small, medium, and large.
 *
 * Shape definitions:
 * - small: Rounded corners with a radius of 4dp.
 * - medium: Rounded corners with a radius of 8dp.
 * - large: Rounded corners with a radius of 16dp.
 */
val CustomShapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(16.dp)
)