package br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.ButtonMolecule
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Res
import diariodopeso.composeapp.generated.resources.ic_google
import diariodopeso.composeapp.generated.resources.logo
import diariodopeso.composeapp.generated.resources.start_google_button
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun StartTemplate() {
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
                onClick = {},
            )

        }
    }
}

@Preview
@Composable
private fun Preview() {
    AppTheme {
        StartTemplate()
    }
}