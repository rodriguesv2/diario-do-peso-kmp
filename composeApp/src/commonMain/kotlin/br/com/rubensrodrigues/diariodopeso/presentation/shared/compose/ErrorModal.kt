package br.com.rubensrodrigues.diariodopeso.presentation.shared.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import br.com.rubensrodrigues.diariodopeso.extensions.Margin
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.ButtonMolecule
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Res
import diariodopeso.composeapp.generated.resources.error_modal_button
import diariodopeso.composeapp.generated.resources.error_modal_message
import diariodopeso.composeapp.generated.resources.error_modal_title
import diariodopeso.composeapp.generated.resources.ic_alert
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun ErrorModal(
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    errorMessage: String? = null,
) {
    Dialog(
        onDismissRequest = onDismiss,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Margin()
            Icon(
                painter = painterResource(Res.drawable.ic_alert),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.error
            )
            Margin()
            Text(
                text = stringResource(Res.string.error_modal_title),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold
            )
            Margin()
            Text(
                modifier = Modifier.padding(horizontal = 32.dp),
                text = errorMessage ?: stringResource(Res.string.error_modal_message),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold
            )
            Margin()
            ButtonMolecule(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                text = stringResource(Res.string.error_modal_button),
                onClick = onButtonClick,
            )
        }
    }
}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        Scaffold {
            ErrorModal(
                onButtonClick = {},
                onDismiss = {},
            )
        }
    }
}