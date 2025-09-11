package br.com.rubensrodrigues.diariodopeso.presentation.journey.signUpData

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates.SignUpTemplate
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SignUpDataPage(
    navController: NavController,
    viewModel: SignUpDataViewModel = koinViewModel<SignUpDataViewModel>()
) {
    val uiState by viewModel.uiState.collectAsState()

    SignUpTemplate(
        name = uiState.name,
        email = uiState.email,
        onNameChanged = viewModel::onNameChanged,
        onEmailChanged = viewModel::onEmailChanged,
        onBackButtonClick = viewModel::onBackButtonClick,
        onContinueClick = viewModel::onContinueClick,
    )
}