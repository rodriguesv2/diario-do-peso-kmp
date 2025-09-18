package br.com.rubensrodrigues.diariodopeso.presentation.journey.setup

data class SetupUiState(
    val isLoading: Boolean = false,
    val isButtonEnabled: Boolean = false,
    val height: String = "",
)