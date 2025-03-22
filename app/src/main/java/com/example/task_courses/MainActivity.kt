package com.example.task_courses


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.domain.GetFirstScreenUseCase
import com.example.domain.SetFirstLaunchCompletedUseCase
import org.koin.android.ext.android.inject
import org.koin.compose.koinInject


class MainActivity : ComponentActivity() {
    val getFirstScreen: GetFirstScreenUseCase by inject()
    val setCompleted: SetFirstLaunchCompletedUseCase by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            MainScreen(getFirstScreen(), setCompleted)
        }
    }
}
