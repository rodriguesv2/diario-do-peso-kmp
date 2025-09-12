package br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_data

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import br.com.rubensrodrigues.diariodopeso.navigation.Destination
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates.SignUpTemplate
import br.com.rubensrodrigues.diariodopeso.presentation.shared.compose.LaunchedEffectState
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SignUpDataPage(
    navController: NavController,
    viewModel: SignUpDataViewModel = koinViewModel<SignUpDataViewModel>()
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffectState(viewModel) { state ->
        when (state) {
            SignUpDataState.NavigateBack -> {
                navController.popBackStack()
            }
            is SignUpDataState.ToSignUpPassword -> {
                navController.navigate(
                    route = Destination.SignUpPassword(
                        name = uiState.name,
                        email = uiState.email
                    )
                )
            }
        }

    }

    SignUpTemplate(
        name = uiState.name,
        email = uiState.email,
        isButtonEnabled = uiState.isButtonEnabled,
        onNameChanged = viewModel::onNameChanged,
        onEmailChanged = viewModel::onEmailChanged,
        onBackButtonClick = viewModel::onBackButtonClick,
        onContinueClick = viewModel::onContinueClick,
    )
}