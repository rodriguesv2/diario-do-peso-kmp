package br.com.rubensrodrigues.diariodopeso.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_data.SignUpDataPage
import br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_data.SignUpDataViewModel
import br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_password.SignUpPasswordPage
import br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_password.SignUpPasswordViewModel
import br.com.rubensrodrigues.diariodopeso.presentation.journey.start.StartPage
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf

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
        composable<Destination.SignUpPassword> {backStack ->
            val args = backStack.toRoute<Destination.SignUpPassword>()

            val viewModel: SignUpPasswordViewModel = koinViewModel(
                parameters = {
                    parametersOf(
                        args.name,
                        args.email
                    )
                }
            )
            SignUpPasswordPage(
                navController = navController,
                viewModel = viewModel,
            )
        }
    }
}