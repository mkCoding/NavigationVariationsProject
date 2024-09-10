package com.example.composenavigationpractice.complex_navigation

import androidx.compose.animation.Crossfade
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hfad.navigationvariationsproject.basic_navigation_transitions.view.TransitionScreen1
import com.hfad.navigationvariationsproject.basic_navigation_transitions.view.TransitionScreen2
import com.hfad.navigationvariationsproject.basic_navigation_transitions.view.TransitionScreen3
import com.hfad.navigationvariationsproject.basic_navigation_transitions.view.TransitionScreen4

@Composable
fun AppNavTransitionGraph(navController: NavHostController){

    NavHost(navController = navController, startDestination ="transition_screen1" ) {
        composable("transition_screen1",
            enterTransition = { slideInHorizontally { it } },
//            exitTransition = { slideOutHorizontally { -it } },
//            popEnterTransition = { slideInHorizontally { -it } },
//            popExitTransition = { slideOutHorizontally { it } }

        ){
            TransitionScreen1(navController)
        }
        composable("transition_screen2"){
            TransitionScreen2(navController)
        }
        composable("transition_screen3"){
            TransitionScreen3(navController)
        }
        composable("transition_screen4"){
            TransitionScreen4(navController)
        }

    }
}

@Composable
fun CrossfadeScreen2() {
    Crossfade(targetState = true, label = "") { jjj ->
        val x = jjj

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Transition Screen 2", fontSize = 30.sp)
        }
    }
}