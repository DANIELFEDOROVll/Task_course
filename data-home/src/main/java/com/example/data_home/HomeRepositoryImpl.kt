package com.example.data_home

import com.example.domain.CourseResponse
import com.example.domain.HomeRepository

class HomeRepositoryImpl(
    private val api: CoursesApiService
): HomeRepository {
    override suspend fun getCourses(): CourseResponse {
        return api.getCourses()
    }
}