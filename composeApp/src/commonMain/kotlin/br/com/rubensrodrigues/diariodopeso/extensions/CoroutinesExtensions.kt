package br.com.rubensrodrigues.diariodopeso.extensions

import kotlinx.coroutines.CoroutineScope

fun <T>CoroutineScope.launchIO(
    block: suspend CoroutineScope.() -> T,
    onLoading: (() -> Unit)? = null,
    onSuccess: ((T) -> Unit)? = null,
    onError: ((Throwable) -> Unit)? = null,
) {

}