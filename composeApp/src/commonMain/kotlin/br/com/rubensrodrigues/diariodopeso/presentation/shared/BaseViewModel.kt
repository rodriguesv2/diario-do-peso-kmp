package br.com.rubensrodrigues.diariodopeso.presentation.shared

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

open class BaseViewModel<STATE, UISTATE>(
    initialUiState: UISTATE
): ViewModel() {

    private val _uiState = MutableStateFlow(initialUiState)
    val uiState = _uiState.asStateFlow()

    private val _state = MutableSharedFlow<STATE>()
    val state = _state.asSharedFlow()

    protected fun updateUiState(block: (UISTATE) -> UISTATE) {
        _uiState.update {
            block(it)
        }
    }

    protected fun emitState(newState: STATE) {
        viewModelScope.launch {
            _state.emit(newState)
        }
    }
}