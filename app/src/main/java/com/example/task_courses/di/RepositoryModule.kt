package com.example.task_courses.di

import com.example.data_home.HomeRepositoryImpl
import com.example.data_onboarding.OnboardingRepositoryImpl
import com.example.domain.HomeRepository
import com.example.domain.OnboardingRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<HomeRepository>{
        HomeRepositoryImpl(
            get(),
            get(),
        )
    }
    single<OnboardingRepository> {
        OnboardingRepositoryImpl(
            get()
        )
    }
}