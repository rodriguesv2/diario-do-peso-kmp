package br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_password

import br.com.rubensrodrigues.diariodopeso.presentation.shared.BaseViewModel

class SignUpPasswordViewModel(
    private val email: String,
    private val name: String,
) : BaseViewModel<SignUpPasswordState, SignUpPasswordUiState>(
    initialUiState = SignUpPasswordUiState()
) {
    fun onBackButtonClick() {
        emitState(SignUpPasswordState.NavigateBack)
    }

    fun onPasswordChanged(value: String) {
        updateUiState{
            it.copy(password = value)
        }
        validateButton()
    }

    fun onConfirmPasswordChanged(value: String) {
        updateUiState{
            it.copy(confirmPassword = value)
        }
        validateButton()
    }

    fun onSignUpClick() {

    }

    private fun validateButton() {
        val isButtonEnabled = uiState.value.password.length >= PASSWORD_MIN_LENGTH
                && uiState.value.password == uiState.value.confirmPassword

        updateUiState { it.copy(isButtonEnabled = isButtonEnabled) }
    }
}

private const val PASSWORD_MIN_LENGTH = 6