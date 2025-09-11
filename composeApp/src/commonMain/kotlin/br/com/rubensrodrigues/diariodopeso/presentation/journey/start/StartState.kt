package br.com.rubensrodrigues.diariodopeso.presentation.journey.start

sealed interface StartState {
    data object ToSignUpData : StartState
}