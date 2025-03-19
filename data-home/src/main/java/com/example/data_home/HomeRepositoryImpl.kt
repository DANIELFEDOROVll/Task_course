package com.example.data_home

import com.example.domain.CourseResponse
import com.example.domain.HomeRepository

class HomeRepositoryImpl: HomeRepository {
    override suspend fun getCourses(): CourseResponse {
        TODO("Not yet implemented")
    }
}