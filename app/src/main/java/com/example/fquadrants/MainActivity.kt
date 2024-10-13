package com.example.Fquadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fquadrants.R
import com.example.fquadrants.ui.theme.FquadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FquadrantsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Fquadrant()
                }
            }
        }
    }
}

@Composable
fun Fquadrant() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.Center, // Centrer les éléments horizontalement
            verticalAlignment = Alignment.CenterVertically // Centrer les éléments verticalement
        ) {
            FQ_app(
                Title = stringResource(R.string.T1),
                content = stringResource(R.string.C1),
                fcolor = Color(color = 0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            FQ_app(
                Title = stringResource(R.string.T2),
                content = stringResource(R.string.C2),
                fcolor = Color(color = 0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            FQ_app(
                Title = stringResource(R.string.T3),
                content = stringResource(R.string.C3),
                fcolor = Color(color = 0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            FQ_app(
                Title = stringResource(R.string.T4),
                content = stringResource(R.string.C4),
                fcolor = Color(color = 0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun FQ_app(Title: String, content: String, fcolor: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(fcolor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = Title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FQ_appPreview() {
    FquadrantsTheme {
        Fquadrant()
    }
}
