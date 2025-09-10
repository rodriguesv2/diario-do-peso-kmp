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
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.organisms.AppBarOrganism
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Res
import diariodopeso.composeapp.generated.resources.sign_up_confirm_password_field
import diariodopeso.composeapp.generated.resources.sign_up_continue
import diariodopeso.composeapp.generated.resources.sign_up_email_field
import diariodopeso.composeapp.generated.resources.sign_up_finish
import diariodopeso.composeapp.generated.resources.sign_up_name_field
import diariodopeso.composeapp.generated.resources.sign_up_password_field
import diariodopeso.composeapp.generated.resources.sign_up_subtitle_data
import diariodopeso.composeapp.generated.resources.sign_up_subtitle_password
import diariodopeso.composeapp.generated.resources.sign_up_title
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun PasswordTemplate(
    onBackButtonClick: () -> Unit,
    password: String,
    onPasswordChanged: (String) -> Unit,
    confirmPassword: String,
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
            )
            Margin()
            TextFieldMolecule(
                modifier = Modifier.fillMaxWidth(),
                label = stringResource(Res.string.sign_up_confirm_password_field),
                value = confirmPassword,
                onValueChange = onConfirmPasswordChanged,
            )
            Expanded()
            ButtonMolecule(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(Res.string.sign_up_finish),
                onClick = onSignUpClick
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
            password = "Beltrano",
            onPasswordChanged = {},
            confirmPassword = "beltrano@gmail.com",
            onConfirmPasswordChanged = {},
            onSignUpClick = {}
        )
    }
}