package br.com.rubensrodrigues.diariodopeso.presentation.journey.start

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.rubensrodrigues.diariodopeso.presentation.shared.BaseViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class StartViewModel : BaseViewModel<StartState, StartUiState>(StartUiState()) {
    fun onSignUpClick() {
        emitState(StartState.ToSignUpData)
    }
}