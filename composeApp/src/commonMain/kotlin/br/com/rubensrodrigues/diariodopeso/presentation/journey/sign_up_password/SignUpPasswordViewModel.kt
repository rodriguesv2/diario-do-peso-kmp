package br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_password

import androidx.lifecycle.viewModelScope
import br.com.rubensrodrigues.diariodopeso.domain.usecases.SignUpUseCase
import br.com.rubensrodrigues.diariodopeso.presentation.shared.BaseViewModel
import kotlinx.coroutines.launch

class SignUpPasswordViewModel(
    private val email: String,
    private val name: String,
    private val signUpUseCase: SignUpUseCase,
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
        viewModelScope.launch {
            signUpUseCase(
                name = name,
                email = email,
                password = uiState.value.password,
            ).onSuccess {
                //TODO
            }.onFailure {
                //TODO
            }
        }
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