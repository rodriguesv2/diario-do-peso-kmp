package br.com.rubensrodrigues.diariodopeso.presentation.journey.setup

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates.SetupTemplate

@Composable
fun SetupPage(
    navController: NavController,
    viewModel: SetupViewModel = SetupViewModel(),
) {
    val uiState by viewModel.uiState.collectAsState()

    SetupTemplate(
        onBackButtonClick = viewModel::onBackButtonClick,
        onButtonClick = viewModel::onConfirmClick,
        height = uiState.height,
        onHeightValue = viewModel::onHeightValue,
        isLoading = uiState.isLoading,
        isButtonEnabled = uiState.isButtonEnabled,
    )
}