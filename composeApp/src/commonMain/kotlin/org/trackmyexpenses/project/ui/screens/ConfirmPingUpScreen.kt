package org.trackmyexpenses.project.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun ConfirmPingUpScreen(navController: NavController) {
    Box(Modifier.fillMaxSize().background(Color.Blue)) {
        Button(onClick = { navController.navigate("accountSetUpScreen") }) {
            Text("Go to Account Setup")
        }
    }
}