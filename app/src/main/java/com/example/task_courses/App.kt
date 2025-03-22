package com.example.task_courses

import android.app.Application
import com.example.task_courses.di.appModule
import com.example.task_courses.di.repositoryModule
import com.example.task_courses.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@App)
            modules(
                appModule,
                repositoryModule,
                viewModelModule,
            )
            printLogger()
        }
    }
}