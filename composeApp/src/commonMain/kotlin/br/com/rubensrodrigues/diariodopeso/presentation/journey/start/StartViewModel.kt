package br.com.rubensrodrigues.diariodopeso.presentation.journey.start

import br.com.rubensrodrigues.diariodopeso.presentation.shared.BaseViewModel

class StartViewModel : BaseViewModel<StartState, StartUiState>(StartUiState()) {
    fun onSignUpClick() {
        emitState(StartState.ToSignUpData)
    }
}