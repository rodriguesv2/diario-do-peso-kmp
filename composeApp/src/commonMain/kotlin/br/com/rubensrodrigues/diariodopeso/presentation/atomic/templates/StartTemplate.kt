package br.com.rubensrodrigues.diariodopeso.presentation.atomic.templates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.rubensrodrigues.diariodopeso.repository.TestRepository
import br.com.rubensrodrigues.diariodopeso.theme.AppTheme
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun StartTemplate() {
    val scope = rememberCoroutineScope()

    Scaffold {
        Column(
            Modifier
                .padding(it)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val repository = remember { TestRepository() }
            var name by remember { mutableStateOf("") }
            var email by remember { mutableStateOf("") }

            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = name,
                onValueChange = { name = it },
                placeholder = {
                    Text("Nome")
                },
            )
            Spacer(Modifier.height(16.dp))
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = email,
                onValueChange = { email = it },
                placeholder = {
                    Text("Email")
                },
            )
            Spacer(Modifier.weight(1f))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                onClick = {
                    if (name.isNotBlank() && email.isNotBlank()) {
                        scope.launch {
                            repository.saveData(name, email)
                            name = ""
                            email = ""
                        }
                    }
                },
            ) {
                Text("Enviar".uppercase())
            }
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