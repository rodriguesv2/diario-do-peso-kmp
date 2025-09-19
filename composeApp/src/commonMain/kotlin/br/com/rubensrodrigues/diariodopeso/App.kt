package br.com.rubensrodrigues.diariodopeso

import androidx.compose.runtime.Composable
import br.com.rubensrodrigues.diariodopeso.di.dataStoreModule
import br.com.rubensrodrigues.diariodopeso.di.firebaseModule
import br.com.rubensrodrigues.diariodopeso.di.repositoryModule
import br.com.rubensrodrigues.diariodopeso.di.useCaseModule
import br.com.rubensrodrigues.diariodopeso.di.viewModelModule
import br.com.rubensrodrigues.diariodopeso.navigation.AppNavHost
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import org.koin.compose.KoinApplication

@Composable
fun App() {
    KoinApplication(
        application = {
            modules(
                viewModelModule,
                firebaseModule,
                repositoryModule,
                useCaseModule,
                dataStoreModule,
            )
        }
    ) {
        AppTheme {
            AppNavHost()
        }
    }
}