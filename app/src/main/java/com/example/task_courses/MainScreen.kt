package com.example.task_courses

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.core_ui.DarkGray
import com.example.core_ui.RobotoFontFamily
import com.example.domain.SetFirstLaunchCompletedUseCase
import com.example.task_courses.navigation.AppNavHost
import com.example.task_courses.navigation.NavigationItem

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(screen: String, sc: SetFirstLaunchCompletedUseCase) {
    val navHostController = rememberNavController()
    val currentBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    Scaffold(
        containerColor = Color.Black,
        bottomBar = {
            if(currentRoute !in listOf("onboarding", "login")) {
                BottomNavigation(navHostController)
            }
        },
    ) {
        AppNavHost(navHostController, screen, sc)
    }
}

@Composable
fun BottomNavigation(navController: NavController) {
    val listBottomNavigationItems = listOf(
        NavigationItem.House,
        NavigationItem.Favorites,
        NavigationItem.Profile,
    )
    NavigationBar (
        containerColor = DarkGray,
        contentColor = Color.White,
        modifier = Modifier
            .height(64.dp)
    ) {
        listBottomNavigationItems.forEach { item ->
            NavigationBarItem(
                selected = navController.currentDestination?.route == item.route,
                onClick = {
                    Log.d("HomeScreen.kt", "navController started")
                    val route = item.route
                    navController.navigate(route) {
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(item.iconResId),
                        contentDescription = stringResource(item.titleResId),
                        Modifier.size(24.dp)
                    )
                },
                label = {
                    Text(
                        text = stringResource(id = item.titleResId),
                        fontFamily = RobotoFontFamily
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.White,
                    unselectedIconColor = Color.White,
                    selectedTextColor = Color.White,
                    unselectedTextColor = Color.White,
                    indicatorColor = Color.Transparent
                )

            )
        }
    }
}
