package br.com.rubensrodrigues.diariodopeso.presentation.journey.signUpData

data class SignUpDataUiState(
    val name: String = "",
    val email: String = "",
    val isButtonEnabled: Boolean = false,
)
