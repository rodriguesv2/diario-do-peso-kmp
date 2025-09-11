package br.com.rubensrodrigues.diariodopeso.presentation.journey.signUpData

import br.com.rubensrodrigues.diariodopeso.presentation.shared.BaseViewModel

class SignUpDataViewModel : BaseViewModel<SignUpDataState, SignUpDataUiState>(
    SignUpDataUiState()
) {

    fun onNameChanged(name: String) {
        updateUiState { it.copy(name = name) }
        setButtonEnabled()
    }

    fun onEmailChanged(email: String) {
        updateUiState { it.copy(email = email) }
        setButtonEnabled()
    }

    private fun setButtonEnabled() {
        val isButtonEnabled = uiState.value.name.isNotEmpty() && uiState.value.email.isNotEmpty()
        updateUiState { it.copy(isButtonEnabled = isButtonEnabled) }
    }

    fun onContinueClick() {
        emitState(
            SignUpDataState.ToSignUpPassword(
                name = uiState.value.name,
                email = uiState.value.email
            ),
        )
    }

    fun onBackButtonClick() {
        emitState(
            SignUpDataState.NavigateBack
        )
    }
}