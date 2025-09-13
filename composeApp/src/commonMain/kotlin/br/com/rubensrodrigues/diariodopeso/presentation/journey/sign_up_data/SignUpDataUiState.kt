package br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_data

data class SignUpDataUiState(
    val name: String = "",
    val email: String = "",
    val isButtonEnabled: Boolean = false,
    val emailErrorMessage: String? = null,
)
