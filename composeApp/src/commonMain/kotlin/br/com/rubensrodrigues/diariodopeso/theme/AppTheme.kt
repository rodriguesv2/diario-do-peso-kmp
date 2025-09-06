package br.com.rubensrodrigues.diariodopeso.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = typography(),
        colorScheme = colorScheme(),
        content = content,
    )
}