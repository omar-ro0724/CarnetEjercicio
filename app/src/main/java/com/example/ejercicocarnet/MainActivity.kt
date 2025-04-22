package com.example.ejercicocarnet

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.layout.*
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.material3.*
    import androidx.compose.runtime.*
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.draw.clip
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import coil.compose.AsyncImage
    import coil.compose.rememberAsyncImagePainter
    import com.example.ejercicocarnet.ui.theme.EjercicoCarnetTheme

    data class Mascota(
        val nombre: String,
        val raza: String,
        val tamaño: String,
        val edad: String,
        val fotoUrl: String
    )

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
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