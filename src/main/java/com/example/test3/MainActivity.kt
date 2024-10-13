package com.example.Test3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.sp
import com.example.test3.R
import com.example.test3.ui.theme.Test3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Quatre(
                        stringResource(R.string.qtt1),
                        stringResource(R.string.qtt2),
                        stringResource(R.string.qtt3),
                        stringResource(R.string.qtt4),
                        stringResource(R.string.qud1),
                        stringResource(R.string.qud2),
                        stringResource(R.string.qud3),
                        stringResource(R.string.qud4),
                    )
                }
            }
        }
    }
}

@Composable
fun Quatre( qtt1 : String, qtt2 : String, qtt3: String, qtt4 : String, qud1 : String, qud2 : String, qud3 : String, qud4 : String) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center) {
        //premiere quadrant 1.1
        Row(modifier = Modifier.weight(1f)
        ) {
            //premier cadrant
            Column(modifier = Modifier
                .background(Color(0xFFEADDFF))
                .padding(16.dp)
                .fillMaxSize()
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = qtt1,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = qud1,
                    fontSize = 16.sp
                )
            }
            //deuxieme cadrant 2.1
            Column(modifier = Modifier
                .background(Color(0xFFD0BCFF))
                .padding(16.dp)
                .fillMaxSize()
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text =qtt2 ,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = qud2 ,
                    fontSize = 16.sp
                )
            }
        }
        //premier cadrant 1.2
        Row(modifier = Modifier.weight(1f)
        ) {
            //premier cadrant
            Column(modifier = Modifier
                .background(Color(0xFFB69DF8))
                .padding(16.dp)
                .fillMaxSize()
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = qtt3,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = qud3,
                    fontSize = 16.sp
                )
            }
            //deuxieme cadrant 2.1
            Column(modifier = Modifier.background(Color(0xFFF6EDFF))
                .padding(16.dp)
                .fillMaxSize()
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = qtt4,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = qud4,
                    fontSize = 16.sp
                )
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Test3Theme {
        Quatre(
            stringResource(R.string.qtt1),
            stringResource(R.string.qtt2),
            stringResource(R.string.qtt3),
            stringResource(R.string.qtt4),
            stringResource(R.string.qud1),
            stringResource(R.string.qud2),
            stringResource(R.string.qud3),
            stringResource(R.string.qud4),
        )
    }
}