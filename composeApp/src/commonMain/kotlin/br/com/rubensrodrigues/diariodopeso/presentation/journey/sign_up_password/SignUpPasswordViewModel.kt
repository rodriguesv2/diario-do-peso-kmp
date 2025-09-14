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
        updateUiState {
            it.copy(password = value)
        }
        validateButtonAndFields()
    }

    fun onConfirmPasswordChanged(value: String) {
        updateUiState {
            it.copy(confirmPassword = value)
        }
        validateButtonAndFields()
    }

    fun onSignUpClick() {

    }

    private fun validateButtonAndFields() {
        val isPasswordValid = uiState.value.password.length >= PASSWORD_MIN_LENGTH
        val isConfirmPasswordValid = uiState.value.password == uiState.value.confirmPassword
        val isButtonEnabled = isPasswordValid && isConfirmPasswordValid

        updateUiState {
            it.copy(
                isButtonEnabled = isButtonEnabled,
                passwordErrorMessage = if (isPasswordValid) null else "A senha deve ter no mínimo $PASSWORD_MIN_LENGTH caracteres",
                confirmPasswordErrorMessage = if (isConfirmPasswordValid) null else "As senhas não coincidem"
            )
        }
    }
}

private const val PASSWORD_MIN_LENGTH = 6