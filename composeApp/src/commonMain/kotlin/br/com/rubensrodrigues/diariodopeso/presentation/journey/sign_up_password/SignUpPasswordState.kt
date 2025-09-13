package br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_password

sealed interface SignUpPasswordState {
    data object NavigateBack : SignUpPasswordState
}