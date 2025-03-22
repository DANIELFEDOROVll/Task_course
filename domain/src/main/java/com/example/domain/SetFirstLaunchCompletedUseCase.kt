package com.example.domain

class SetFirstLaunchCompletedUseCase(
    private val repo: OnboardingRepository
) {
    operator fun invoke(){
        repo.setFirstLaunchCompleted()
    }
}