package br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TextFieldMolecule(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
) {
    TextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                text = label,
            )
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent
        )
    )
}

@Composable
@Preview
private fun Preview() {
    var value by remember { mutableStateOf("") }

    AppTheme {
        Box(modifier = Modifier
            .background(Color.White)
            .padding(32.dp)
        ) {
            TextFieldMolecule(
                value = value,
                onValueChange = { value = it },
                label = "Label",
            )
        }
    }
}