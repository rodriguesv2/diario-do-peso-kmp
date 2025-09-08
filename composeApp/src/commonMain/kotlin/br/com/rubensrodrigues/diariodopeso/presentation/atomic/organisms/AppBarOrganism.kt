package br.com.rubensrodrigues.diariodopeso.presentation.atomic.organisms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import br.com.rubensrodrigues.diariodopeso.extensions.Margin
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Res
import diariodopeso.composeapp.generated.resources.ic_arrow_back
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarOrganism() {
    TopAppBar(
        colors = TopAppBarColors(
            containerColor = Color.Transparent,
            scrolledContainerColor = Color.Transparent,
            titleContentColor = Color.White,
            actionIconContentColor = Color.White,
            navigationIconContentColor = Color.White,
        ),
        modifier = Modifier.background(
            Brush.linearGradient(
                colors = listOf(
                    Color(0xFF3894D9),
                    Color(0xFF55B6FF),
                    Color(0xFF3894D9),
                ),
                start = Offset(0f, 0f),
                end = Offset(1000f, 1000f)
            )
        ),
        title = {
            Row {
                Margin()
                Text("Cadastrar")
            }
        },
        navigationIcon = {
            Icon(painter = painterResource(Res.drawable.ic_arrow_back), null)
        }
    )
}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        AppBarOrganism()
    }
}