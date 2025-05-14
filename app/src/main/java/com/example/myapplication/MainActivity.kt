package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.composable
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Inicio()
            }
        }
    }
}



@Composable
fun Inicio() {
    Surface(
        modifier = Modifier.fillMaxSize(),

    ) {

        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            Text(
                text = "Hello ",
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(vertical = 16.dp)
            )


            Navbar(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(vertical = 16.dp)
            )


        }
    }
}

@Composable
fun Navbar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(Color.Red, shape = RoundedCornerShape(50.dp))
            .padding(horizontal = 30.dp)
            .height(50.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {
        Button(onClick = { /* Acción al hacer clic */ }) {
            Text("Btn 1")
        }

        Spacer(modifier = Modifier.width(8.dp))
        Button(onClick = { /* Acción al hacer clic */ }) {
            Text("Btn 2")
        }

        Spacer(modifier = Modifier.width(8.dp))

        Button(onClick = { /* Acción al hacer clic */ }) {
            Text("Btn 3")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Inicio()
    }
}