package com.example.task_courses.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.domain.SetFirstLaunchCompletedUseCase
import com.example.feature_home.HomeScreen
import com.example.feature_login.log.LoginScreen
import com.example.feature_login.onboarding.OnboardingScreen
import org.koin.compose.koinInject

@Composable
fun AppNavHost(
    navController: NavHostController,
    screen: String,
    setCompleted: SetFirstLaunchCompletedUseCase
){

        NavHost(navController, screen) {
            composable("home") {
                HomeScreen(navController)
            }

            composable("onboarding") {
                OnboardingScreen(navController)
            }

            composable("login") {
                LoginScreen(navController, setCompleted)
            }
        }

}