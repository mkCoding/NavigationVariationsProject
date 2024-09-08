package com.example.composenavigationpractice.complex_navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Screen1(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Screen 1", fontSize = 40.sp)

        Row {
            Spacer(modifier = Modifier.width(8.dp))
            Screen1NextButton(navController)
        }

    }
}

@Composable
fun Screen1NextButton(navController: NavController){
    Button(
        colors = ButtonDefaults.buttonColors(Color.Black) ,
        modifier = Modifier
            .padding(top = 40.dp)
            .clip(CircleShape)
            .width(170.dp)
            .height(40.dp)
            .clip(CircleShape),
        onClick = { navController.navigate("screen2") }

    ) {
        Text(text = "Next", color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScreen1() {
    val navController = rememberNavController()
    Screen1(navController= navController)
}