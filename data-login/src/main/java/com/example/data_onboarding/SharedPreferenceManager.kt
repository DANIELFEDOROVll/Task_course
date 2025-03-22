package com.example.data_onboarding

import android.content.Context

class SharedPreferenceManager(
    private val context: Context
) {
    private val sharedPreferences = context.getSharedPreferences("app_sp", Context.MODE_PRIVATE)

    fun isFirstLaunch(): Boolean {
        return sharedPreferences.getBoolean("is_first_launch", true)
    }

    fun setFirstLaunchCompleted() {
        sharedPreferences.edit().putBoolean("is_first_launch", false).apply()
    }
}