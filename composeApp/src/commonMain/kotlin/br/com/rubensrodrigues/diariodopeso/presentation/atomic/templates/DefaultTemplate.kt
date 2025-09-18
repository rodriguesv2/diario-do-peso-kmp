package br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
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
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.organisms.AppBarOrganism
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun DefaultTemplate(
    title: String,
    subtitle: String,
    buttonLabel: String,
    onBackButtonClick: () -> Unit,
    onButtonClick: () -> Unit,
    isButtonEnabled: Boolean = true,
    isButtonLoading: Boolean = false,
    content: @Composable ColumnScope.() -> Unit,
) {
    Scaffold(
        topBar = {
            AppBarOrganism(
                title = title,
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
                text = subtitle,
                fontWeight = FontWeight.Medium
            )
            Margin(32.dp)
            content()
            Expanded()
            ButtonMolecule(
                modifier = Modifier.fillMaxWidth(),
                text = buttonLabel,
                onClick = onButtonClick,
                isEnabled = isButtonEnabled,
                isLoading = isButtonLoading,
            )
        }
    }
}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        DefaultTemplate(
            title = "Título",
            subtitle = "Esse é um sub titulo",
            buttonLabel = "Botão",
            onBackButtonClick = {},
            onButtonClick = {},
            isButtonEnabled = true,
        ) {

        }
    }
}