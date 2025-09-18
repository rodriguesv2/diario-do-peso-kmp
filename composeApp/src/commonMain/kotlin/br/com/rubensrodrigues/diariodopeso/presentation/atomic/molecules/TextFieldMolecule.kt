package br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.atoms.EyeIconAtom
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TextFieldMolecule(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    textFieldType: TextFieldType = TextFieldType.GENERIC,
    errorMessage: String? = null,
) {
    var isPasswordVisible by remember { mutableStateOf(false) }

    TextField(
        modifier = modifier,
        value = value,
        keyboardOptions = KeyboardOptions.Default.copy(
            capitalization = when(textFieldType) {
                TextFieldType.NAME -> KeyboardCapitalization.Words
                else -> KeyboardCapitalization.None
            },
            keyboardType = getKeyboardType(textFieldType)
        ),
        onValueChange = onValueChange,
        label = {
            Text(
                text = label,
            )
        },
        visualTransformation = if (textFieldType == TextFieldType.PASSWORD && !isPasswordVisible) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        },
        trailingIcon = if (textFieldType != TextFieldType.PASSWORD) {
            null
        } else {
            {
                EyeIconAtom(isPasswordVisible) {
                    isPasswordVisible = !isPasswordVisible
                }
            }
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            errorContainerColor = Color.Transparent,
        ),
        isError = !errorMessage.isNullOrBlank(),
        supportingText = {
            errorMessage?.let {
                Text(
                    text = it,
                )
            }
        }
    )
}

enum class TextFieldType {
    PASSWORD,
    EMAIL,
    NAME,
    NUMBER,
    GENERIC
}

private fun getKeyboardType(textFieldType: TextFieldType): KeyboardType {
    return when (textFieldType) {
        TextFieldType.PASSWORD -> KeyboardType.Password
        TextFieldType.EMAIL -> KeyboardType.Email
        TextFieldType.NAME -> KeyboardType.Text
        TextFieldType.GENERIC -> KeyboardType.Text
        TextFieldType.NUMBER -> KeyboardType.Number
    }
}

@Composable
@Preview
private fun Preview() {
    var value by remember { mutableStateOf("") }

    AppTheme {
        Box(
            modifier = Modifier
                .background(Color.White)
                .padding(32.dp)
                .fillMaxWidth()
        ) {
            TextFieldMolecule(
                modifier = Modifier.fillMaxWidth(),
                value = value,
                onValueChange = { value = it },
                label = "Label",
                textFieldType = TextFieldType.PASSWORD,
                errorMessage = "Mensagem de erro",
            )
        }
    }
}