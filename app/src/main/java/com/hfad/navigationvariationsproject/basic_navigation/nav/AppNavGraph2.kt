package com.example.composenavigationpractice.complex_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph2(navController: NavHostController){

    NavHost(navController = navController, startDestination ="screen1" ) {
        composable("screen1"){
            Screen1(navController)
        }
        composable("screen2"){
            Screen2(navController)
        }
        composable("screen3"){
            Screen3(navController)
        }

        composable("screen4"){
            Screen4(navController)
        }

    }
}