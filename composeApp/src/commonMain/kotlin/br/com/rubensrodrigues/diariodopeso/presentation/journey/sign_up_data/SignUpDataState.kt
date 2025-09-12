package br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_data

sealed interface SignUpDataState {
    data object NavigateBack : SignUpDataState
    data class ToSignUpPassword(val name: String, val email: String) : SignUpDataState
}