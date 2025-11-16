package com.example.a4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Можно использовать твой дефолтный тему-пакет, но так тоже ок
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProductBanner()
                }
            }
        }
    }
}

@Composable
fun ProductBanner() {
    val imageUrl = "https://www.studyinfinland.fi/sites/default/files/styles/logo_image/public/2020-09/Savonia_EN_800x800.png?itok=n6zFXZO-"

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Фоновая картинка
        AsyncImage(
            model = imageUrl,
            contentDescription = "Product Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Fit
        )

        // Затемнение
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0x80000000))
        )

        // Текст
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "SmartFit Pro Watch",
                fontSize = 32.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Savonia Tech Innovations",
                fontSize = 20.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Contact: info@savoniatech.com | +358 123 456 789",
                fontSize = 14.sp,
                color = Color.White
            )
        }
    }
}

