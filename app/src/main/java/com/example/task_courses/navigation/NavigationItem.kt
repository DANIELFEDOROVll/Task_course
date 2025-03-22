package com.example.task_courses.navigation

import com.example.task_courses.R

sealed class NavigationItem(
    val route: String,
    val iconResId: Int,
    val titleResId: Int
) {
    data object House: NavigationItem(
        route = "home",
        iconResId = com.example.core_ui.R.drawable.house,
        titleResId = R.string.house
    )


    data object Favorites: NavigationItem(
        route = "search_screen",
        iconResId = com.example.core_ui.R.drawable.bookmark,
        titleResId = R.string.favorites
    )

    data object Profile: NavigationItem(
        route = "profile_screen",
        iconResId = com.example.core_ui.R.drawable.person,
        titleResId = R.string.profile
    )
}