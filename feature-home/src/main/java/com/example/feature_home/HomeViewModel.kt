package com.example.feature_home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.CourseResponse
import com.example.domain.GetCoursesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getCoursesUseCase: GetCoursesUseCase
): ViewModel(){

    private val _courses = MutableStateFlow<CourseResponse?>(null)
    val courses: StateFlow<CourseResponse?> get() = _courses

    init{
        loadCourses()
    }

    private fun loadCourses(){
        viewModelScope.launch(){
            try{
                val courses = getCoursesUseCase()
                _courses.value = courses
            }
            catch(e: Exception){
                Log.e("!!!error", "${e.message}")
            }
        }
    }
}