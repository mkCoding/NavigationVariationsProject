package com.hfad.navigationvariationsproject.basic_navigation_transitions.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun TransitionScreen2(navController: NavController){

    Column(
        modifier = Modifier
            .padding(16.dp)
            .border(2.dp, Color.Black, RoundedCornerShape(16.dp)) // Border around the screen
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Transition Screen 2", fontSize = 30.sp)

        Row {
            TransitionScreen2BackButton(navController)
            Spacer(modifier = Modifier.width(8.dp))
            TransitionScreen2NextButton(navController)
        }
    }

}


@Composable
fun TransitionScreen2NextButton(navController: NavController){
    Button(
        colors = ButtonDefaults.buttonColors(Color.Black) ,
        modifier = Modifier
            .padding(top = 40.dp)
            .clip(CircleShape)
            .width(170.dp)
            .height(40.dp)
            .clip(CircleShape),
        onClick = { navController.navigate("transition_screen3") }

    ) {
        Text(text = "Next", color = Color.White)
    }
}

@Composable
fun TransitionScreen2BackButton(navController: NavController){
    Button(
        colors = ButtonDefaults.buttonColors(Color.Black) ,
        modifier = Modifier
            .padding(top = 40.dp)
            .clip(CircleShape)
            .width(170.dp)
            .height(40.dp)
            .clip(CircleShape),
        onClick = { navController.popBackStack() }

    ) {
        Text(text = "Previous", color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun TransitionPreviewScreen2(){
    val navController = rememberNavController()

    TransitionScreen2(navController = navController)
}