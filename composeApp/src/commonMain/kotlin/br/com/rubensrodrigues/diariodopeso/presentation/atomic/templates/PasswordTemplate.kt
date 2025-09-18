package br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.rubensrodrigues.diariodopeso.extensions.Margin
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.TextFieldMolecule
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.TextFieldType
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
    isLoading: Boolean,
    passwordErrorMessage: String? = null,
    confirmPasswordErrorMessage: String? = null,
    onBackButtonClick: () -> Unit,
    onPasswordChanged: (String) -> Unit,
    onConfirmPasswordChanged: (String) -> Unit,
    onSignUpClick: () -> Unit,
) {
    DefaultTemplate(
        title = stringResource(Res.string.sign_up_title),
        subtitle = stringResource(Res.string.sign_up_subtitle_password),
        buttonLabel = stringResource(Res.string.sign_up_finish),
        onBackButtonClick = onBackButtonClick,
        isButtonEnabled = isButtonEnabled,
        onButtonClick = onSignUpClick,
        isButtonLoading = isLoading,
    ) {
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
            isLoading = false
        )
    }
}