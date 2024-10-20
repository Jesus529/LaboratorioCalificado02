package com.vargas.kevin.laboratoriocalificado02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import com.vargas.kevin.laboratoriocalificado02.ui.theme.LaboratorioCalificado02Theme

class Ejercicio01 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaboratorioCalificado02Theme {
                // Llama a la UI creada con Compose
                EjercicioUI()
            }
        }
    }
}

@Composable
fun EjercicioUI() {
    var isVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Examen Calificado 02",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White,
            modifier = Modifier.background(Color.DarkGray)
        )

        Spacer(modifier = Modifier.height(16.dp))

        if (isVisible) {
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .background(Color(0xFF004d00))
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(onClick = { isVisible = true }) {
                Text("Mostrar")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Button(onClick = { isVisible = false }) {
                Text("Ocultar")
            }
        }
    }
}
