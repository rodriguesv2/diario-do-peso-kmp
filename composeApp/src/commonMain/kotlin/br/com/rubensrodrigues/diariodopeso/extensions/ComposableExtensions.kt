package br.com.rubensrodrigues.diariodopeso.extensions

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RowScope.Margin(size: Dp = 16.dp) {
    Spacer(Modifier.width(size))
}

@Composable
fun ColumnScope.Margin(size: Dp = 16.dp) {
    Spacer(Modifier.height(size))
}

@Composable
fun ColumnScope.Expanded(weight: Float = 1f) {
    Spacer(Modifier.weight(weight))
}

@Composable
fun RowScope.Expanded(weight: Float = 1f) {
    Spacer(Modifier.weight(weight))
}



