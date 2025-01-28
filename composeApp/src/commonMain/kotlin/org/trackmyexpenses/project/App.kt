package org.trackmyexpenses.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * This file defines the main composable function for the application.
 * It sets up the theme and provides a simple UI with a button that toggles content visibility.
 */

@Composable
@Preview
fun App() {
    // Apply the custom theme to the application
    MyTheme(darkTheme = false) {
        // State variable to track the visibility of the content
        var showContent by remember { mutableStateOf(false) }

        // Column layout to arrange the UI elements vertically
        Column(
            modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.background),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Button to toggle the content visibility
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
        }
    }
}