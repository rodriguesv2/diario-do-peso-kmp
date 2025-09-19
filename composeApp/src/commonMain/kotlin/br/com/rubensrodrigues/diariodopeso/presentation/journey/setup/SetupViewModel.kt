package br.com.rubensrodrigues.diariodopeso.presentation.journey.setup

import androidx.lifecycle.viewModelScope
import br.com.rubensrodrigues.diariodopeso.domain.usecases.SetHeightUseCase
import br.com.rubensrodrigues.diariodopeso.presentation.shared.BaseViewModel
import kotlinx.coroutines.launch

class SetupViewModel(
    private val setHeightUseCase: SetHeightUseCase
) : BaseViewModel<SetupState, SetupUiState>(SetupUiState()) {
    fun onBackButtonClick() {
        emitState(SetupState.Back)
    }

    fun onConfirmClick() {
        val height = uiState.value.height.toIntOrNull() ?: return

        viewModelScope.launch {
            updateUiState { it.copy(isLoading = true) }
            setHeightUseCase(height)
                .onSuccess {
                    //TODO
                }.onFailure {
                    //TODO
                }
            updateUiState { it.copy(isLoading = false) }
        }
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