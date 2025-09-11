package br.com.rubensrodrigues.diariodopeso

import androidx.compose.runtime.Composable
import br.com.rubensrodrigues.diariodopeso.di.viewModelModule
import br.com.rubensrodrigues.diariodopeso.navigation.AppNavHost
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import org.koin.compose.KoinApplication

@Composable
fun App() {
    KoinApplication(
        application = {
            modules(
                viewModelModule
            )
        }
    ) {
        AppTheme {
            AppNavHost()
        }
    }
}