package com.example.domain

interface OnboardingRepository {
    fun getFirstScreen(): String

    fun setFirstLaunchCompleted()
}