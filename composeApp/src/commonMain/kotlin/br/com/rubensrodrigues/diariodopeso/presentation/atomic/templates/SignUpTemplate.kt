package br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import diariodopeso.composeapp.generated.resources.sign_up_continue
import diariodopeso.composeapp.generated.resources.sign_up_email_field
import diariodopeso.composeapp.generated.resources.sign_up_name_field
import diariodopeso.composeapp.generated.resources.sign_up_subtitle_data
import diariodopeso.composeapp.generated.resources.sign_up_title
import org.jetbrains.compose.resources.painterResource
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
                text = stringResource(Res.string.sign_up_subtitle_data),
                fontWeight = FontWeight.Medium
            )
            Margin(32.dp)
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
                textFieldType = TextFieldType.EMAIL
            )
            Expanded()
            ButtonMolecule(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(Res.string.sign_up_continue),
                onClick = onContinueClick,
                isEnabled = isButtonEnabled,
            )
        }
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
        )
    }
}