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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.trackmyexpenses.project.ui.screens.AccountSetUpScreen
import org.trackmyexpenses.project.ui.screens.ConfirmPingUpScreen
import org.trackmyexpenses.project.ui.screens.HomeScreen
import org.trackmyexpenses.project.ui.screens.OnBoardingScreen
import org.trackmyexpenses.project.ui.screens.PingSetUpScreen
import org.trackmyexpenses.project.ui.screens.SuccessfullySetupDone

/**
 * This file defines the main composable function for the application.
 * It sets up the theme and provides a simple UI with a button that toggles content visibility.
 */

@Composable
@Preview
fun App() {
    // Apply the custom theme to the application
    MyTheme(darkTheme = false) {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "onBoardingScreen") {
            composable("onBoardingScreen") { OnBoardingScreen(navController) }
            composable("pingSetUpScreen") { PingSetUpScreen(navController) }
            composable("confirmPingUpScreen") { ConfirmPingUpScreen(navController) }
            composable("accountSetUpScreen") { AccountSetUpScreen(navController) }
            composable("successfullySetupDone") { SuccessfullySetupDone(navController) }
            composable("homeScreen") { HomeScreen() }
        }
    }
}