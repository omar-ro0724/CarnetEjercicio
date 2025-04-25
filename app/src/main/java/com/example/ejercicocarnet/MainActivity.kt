package com.example.ejercicocarnet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ejercicocarnet.Carnet.CarnetScreen
import com.example.ejercicocarnet.Carnet.RegistroScreen
import com.example.ejercicocarnet.ui.theme.EjercicoCarnetTheme


data class Mascota(
    val nombre: String,
    val raza: String,
    val tamanio: String,
    val edad: String,
    val fotoUrl: String
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjercicoCarnetTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    var mascotaRegistrada by remember { mutableStateOf<Mascota?>(null) }

                    if (mascotaRegistrada == null) {
                        RegistroScreen { mascota ->
                            mascotaRegistrada = mascota
                        }
                    } else {
                        CarnetScreen(mascotaRegistrada!!)
                    }
                }
            }
        }
    }
}