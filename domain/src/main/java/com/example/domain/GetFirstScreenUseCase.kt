package com.example.domain

class GetFirstScreenUseCase(
    private val repo: OnboardingRepository
) {
    operator fun invoke(): String{
        return repo.getFirstScreen()
    }
}