package br.com.rubensrodrigues.diariodopeso.presentation.journey.start

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class StartViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(StartUiState())
    val uiState = _uiState.asStateFlow()

    private val _state = MutableSharedFlow<StartState>()
    val state = _state.asSharedFlow()

    fun onSignUpClick() {
        viewModelScope.launch {
            _state.emit(StartState.ToSignUpData)
        }
    }
}