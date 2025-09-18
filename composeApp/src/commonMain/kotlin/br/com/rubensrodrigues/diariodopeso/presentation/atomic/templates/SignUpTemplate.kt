package br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.rubensrodrigues.diariodopeso.extensions.Margin
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.TextFieldMolecule
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.TextFieldType
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Res
import diariodopeso.composeapp.generated.resources.sign_up_continue
import diariodopeso.composeapp.generated.resources.sign_up_email_field
import diariodopeso.composeapp.generated.resources.sign_up_name_field
import diariodopeso.composeapp.generated.resources.sign_up_subtitle_data
import diariodopeso.composeapp.generated.resources.sign_up_title
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun SignUpTemplate(
    onBackButtonClick: () -> Unit,
    name: String,
    isButtonEnabled: Boolean,
    onNameChanged: (String) -> Unit,
    email: String,
    onEmailChanged: (String) -> Unit,
    onContinueClick: () -> Unit,
    emailErrorMessage: String?,
) {
    DefaultTemplate(
        title = stringResource(Res.string.sign_up_title),
        subtitle = stringResource(Res.string.sign_up_subtitle_data),
        buttonLabel = stringResource(Res.string.sign_up_continue),
        onBackButtonClick = onBackButtonClick,
        onButtonClick = onContinueClick,
        isButtonEnabled = isButtonEnabled,
    ) {
        TextFieldMolecule(
            modifier = Modifier.fillMaxWidth(),
            label = stringResource(Res.string.sign_up_name_field),
            value = name,
            onValueChange = onNameChanged,
            textFieldType = TextFieldType.NAME
        )
        Margin()
        TextFieldMolecule(
            modifier = Modifier.fillMaxWidth(),
            label = stringResource(Res.string.sign_up_email_field),
            value = email,
            onValueChange = onEmailChanged,
            textFieldType = TextFieldType.EMAIL,
            errorMessage = emailErrorMessage,
        )
    }
}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        SignUpTemplate(
            {},
            name = "Beltrano",
            onNameChanged = {},
            email = "beltrano@gmail.com",
            onEmailChanged = {},
            onContinueClick = {},
            isButtonEnabled = true,
            emailErrorMessage = null,
        )
    }
}