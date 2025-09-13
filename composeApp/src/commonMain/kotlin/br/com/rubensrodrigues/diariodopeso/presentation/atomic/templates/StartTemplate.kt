package br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import br.com.rubensrodrigues.diariodopeso.extensions.Margin
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.ButtonMolecule
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Res
import diariodopeso.composeapp.generated.resources.ic_google
import diariodopeso.composeapp.generated.resources.logo
import diariodopeso.composeapp.generated.resources.start_already_have_account
import diariodopeso.composeapp.generated.resources.start_continue_without_login
import diariodopeso.composeapp.generated.resources.start_do_login
import diariodopeso.composeapp.generated.resources.start_email_button
import diariodopeso.composeapp.generated.resources.start_google_button
import diariodopeso.composeapp.generated.resources.start_or
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun StartTemplate(
    onButtonGoogleClick: () -> Unit,
    onButtonEmailClick: () -> Unit,
    onLoginClick: () -> Unit,
    onContinueWithoutLoginClick: () -> Unit,
) {
    Scaffold {
        Column(
            Modifier
                .padding(it)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                modifier = Modifier
                    .padding(all = 48.dp),
                painter = painterResource(Res.drawable.logo),
                contentDescription = null,
            )
            Spacer(Modifier.weight(1f))
            ButtonMolecule(
                modifier = Modifier
                    .fillMaxWidth(),
                text = stringResource(Res.string.start_google_button),
                icon = {
                    Image(
                        painter = painterResource(Res.drawable.ic_google),
                        contentDescription = null,
                    )
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black.copy(alpha = 0.54f)
                ),
                onClick = onButtonGoogleClick,
            )
            Margin()
            Text(
                stringResource(Res.string.start_or),
                style = MaterialTheme.typography.titleLarge
            )
            Margin()
            ButtonMolecule(
                modifier = Modifier
                    .fillMaxWidth(),
                text = stringResource(Res.string.start_email_button),
                onClick = onButtonEmailClick,
            )
            Margin(20.dp)
            Text(
                modifier = Modifier.clickable(onClick = onLoginClick),
                text = getAlreadyHaveAccountText(),
                style = MaterialTheme.typography.titleMedium,
            )
            Margin(20.dp)
            Text(
                modifier = Modifier.clickable(onClick = onContinueWithoutLoginClick),
                text = stringResource(Res.string.start_continue_without_login),
                style = MaterialTheme.typography.titleMedium,
                textDecoration = TextDecoration.Underline,
            )
            Margin()
        }
    }
}

@Composable
private fun getAlreadyHaveAccountText(): AnnotatedString {
    return buildAnnotatedString {
        append(stringResource(Res.string.start_already_have_account))
        append(" ")
        withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
            append(stringResource(Res.string.start_do_login))
        }
    }
}

@Preview
@Composable
private fun Preview() {
    AppTheme {
        StartTemplate(
            onButtonGoogleClick = {},
            onButtonEmailClick = {},
            onLoginClick = {},
            onContinueWithoutLoginClick = {},
        )
    }
}