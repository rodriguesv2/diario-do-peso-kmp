package br.com.rubensrodrigues.diariodopeso.presentation.atomic.molecules

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Res
import diariodopeso.composeapp.generated.resources.ic_google
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun ButtonMolecule(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: @Composable (() -> Unit)? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    isLoading: Boolean = false,
) {
    Button(
        modifier = modifier.height(50.dp),
        shape = RoundedCornerShape(12.dp),
        onClick = onClick,
        colors = colors,
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
    ) {
        if (isLoading) {
            CircularProgressIndicator(
                Modifier.size(28.dp),
                color = colors.contentColor,
                strokeWidth = 3.dp
            )
            return@Button
        }
        if (icon != null) {
            icon()
            Spacer(Modifier.width(16.dp))
        }
        Text(
            text = text,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        ButtonMolecule(
            modifier = Modifier.fillMaxWidth(),
            text = "Continuar com E-mail",
            onClick = {},
        )
    }
}

@Composable
@Preview
private fun PreviewLoading() {
    AppTheme {
        ButtonMolecule(
            modifier = Modifier.fillMaxWidth(),
            text = "Continuar com E-mail",
            onClick = {},
            isLoading = true,
        )
    }
}

@Composable
@Preview
private fun PreviewWhite() {
    AppTheme {
        ButtonMolecule(
            modifier = Modifier.fillMaxWidth(),
            text = "Continuar com E-mail",
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black.copy(alpha = 0.54f),
            ),
            icon = {
                Image(
                    painter = painterResource(Res.drawable.ic_google),
                    contentDescription = null,
                )
            },
            onClick = {},
        )
    }
}