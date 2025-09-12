package br.com.rubensrodrigues.diariodopeso.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_data.SignUpDataPage
import br.com.rubensrodrigues.diariodopeso.presentation.journey.start.StartPage

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Destination.Start
    ) {
        composable<Destination.Start> {
            StartPage(navController)
        }
        composable<Destination.SignUpData> {
            SignUpDataPage(navController)
        }
        composable<Destination.SignUpPassword> {

        }
    }
}