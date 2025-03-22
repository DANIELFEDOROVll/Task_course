package com.example.task_courses.di

import com.example.data_home.CoursesApiService
import com.example.data_home.mappers.CourseDtoToDomainMapper
import com.example.data_home.mappers.CourseResponseDtoToDomainMapper
import com.example.data_onboarding.SharedPreferenceManager
import com.example.domain.GetCoursesUseCase
import com.example.domain.GetFirstScreenUseCase
import com.example.domain.SetFirstLaunchCompletedUseCase
import com.example.task_courses.BASE_URL
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    single<Retrofit> {
        //пока без okHttp клиента
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single<CoursesApiService> { get<Retrofit>().create(CoursesApiService::class.java) }
    single { SharedPreferenceManager(androidContext()) }

    single<CourseDtoToDomainMapper> { CourseDtoToDomainMapper() }
    single<CourseResponseDtoToDomainMapper> { CourseResponseDtoToDomainMapper(get()) }

    //use cases
    single<GetCoursesUseCase>{ GetCoursesUseCase(get()) }
    single<GetFirstScreenUseCase> { GetFirstScreenUseCase(get()) }
    single { SetFirstLaunchCompletedUseCase(get()) }
}