package br.com.rubensrodrigues.diariodopeso.presentation.journey.start

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import br.com.rubensrodrigues.diariodopeso.navigation.Destination
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates.StartTemplate
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Preview
@Composable
fun StartPage(
    navController: NavController,
    viewModel: StartViewModel = koinViewModel(),
) {
    LaunchedEffect(viewModel) {
        viewModel.state.collectLatest { state ->
            when (state) {
                StartState.ToSignUpData -> {
                    navController.navigate(Destination.SignUpData)
                }
            }
        }
    }

    StartTemplate(
        onButtonGoogleClick = {},
        onButtonEmailClick = viewModel::onSignUpClick,
        onLoginClick = {},
        onContinueWithoutLoginClick = {},
    )
}

