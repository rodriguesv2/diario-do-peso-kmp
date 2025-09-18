package br.com.rubensrodrigues.diariodopeso.presentation.journey.setup

import br.com.rubensrodrigues.diariodopeso.presentation.shared.BaseViewModel

class SetupViewModel : BaseViewModel<SetupState, SetupUiState>(SetupUiState()) {
    fun onBackButtonClick() {}
    fun onConfirmClick() {}
    fun onHeightValue(height: String) {}

}