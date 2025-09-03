package br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import diariodopeso.composeapp.generated.resources.Montserrat_Regular
import diariodopeso.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font
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
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin feugiat leo bibendum elementum interdum. Proin molestie sagittis erat. Duis in nunc mauris. Vivamus tellus nunc, lobortis feugiat nulla eget, tempor interdum ante. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur commodo sed lectus vestibulum semper. Quisque felis tortor, dignissim quis mauris vitae, scelerisque laoreet sem. Praesent vel sem id massa elementum commodo. Integer et erat eget nulla pellentesque congue.
                """.trimIndent(),
                style = MaterialTheme.typography.headlineLarge
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