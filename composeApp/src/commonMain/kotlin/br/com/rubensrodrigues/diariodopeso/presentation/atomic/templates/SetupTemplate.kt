package br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.TextFieldMolecule
import br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules.TextFieldType
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Res
import diariodopeso.composeapp.generated.resources.setup_confirm
import diariodopeso.composeapp.generated.resources.setup_height
import diariodopeso.composeapp.generated.resources.setup_subtitle
import diariodopeso.composeapp.generated.resources.setup_title
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun SetupTemplate(
    onBackButtonClick: () -> Unit,
    onButtonClick: () -> Unit,
    height: String,
    onHeightValue: (String) -> Unit,
    isLoading: Boolean,
    isButtonEnabled: Boolean,
) {
    DefaultTemplate(
        title = stringResource(Res.string.setup_title),
        subtitle = stringResource(Res.string.setup_subtitle),
        onBackButtonClick = onBackButtonClick,
        isButtonLoading = isLoading,
        buttonLabel = stringResource(Res.string.setup_confirm),
        onButtonClick = onButtonClick,
        isButtonEnabled = isButtonEnabled,
    ) {
        TextFieldMolecule(
            modifier = Modifier.fillMaxWidth(),
            label = stringResource(Res.string.setup_height),
            value = height,
            onValueChange = onHeightValue,
            textFieldType = TextFieldType.NAME
        )
    }
}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        SetupTemplate(
            onBackButtonClick = {},
            onButtonClick = {},
            height = "",
            onHeightValue = {},
            isLoading = false,
            isButtonEnabled = false,
        )
    }
}