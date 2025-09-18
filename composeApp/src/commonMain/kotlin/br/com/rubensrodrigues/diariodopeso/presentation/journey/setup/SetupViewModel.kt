package br.com.rubensrodrigues.diariodopeso.presentation.journey.setup

import br.com.rubensrodrigues.diariodopeso.presentation.shared.BaseViewModel

class SetupViewModel : BaseViewModel<SetupState, SetupUiState>(SetupUiState()) {
    fun onBackButtonClick() {
        emitState(SetupState.Back)
    }

    fun onConfirmClick() {
        //TODO
    }

    fun onHeightValue(height: String) {
        if (height.length > 3) return

        updateUiState {
            it.copy(
                height = height,
                isButtonEnabled = (height.toIntOrNull() ?: 0) in 50..300
            )
        }
    }
}