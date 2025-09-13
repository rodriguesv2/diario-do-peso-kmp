package br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_data

import br.com.rubensrodrigues.diariodopeso.presentation.shared.BaseViewModel
import br.com.rubensrodrigues.diariodopeso.utils.isEmail

class SignUpDataViewModel() : BaseViewModel<SignUpDataState, SignUpDataUiState>(
    SignUpDataUiState()
) {

    init {
        setButtonEnabled()
    }

    fun onNameChanged(name: String) {
        updateUiState { it.copy(name = name) }
        setButtonEnabled()
    }

    fun onEmailChanged(email: String) {
        updateUiState {
            it.copy(
                email = email,
                emailErrorMessage = if (email.isEmail() || email.isEmpty()) null else "E-mail inválido"
            )
        }
        setButtonEnabled()
    }

    private fun setButtonEnabled() {
        val isButtonEnabled = uiState.value.name.isNotEmpty() && uiState.value.email.isEmail()
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