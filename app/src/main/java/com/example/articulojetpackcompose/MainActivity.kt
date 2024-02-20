package com.example.articulojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulojetpackcompose.ui.theme.ArticuloJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Inicio(
                        stringResource(R.string.Header),
                        stringResource(R.string.text1),
                        stringResource(R.string.text2)
                    )
                }
            }
        }
    }
}

@Composable
fun Inicio(header: String, text1: String, text2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Column{
            Text(
                text = header,
                fontSize = 24.sp,
                modifier = modifier.padding(16.dp)
            )
            Text(
                text = text1,
                fontSize = 18.sp,
                modifier = modifier.padding(16.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text = text2,
                fontSize = 18.sp,
                modifier = modifier.padding(16.dp),
                textAlign = TextAlign.Justify
            )
        }
        
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticuloJetpackComposeTheme {
        Inicio(
            stringResource(R.string.Header),
            stringResource(R.string.text1),
            stringResource(R.string.text2)
        )
    }
}