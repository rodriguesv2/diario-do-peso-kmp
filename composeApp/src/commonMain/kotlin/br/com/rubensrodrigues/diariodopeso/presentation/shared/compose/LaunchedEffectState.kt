package br.com.rubensrodrigues.diariodopeso.presentation.shared.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import br.com.rubensrodrigues.diariodopeso.presentation.shared.BaseViewModel

@Composable
fun <T>LaunchedEffectState(
    viewModel: BaseViewModel<T, *>,
    block: suspend (T) -> Unit,
) {
    LaunchedEffect(viewModel) {
        viewModel.state.collect {
            block(it)
        }
    }
}