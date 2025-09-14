package br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_password

data class SignUpPasswordUiState(
    val password: String = "",
    val confirmPassword: String = "",
    val isButtonEnabled: Boolean = false,
    val passwordErrorMessage: String? = null,
    val confirmPasswordErrorMessage: String? = null,
)
