package com.hfad.navigationvariationsproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.composenavigationpractice.complex_navigation.AppNavGraph2
import com.example.composenavigationpractice.complex_navigation.AppNavTransitionGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var navController = rememberNavController()
            AppNavTransitionGraph(navController = navController)
        }
    }
}
