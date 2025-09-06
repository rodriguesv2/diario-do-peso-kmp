package br.com.rubensrodrigues.diariodopeso.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object Colors {
    val primary = Color(0xFF3894D9)
    val primaryVariant = Color(0xFF3700B3)
    val secondary = Color(0xFF03DAC6)
    val secondaryVariant = Color(0xFF018786)
    val background = Color(0xFFFFFFFF)
    val surface = Color(0xFFF9F9F9)
    val error = Color(0xFFB00020)
    val onPrimary = Color(0xFFFFFFFF)
    val onSecondary = Color(0xFF000000)
    val onBackground = Color(0xFF000000)
    val onSurface = Color(0xFF000000)
    val onError = Color(0xFFFFFFFF)
}

@Composable
fun colorScheme() = MaterialTheme.colorScheme.copy(
    primary = Colors.primary,
    onPrimary = Colors.onPrimary,
    primaryContainer = Colors.primaryVariant,
    secondary = Colors.secondary,
    onSecondary = Colors.onSecondary,
    secondaryContainer = Colors.secondaryVariant,
    background = Colors.background,
    onBackground = Colors.onBackground,
    surface = Colors.surface,
    onSurface = Colors.onSurface,
    error = Colors.error,
    onError = Colors.onError,
)