package br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import br.com.rubensrodrigues.diariodopeso.extensions.Expanded
import br.com.rubensrodrigues.diariodopeso.extensions.Margin
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.ButtonMolecule
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.TextFieldMolecule
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.TextFieldType
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.organisms.AppBarOrganism
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Res
import diariodopeso.composeapp.generated.resources.sign_up_confirm_password_field
import diariodopeso.composeapp.generated.resources.sign_up_finish
import diariodopeso.composeapp.generated.resources.sign_up_password_field
import diariodopeso.composeapp.generated.resources.sign_up_subtitle_password
import diariodopeso.composeapp.generated.resources.sign_up_title
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun PasswordTemplate(
    password: String,
    confirmPassword: String,
    isButtonEnabled: Boolean,
    passwordErrorMessage: String? = null,
    confirmPasswordErrorMessage: String? = null,
    onBackButtonClick: () -> Unit,
    onPasswordChanged: (String) -> Unit,
    onConfirmPasswordChanged: (String) -> Unit,
    onSignUpClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            AppBarOrganism(
                title = stringResource(Res.string.sign_up_title),
                onBackButtonClick = onBackButtonClick,
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .padding(24.dp)
        ) {
            Text(
                text = stringResource(Res.string.sign_up_subtitle_password),
                fontWeight = FontWeight.Medium
            )
            Margin(32.dp)
            TextFieldMolecule(
                modifier = Modifier.fillMaxWidth(),
                label = stringResource(Res.string.sign_up_password_field),
                value = password,
                onValueChange = onPasswordChanged,
                textFieldType = TextFieldType.PASSWORD,
                errorMessage = passwordErrorMessage,
            )
            Margin()
            TextFieldMolecule(
                modifier = Modifier.fillMaxWidth(),
                label = stringResource(Res.string.sign_up_confirm_password_field),
                value = confirmPassword,
                onValueChange = onConfirmPasswordChanged,
                textFieldType = TextFieldType.PASSWORD,
                errorMessage = confirmPasswordErrorMessage,
            )
            Expanded()
            ButtonMolecule(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(Res.string.sign_up_finish),
                onClick = onSignUpClick,
                isEnabled = isButtonEnabled,
            )
        }
    }
}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        PasswordTemplate(
            onBackButtonClick = {},
            password = "123456",
            onPasswordChanged = {},
            confirmPassword = "123456",
            onConfirmPasswordChanged = {},
            onSignUpClick = {},
            isButtonEnabled = true,
        )
    }
}