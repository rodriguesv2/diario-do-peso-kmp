package br.com.rubensrodrigues.diariodopeso.presentation.atomic.atoms

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Res
import diariodopeso.composeapp.generated.resources.ic_eye
import diariodopeso.composeapp.generated.resources.ic_eye_off
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun EyeIconAtom(
    isPasswordVisible: Boolean = false,
    onClick: () -> Unit,
) {
    IconButton(
        onClick = onClick,
    ) {
        Icon(
            painter = painterResource(
                if (isPasswordVisible) {
                    Res.drawable.ic_eye
                } else {
                    Res.drawable.ic_eye_off
                }
            ),
            contentDescription = null,
        )
    }
}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        EyeIconAtom() {}
    }
}