package br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_password

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates.PasswordTemplate
import br.com.rubensrodrigues.diariodopeso.presentation.shared.compose.LaunchedEffectState
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SignUpPasswordPage(
    navController: NavController,
    viewModel: SignUpPasswordViewModel = koinViewModel(),
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffectState(viewModel) { state ->
        when (state) {
            SignUpPasswordState.NavigateBack -> {
                navController.popBackStack()
            }
        }
    }

    PasswordTemplate(
        password = uiState.password,
        confirmPassword = uiState.confirmPassword,
        isButtonEnabled = uiState.isButtonEnabled,
        passwordErrorMessage = uiState.passwordErrorMessage,
        confirmPasswordErrorMessage = uiState.confirmPasswordErrorMessage,
        onBackButtonClick = viewModel::onBackButtonClick,
        onPasswordChanged = viewModel::onPasswordChanged,
        onConfirmPasswordChanged = viewModel::onConfirmPasswordChanged,
        onSignUpClick = viewModel::onSignUpClick,
    )
}