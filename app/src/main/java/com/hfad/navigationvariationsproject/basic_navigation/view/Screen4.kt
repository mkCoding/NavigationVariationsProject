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
import androidx.compose.material3.Text
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
fun Screen4(navController: NavController){
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Screen 4", fontSize = 40.sp)

        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            Screen4BackButton(navController)
            Spacer(modifier = Modifier.width(8.dp))
//            Screen4NextButton()
        }
    }
}

@Composable
fun Screen4BackButton(navController: NavController){
    Button(
        colors = ButtonDefaults.buttonColors(Color.Black) ,
        modifier = Modifier
            .padding(top = 40.dp)
            .clip(CircleShape)
            .width(170.dp)
            .height(40.dp)
            .clip(CircleShape),

        onClick = { navController.popBackStack()}

    ) {
        Text(text = "Previous", color = Color.White)
    }
}


//@Composable
//fun Screen4NextButton(){
//    Button(
//        colors = ButtonDefaults.buttonColors(Color.Black) ,
//        modifier = Modifier
//            .padding(top = 40.dp)
//            .clip(CircleShape)
//            .width(170.dp)
//            .height(40.dp)
//            .clip(CircleShape),
//        onClick = {   }
//
//    ) {
//        Text(text = "Next", color = Color.White)
//    }
//}




@Preview(showBackground = true)
@Composable
fun PreviewScreen4(){
    val navController = rememberNavController()
    Screen4(navController = navController)
}