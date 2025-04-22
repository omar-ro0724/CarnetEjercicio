package com.example.ejercicocarnet.Carnet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.ejercicocarnet.Mascota

@Composable
fun CarnetScreen(mascota: Mascota) {
    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Carnet", fontSize = 20.sp)

        Image(

            painter = rememberAsyncImagePainter(mascota.fotoUrl),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .clip(RoundedCornerShape(10.dp))
        )

        Text("Nombre: ${mascota.nombre}")
        Text("Raza: ${mascota.raza}")
        Text("Tamaño: ${mascota.tamaño}")
        Text("Edad: ${mascota.edad}")
    }
}